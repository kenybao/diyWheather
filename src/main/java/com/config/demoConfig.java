package com.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author 73598.
 * @Date 2018/3/12 0012.
 * @Time 19:04.
 */
//@SpringBootApplication() //TODO
@ComponentScan("com.*")
@MapperScan(basePackages  = "com.mapper")
@Configuration
//@EnableConfigurationProperties
//@EnableAutoConfiguration
public class demoConfig {
}
