package com.demon.blog.controller;

import com.demon.blog.service.ArticleService;
import com.demon.blog.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName ArticleController
 * @Descriotion
 * @Author Demon
 * @Date 2021/10/23 17:18
 **/
@RestController
@RequestMapping("article")
@Api(tags = "文章控制器")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    /**
     *
     * @param pageIndex 当前页
     * @param pageSize 每页大小
     * @param search 搜索关键字
     * @return
     */
    @GetMapping("page")
    @ApiOperation(value = "文章列表", notes = "文章列表")
    public Result queryArticleByPage(
            @RequestParam(value = "pageIndex", defaultValue = "1") Integer pageIndex,
            @RequestParam(value = "pageSize", defaultValue = "10") Integer pageSize,
            @RequestParam(value = "search", required = false) String search){
        return articleService.queryArticleByPage(pageIndex, pageSize, search);
    }

    @PostMapping
    @ApiOperation(value = "新增文章", notes = "新增文章")
    public Result addArticle(){

        return Result.ok();
    }
    @GetMapping("{artId}")
    @ApiOperation(value = "文章详情", notes = "获取文章详情")
    public Result getArticle(
            @PathVariable(value = "artId") String artId
    ){
        return Result.ok();
    }

}
