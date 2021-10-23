package com.demon.blog.mapper;

import com.demon.blog.pojo.Category;
import com.demon.blog.pojo.Comment;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

public interface CommentMapper extends Mapper<Comment> {
    int deleteByPrimaryKey(Integer commId);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Integer commId);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    int updateByPrimaryKey(Comment record);
}