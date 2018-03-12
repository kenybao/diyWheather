package com.service.impl;

import com.mapper.UserConfigMapper;
import com.domain.UserConfig;
import com.service.UserConfigService;
import com.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by bb on 2018/03/12.
 */
@Service
public class UserConfigServiceImpl extends AbstractService<UserConfig> implements UserConfigService {

    @Autowired
    private UserConfigMapper userConfigMapper;

    @Override
    public UserConfig getById(Integer id) {
        return userConfigMapper.getById(id);
    }
}
