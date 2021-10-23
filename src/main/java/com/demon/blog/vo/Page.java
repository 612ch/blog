package com.demon.blog.vo;

import java.io.Serializable;
import java.util.List;

public class Page<T> implements Serializable {

    private static final long serialVersionUID = 5760097915453738435L;

    public static final int DEFAULT_PAGE_SIZE = 10;

    /**
     * 每页显示个数
     */
    private int pageSize;
    /**
     * 当前页数
     */
    private int pageIndex;
    /**
     * 总页数
     */
    private int totalPage;
    /**
     * 总记录数
     */
    private int totalCount;
    /**
     * 结果列表
     */
    private List<T> rows;

    public Page() {
        this.pageIndex = 1;
        this.pageSize = DEFAULT_PAGE_SIZE;
    }

    /**
     *
     * @param pageIndex 当前页
     * @param pageSize 每页显示个数
     */
    public Page(int pageIndex, int pageSize) {
        this.pageIndex = pageIndex <= 0 ? 1 : pageIndex;
        this.pageSize = pageSize <= 0 ? 1 : pageSize;
    }

    /**
     * 分页参数
     * @param pageIndex 当前页
     * @param pageSize 每页显示个数
     * @param totalCount 总条数
     * @param rows 当前页数据
     */
    public Page(int pageIndex,int pageSize, int totalCount,List<T> rows) {
        this.pageIndex = pageIndex <= 0 ? 1 : pageIndex;
        this.pageSize = pageSize <= 0 ? 1 : pageSize;
        setTotalCount(totalCount);
        this.rows = rows;
    }
    /**
     * 分页参数
     * @param pageIndex 当前页
     * @param pageSize 每页显示个数
     * @param totalCount 总条数
     * @param rows 当前页数据
     */
    public Page(int pageIndex,int pageSize, Long totalCount,List<T> rows) {
        this.pageIndex = pageIndex <= 0 ? 1 : pageIndex;
        this.pageSize = pageSize <= 0 ? 1 : pageSize;
        setTotalCount(totalCount);
        this.rows = rows;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        //设置了totalCount就可以计算出总totalPage
        this.totalCount = totalCount;
        int countRecords = this.getTotalCount();
        int totalPages = countRecords % pageSize == 0 ? countRecords / pageSize : (countRecords / pageSize + 1);
        setTotalPage(totalPages);
    }

    public void setTotalCount(Long totalCount) {
        //设置了totalCount就可以计算出总totalPage
        this.totalCount = totalCount.intValue();
        int countRecords = this.getTotalCount();
        int totalPages = countRecords % pageSize == 0 ? countRecords / pageSize : (countRecords / pageSize + 1);
        setTotalPage(totalPages);
    }

    public void build(List<T> rows) {
        this.setRows(rows);
        int count = this.getTotalCount();
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}