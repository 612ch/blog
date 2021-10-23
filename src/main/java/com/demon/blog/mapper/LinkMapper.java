package com.demon.blog.mapper;

import com.demon.blog.pojo.Config;
import com.demon.blog.pojo.Link;
import tk.mybatis.mapper.common.Mapper;

public interface LinkMapper extends Mapper<Config> {
    int deleteByPrimaryKey(String linkId);

    int insert(Link record);

    int insertSelective(Link record);

    Link selectByPrimaryKey(String linkId);

    int updateByPrimaryKeySelective(Link record);

    int updateByPrimaryKey(Link record);
}