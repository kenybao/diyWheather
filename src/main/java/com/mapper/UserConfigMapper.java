package com.mapper;

import com.config.MyMapper;
import com.domain.UserConfig;

public interface UserConfigMapper extends MyMapper<UserConfig> {
    UserConfig getById(Integer id);
}