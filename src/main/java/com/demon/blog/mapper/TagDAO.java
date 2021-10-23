package com.demon.blog.mapper;

import com.demon.blog.pojo.Tag;
import tk.mybatis.mapper.common.Mapper;

public interface TagDAO extends Mapper<Tag> {
    int deleteByPrimaryKey(Integer tagId);

    int insert(Tag record);

    int insertSelective(Tag record);

    Tag selectByPrimaryKey(Integer tagId);

    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKey(Tag record);
}