package com.service.impl;

import com.mapper.CityInfoMapper;
import com.domain.CityInfo;
import com.service.CityInfoService;
import com.service.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * Created by bb on 2018/03/15.
 */
@Service
public class CityInfoServiceImpl extends AbstractService<CityInfo> implements CityInfoService {

    @Autowired
    private CityInfoMapper cityInfoMapper;

}
