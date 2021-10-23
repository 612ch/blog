package com.demon.blog.mapper;

import com.demon.blog.pojo.Article;
import tk.mybatis.mapper.common.Mapper;

public interface ArticleMapper extends Mapper<Article> {

    int deleteByPrimaryKey(Integer artId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer artId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}