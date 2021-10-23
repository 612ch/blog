package com.demon.blog.service;

import com.demon.blog.utils.Result;

/**
 * @ClassName ArticleService
 * @Descriotion
 * @Author Demon
 * @Date 2021/10/23 17:12
 **/

public interface ArticleService {

    Result queryArticleByPage(Integer pageIndex, Integer pageSize, String search);
}
