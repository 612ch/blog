package com.demon.blog.pojo;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
@Data
@Table(name = "cx_link")
public class Link implements Serializable {
    private String linkId;

    /**
     * 标题
     */
    private String linkTitle;

    /**
     * 别称介绍
     */
    private String linkAlias;

    /**
     * url地址
     */
    private String linkUrl;

    /**
     * 链接地址0正常 1关闭
     */
    private String linkStatus;

    /**
     * 排序
     */
    private Integer linkSort;

    /**
     * 点击数
     */
    private Integer linkClick;

    /**
     * 创建人
     */
    private Integer createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人
     */
    private Integer updateBy;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 删除标记 0正常 1删除
     */
    private String delFlag;

    /**
     * 删除人
     */
    private Integer deleteBy;

    /**
     * 删除时间
     */
    private Date deleteDate;

    private static final long serialVersionUID = 1L;
}