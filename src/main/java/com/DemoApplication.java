package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 73598
 */
@SpringBootApplication //TODO已经包含ComponentScan等注解 默认扫描同级下的包
//@ComponentScan("com.*")
@MapperScan(basePackages  = "com.mapper")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
