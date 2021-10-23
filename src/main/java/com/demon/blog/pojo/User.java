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
@Table(name = "cx_user")
public class User implements Serializable {
    private Integer uId;

    /**
     * 用户名
     */
    private String uName;

    /**
     * 密码
     */
    private String uPassword;

    /**
     * 盐加密
     */
    private String uSalt;

    /**
     * UUID
     */
    private String uUuid;

    /**
     * 用户等级
     */
    private Integer uLevel;

    /**
     * 用户邮箱地址
     */
    private String uEmail;

    /**
     * 用户QQ
     */
    private String uQq;

    /**
     * 用户手机号码
     */
    private String uPhone;

    /**
     * 用户github地址
     */
    private String uGithub;

    /**
     * 用户码云地址
     */
    private String uGitee;

    private String uWechat;

    /**
     * 用户主页地址
     */
    private String uHomePage;

    /**
     * 用户昵称
     */
    private String uAlias;

    /**
     * 用户状态0正常 1封禁
     */
    private String uStatus;

    private String delFlag;

    /**
     * 用户当前登陆IP
     */
    private String uLoginIp;

    /**
     * 用户上一次登陆IP
     */
    private String uLastLoginIp;

    /**
     * 创建人
     */
    private String uCreateBy;

    /**
     * 创建时间
     */
    private Date uCreateDate;

    private static final long serialVersionUID = 1L;
}