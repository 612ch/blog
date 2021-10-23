package com.demon.blog.pojo;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;

/**
 * @author 
 * 
 */
@Data
@Table(name = "cx_config")
public class Config implements Serializable {
    private Integer confId;

    /**
     * 配置主键KEY
     */
    private String confKey;

    /**
     * 配置的值
     */
    private String confValue;

    /**
     * 配置注释说明
     */
    private String confRemarks;

    private static final long serialVersionUID = 1L;
}