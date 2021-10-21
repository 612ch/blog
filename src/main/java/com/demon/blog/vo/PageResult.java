package com.demon.blog.vo;

import lombok.Data;

import java.util.List;

/**
 * @ClassName PageResult
 * @Descriotion 分页结果
 * @Author Demon
 * @Date 2021/10/21 0:25
 **/

@Data
public class PageResult<T> {
    private Long total;// 总条数
    private Long totalPage;// 总页数
    private List<T> items;// 当前页数据

    public PageResult() {
    }

    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.totalPage=(total + items.size() - 1)/items.size();
        this.items = items;
    }

    public PageResult(Long total, Long totalPage, List<T> items) {
        this.total = total;
        this.totalPage = totalPage;
        this.items = items;
    }
}