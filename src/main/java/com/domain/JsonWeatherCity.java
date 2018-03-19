package com.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 73598.
 * @Date 2018/3/14 0014.
 * @Time 20:52.
 */
@Data
public class JsonWeatherCity  implements Serializable{
    /**
     * 标记
     */
    String mark;
    /**
     * 城市邮编
     */
    String id;
    /**
     * 城市中文名字
     */
    String name;

    @Override
    public String toString() {
        return "JsonWeatherCity{" +
                "mark='" + mark + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
