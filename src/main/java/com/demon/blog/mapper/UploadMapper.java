package com.demon.blog.mapper;

import com.demon.blog.pojo.Upload;
import tk.mybatis.mapper.common.Mapper;

public interface UploadMapper extends Mapper<Upload> {
    int deleteByPrimaryKey(Integer ulId);

    int insert(Upload record);

    int insertSelective(Upload record);

    Upload selectByPrimaryKey(Integer ulId);

    int updateByPrimaryKeySelective(Upload record);

    int updateByPrimaryKey(Upload record);
}