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
@Table(name = "cx_article")
public class Article implements Serializable {
    /**
     * 文章主键
     */
    private Integer artId;

    /**
     * 文章分类ID
     */
    private Integer artCateId;

    /**
     * 文章标题
     */
    private String artTitle;

    /**
     * 文章别名 副标题
     */
    private String artAlias;

    /**
     * 文章关键字
     */
    private String artKeyword;

    /**
     * 文章标签
     */
    private String artTag;

    /**
     * 文章阅读数
     */
    private Integer artViewNum;

    /**
     * 文章状态，0发布，1审核，2草稿
     */
    private String artStatus;

    /**
     * 文章类型 0公开 1非公开
     */
    private String artType;

    /**
     * 删除状态 0正常 1删除
     */
    private String delFlag;

    /**
     * 文章是否置顶 0置顶 1非置顶 2分类置顶
     */
    private String artIsTop;

    /**
     * 创建用户
     */
    private Integer createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 最后一次修改人
     */
    private Integer updateBy;

    /**
     * 最后一次修改时间
     */
    private Date updateDate;

    /**
     * 删除人
     */
    private Integer deleteBy;

    /**
     * 删除时间
     */
    private Date deleteDate;

    /**
     * 文章内容
     */
    private String artContent;

    private static final long serialVersionUID = 1L;
}