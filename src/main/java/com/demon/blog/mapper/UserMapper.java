package com.demon.blog.mapper;

import com.demon.blog.pojo.Upload;
import com.demon.blog.pojo.User;
import tk.mybatis.mapper.common.Mapper;

public interface UserMapper extends Mapper<Upload> {
    int deleteByPrimaryKey(Integer uId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}