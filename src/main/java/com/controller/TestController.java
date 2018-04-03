package com.controller;

import com.domain.User;
import com.domain.WeatherDay;
import com.mapper.UserMapper;
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
public class TestController {

    @Resource
    UserMapper userMapper;
    @GetMapping("/test1")
    @ResponseBody
    public User test(){
        User user = userMapper.selectByPrimaryKey(1L);
        return user;
    }
}
