package com.tests;

import com.DemoApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 73598.
 * @Date 2018/3/14 0014.
 * @Time 16:35.
 */
//SpringBoot框架下基于Junit的单元测试
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoApplication.class ,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseTest {
}
