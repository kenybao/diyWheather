package com.service;
import com.domain.UserConfig;
import com.service.Service;

/**
 *
 * Created by bb on 2018/03/12.
 */
public interface UserConfigService extends Service<UserConfig> {
    UserConfig getById(Integer id);
}
