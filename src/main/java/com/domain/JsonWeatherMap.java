package com.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author 73598.
 * @Date 2018/3/14 0014.
 * @Time 20:46.
 */
@Data
public class JsonWeatherMap implements Serializable {
    Map<String,List<JsonWeatherCity>> maps;
}
