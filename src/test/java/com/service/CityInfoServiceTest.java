package com.service;

import com.controller.CityInfoController;
import com.domain.CityInfo;
import com.jayway.jsonpath.Criteria;
import com.tests.BaseServiceTest;
import com.tests.utilTest.UtilTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author 73598.
 * @Date 2018/3/15 0015.
 * @Time 9:34.
 */
public class CityInfoServiceTest extends BaseServiceTest{
    @Autowired
    CityInfoService cityInfoService;
    @Autowired
    CityInfoController cityInfoController;
    @Test
    public void  testSave() throws IOException {
//        List<CityInfo> all = cityInfoService.findAll();
//        cityInfoService
//        cityInfoService.findByCondition(Criteria.where("name").contains("氏"))
        new UtilTest().testParseJson3(cityInfoService);
    }
    @Test
    public void testa(){
        Date date1 = new Date();
        long time = date1.getTime();
        while(true){
            Date date = new Date();
            if (time - date.getTime() >20000 )
                break;
        }
    }

}