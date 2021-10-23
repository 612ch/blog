package com.demon.blog.mapper;

import com.demon.blog.pojo.Config;
import tk.mybatis.mapper.common.Mapper;


public interface ConfigMapper extends Mapper<Config> {
    int deleteByPrimaryKey(Integer confId);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Integer confId);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}