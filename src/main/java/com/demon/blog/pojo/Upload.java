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
@Table(name = "cx_upload")
public class Upload implements Serializable {
    /**
     * 文件上传主键
     */
    private Integer ulId;

    /**
     * 文件大小
     */
    private Integer ulSize;

    /**
     * 文件名
     */
    private String ulName;

    /**
     * 文件原名
     */
    private String ulOriginName;

    /**
     * 文件全名
     */
    private String ulAbsoluteName;

    /**
     * 文件格式
     */
    private String ulFormat;

    /**
     * 文件简介
     */
    private String ulIntro;

    /**
     * 创建人
     */
    private String ulCreateBy;

    /**
     * 创建时间
     */
    private Date ulCreateDate;

    /**
     * 下载次数
     */
    private Integer ulDownNums;

    private static final long serialVersionUID = 1L;
}