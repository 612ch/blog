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
@Table(name = "cx_comment")
public class Comment implements Serializable {
    /**
     * 评论ID
     */
    private Integer commId;

    /**
     * 评论状态 0正常 1待审核
     */
    private String commStatus;

    /**
     * 评论用户名
     */
    private String commName;

    /**
     * 邮箱
     */
    private String commEmail;

    /**
     * 主页
     */
    private String commHomePage;

    /**
     * 评论IP
     */
    private String commIp;

    /**
     * 评论浏览器agent
     */
    private String commAgent;

    /**
     * 评论父级ID 意思为回复ID
     */
    private Integer commParent;

    /**
     * 删除状态0正常 1删除
     */
    private String delFlag;

    /**
     * 创建人 登陆状态下获取的是登陆用户
     */
    private Integer createBy;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 删除人
     */
    private Integer deleteBy;

    /**
     * 删除时间
     */
    private Date deleteDate;

    /**
     * 评论内容
     */
    private String commContent;

    private static final long serialVersionUID = 1L;
}