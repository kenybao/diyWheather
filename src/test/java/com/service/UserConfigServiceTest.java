package com.service;

import com.domain.UserConfig;
import com.service.UserConfigService;
import com.tests.BaseServiceTest;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 73598.
 * @Date 2018/3/14 0014.
 * @Time 16:31.
 */
public class UserConfigServiceTest extends BaseServiceTest {
    @Autowired
    UserConfigService userConfigService;
    @Test
    public void userConfigService_GetById(){
        UserConfig byId = userConfigService.getById(1);
        Assert.assertNotNull(byId);
    }
    @Test
    public void userConfigService_Save(){
        UserConfig userConfig = new UserConfig();
        userConfig.setLoginName("test5");
        userConfigService.save(userConfig);
    }
}
