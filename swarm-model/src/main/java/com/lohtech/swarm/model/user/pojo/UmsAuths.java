package com.lohtech.swarm.model.user.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ums_auths")
public class UmsAuths {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    /**
     * 账号类型: phone, email, username, wechat, weibo, ...
     */
    private String type;

    /**
     * 账号: 手机号, 邮箱, 用户名, 微信username, 微博uid
     */
    private String identifier;

    /**
     * 凭据: 密码, 密码, 密码, 微信token, 微博access_token
     */
    private String credential;

    /**
     * 验证状态
     */
    private Integer verified;

    /**
     * 登录IP
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 最后登录时间
     */
    @Column(name = "login_time")
    private Date loginTime;

    /**
     * 是否站内登录
     */
    @Column(name = "login_flag")
    private Integer loginFlag;

    /**
     * 帐号启用状态：0->禁用；1->启用
     */
    private Integer status;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取账号类型: phone, email, username, wechat, weibo, ...
     *
     * @return type - 账号类型: phone, email, username, wechat, weibo, ...
     */
    public String getType() {
        return type;
    }

    /**
     * 设置账号类型: phone, email, username, wechat, weibo, ...
     *
     * @param type 账号类型: phone, email, username, wechat, weibo, ...
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取账号: 手机号, 邮箱, 用户名, 微信username, 微博uid
     *
     * @return identifier - 账号: 手机号, 邮箱, 用户名, 微信username, 微博uid
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * 设置账号: 手机号, 邮箱, 用户名, 微信username, 微博uid
     *
     * @param identifier 账号: 手机号, 邮箱, 用户名, 微信username, 微博uid
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * 获取凭据: 密码, 密码, 密码, 微信token, 微博access_token
     *
     * @return credential - 凭据: 密码, 密码, 密码, 微信token, 微博access_token
     */
    public String getCredential() {
        return credential;
    }

    /**
     * 设置凭据: 密码, 密码, 密码, 微信token, 微博access_token
     *
     * @param credential 凭据: 密码, 密码, 密码, 微信token, 微博access_token
     */
    public void setCredential(String credential) {
        this.credential = credential;
    }

    /**
     * 获取验证状态
     *
     * @return verified - 验证状态
     */
    public Integer getVerified() {
        return verified;
    }

    /**
     * 设置验证状态
     *
     * @param verified 验证状态
     */
    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    /**
     * 获取登录IP
     *
     * @return login_ip - 登录IP
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置登录IP
     *
     * @param loginIp 登录IP
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取最后登录时间
     *
     * @return login_time - 最后登录时间
     */
    public Date getLoginTime() {
        return loginTime;
    }

    /**
     * 设置最后登录时间
     *
     * @param loginTime 最后登录时间
     */
    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取是否站内登录
     *
     * @return login_flag - 是否站内登录
     */
    public Integer getLoginFlag() {
        return loginFlag;
    }

    /**
     * 设置是否站内登录
     *
     * @param loginFlag 是否站内登录
     */
    public void setLoginFlag(Integer loginFlag) {
        this.loginFlag = loginFlag;
    }

    /**
     * 获取帐号启用状态：0->禁用；1->启用
     *
     * @return status - 帐号启用状态：0->禁用；1->启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置帐号启用状态：0->禁用；1->启用
     *
     * @param status 帐号启用状态：0->禁用；1->启用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}