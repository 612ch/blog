package com.demon.blog.service.impl;

import com.demon.blog.mapper.ArticleMapper;
import com.demon.blog.pojo.Article;
import com.demon.blog.service.ArticleService;
import com.demon.blog.utils.CheckUtil;
import com.demon.blog.utils.Result;
import com.demon.blog.vo.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @ClassName ArticleService
 * @Descriotion
 * @Author Demon
 * @Date 2021/10/23 17:12
 **/
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleMapper articleMapper;

    @Override
    public Result queryArticleByPage(Integer pageIndex, Integer pageSize, String search) {
        //分页
        if (-1 == pageSize) {
            pageSize = 999;
        }
        PageHelper.startPage(pageIndex, pageSize);
        Example example = new Example(Article.class);
        Example.Criteria criteria = example.createCriteria();
        if (!CheckUtil.isNull(search)){
            //过滤条件
            criteria.orLike("artTitle", "%" + search + "%")
                    .orLike("artKeyword", "%" + search + "%")
                    .orLike("artContent", "%" + search + "%")
                    .orLike("artAlias", "%" + search + "%");
        }
        //删除标记
        criteria.andEqualTo("delFlag", "0");
        List<Article> list = articleMapper.selectByExample(example);
        PageInfo<Article> pageInfo = new PageInfo<>(list);
        Page<Article> page = new Page<Article>(pageIndex, pageSize, pageInfo.getTotal(), list);
        return Result.ok(page);
    }
}
