package com.demon.blog.mapper;

import com.demon.blog.pojo.Article;
import com.demon.blog.pojo.Category;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

public interface CategoryMapper extends Mapper<Category> {
    int deleteByPrimaryKey(Integer cateId);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer cateId);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}