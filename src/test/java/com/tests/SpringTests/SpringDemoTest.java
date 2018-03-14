package com.tests.SpringTests;

import com.domain.UserConfig;
import com.mapper.UserConfigMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 73598.
 * @Date 2018/3/12 0012.
 * @Time 9:16.
 */
//SpringBoot框架下基于Junit的单元测试
@RunWith(SpringRunner.class)
//@ContextConfiguration(classes = demoConfig.class)
@SpringBootTest
public class SpringDemoTest {
    @Autowired
    UserConfigMapper userConfigMapper;
    @Test
    public void getUser() {
        UserConfig byId = userConfigMapper.getById(1);
        Assert.assertNotNull(byId);
    }

}
