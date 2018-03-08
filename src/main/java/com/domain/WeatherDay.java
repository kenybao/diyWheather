package com.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 73598.
 * @Date 2018/3/8 0008.
 * @Time 11:07.
 */
@Data//TODO 做了什么
public class WeatherDay implements Serializable{
    private static final long serialVersionUID = 1L;

    public WeatherDay() {
    }
    private String id;
    private Date day;
    private String cityId;
    private String weather;
}
