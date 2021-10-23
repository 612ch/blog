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
@Table(name = "cx_tag")
public class Tag implements Serializable {
    /**
     * 标签ID
     */
    private Integer tagId;

    /**
     * 标签名
     */
    private String tagName;

    /**
     * 标签别名
     */
    private String tagAlias;

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