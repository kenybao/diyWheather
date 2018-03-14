package com.tests.service;

import com.domain.UserConfig;
import com.service.UserConfigService;
import com.tests.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 73598.
 * @Date 2018/3/14 0014.
 * @Time 16:31.
 */
public class UserConfigServiceTest extends BaseTest {
    @Autowired
    UserConfigService userConfigService;
    @Test
    public void getUser(){
        UserConfig byId = userConfigService.getById(1);
        Assert.assertNotNull(byId);
    }

}
