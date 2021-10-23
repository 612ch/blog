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
@Table(name = "cx_category")
public class Category implements Serializable {
    private Integer cateId;

    /**
     * 分类名称
     */
    private String cateName;

    /**
     * 分类别名
     */
    private String cateAlias;

    /**
     * 分类关键字多个,区分
     */
    private String cateKeywords;

    /**
     * 分类注释说明
     */
    private String cateRemarks;

    /**
     * 分类父级节点ID
     */
    private Integer cateParent;

    /**
     * 创建人
     */
    private Integer cateCreateBy;

    /**
     * 创建时间
     */
    private Date cateCreateDate;

    /**
     * 修改人
     */
    private Integer cateUpdateBy;

    /**
     * 修改时间
     */
    private Date cateUpdateDate;

    /**
     * 删除人
     */
    private Integer cateDeleteBy;

    /**
     * 删除时间
     */
    private Date cateDeleteDate;

    /**
     * 删除标记 0正常 1删除
     */
    private String delFlag;

    private static final long serialVersionUID = 1L;
}