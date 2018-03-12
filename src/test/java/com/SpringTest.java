package com;

import com.domain.UserConfig;
import com.service.UserConfigService;
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
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringTest {
    @Autowired
    UserConfigService userConfigService;
    @Test
    public void getUser(){
        UserConfig byId = userConfigService.getById(1);
//        byId = userConfigService.getById(1);
        Assert.assertNotNull(byId);
    }

}
