package com.domain;

import javax.persistence.*;

@Table(name = "user_config")
public class UserConfig {
    /**
     * 用户配置信息表自增ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 获取用户配置信息表自增ID
     *
     * @return id - 用户配置信息表自增ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置用户配置信息表自增ID
     *
     * @param id 用户配置信息表自增ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return login_name - 用户名
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置用户名
     *
     * @param loginName 用户名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}