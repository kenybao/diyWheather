package com.controller;

import com.domain.WeatherDay;
import com.mapper.WeatherDayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;

/**
 * @author 73598.
 * @Date 2018/3/7 0007.
 * @Time 11:00.
 */
@Controller
@RequestMapping("/Test")
@EnableAutoConfiguration
public class TestController {
    @Resource
    WeatherDayMapper weatherDayMapper;
    @GetMapping("/test1")
    @ResponseBody
    public String test(){
        WeatherDay cityById = weatherDayMapper.getUserById("1");
        System.out.println(cityById.getDay());
        Jedis jedis = new Jedis("192.168.19.130",6379);
        jedis.auth("45678");
        String aa = jedis.get("aa");
        System.out.println(aa);
        return aa;
    }
}
