package com.domain;

import lombok.Data;

import javax.persistence.*;

@Table(name = "city_info")
@Data
public class CityInfo {
    /**
     * 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 邮政编码
     */
    private String code;

    /**
     * 城市名字
     */
    private String name;

    /**
     * 标记
     */
    private String mark;

    /**
     * 获取自增主键
     *
     * @return id - 自增主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增主键
     *
     * @param id 自增主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取邮政编码
     *
     * @return code - 邮政编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置邮政编码
     *
     * @param code 邮政编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取城市名字
     *
     * @return name - 城市名字
     */
    public String getName() {
        return name;
    }

    /**
     * 设置城市名字
     *
     * @param name 城市名字
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取标记
     *
     * @return mark - 标记
     */
    public String getMark() {
        return mark;
    }

    /**
     * 设置标记
     *
     * @param mark 标记
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

}