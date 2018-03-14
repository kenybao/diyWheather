package com.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @author 73598.
 * @Date 2018/3/8 0008.
 * @Time 10:56.
 */
@Configuration//TODO
public class DruidDataSourceConfiguration {
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource")//TODO
//    public DataSource druidDataSource() {
//        DruidDataSource druidDataSource = new DruidDataSource();
//        return druidDataSource;
//    }
}
