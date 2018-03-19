package com.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 73598.
 * @Date 2018/3/14 0014.
 * @Time 20:46.
 */
@Data
public class JsonWeather implements Serializable {
    /*
    自然顺序标记位
     */
    String mark;
    List<JsonWeatherCity> jsonWeatherCityList;
}
