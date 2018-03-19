package com.controller;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.domain.CityInfo;
import com.domain.JsonWeatherCity;
import com.google.common.collect.Lists;
import com.service.CityInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.aspectj.util.FileUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by bb on 2018/03/15.
 */
@Controller
@RequestMapping("/cityInfo/")
public class CityInfoController {
    private static Logger LOGGER = LoggerFactory.getLogger(CityInfoController.class);

    @Autowired
    CityInfoService cityInfoService;

    @RequestMapping("add")
    @ResponseBody
    public String add(CityInfo cityInfo) {
        cityInfoService.save(cityInfo);
        return "";
    }

    @RequestMapping("delete")
    @ResponseBody
    public String delete(@RequestParam Integer id) {
	    cityInfoService.deleteById(id);
	    return "";
    }

    @RequestMapping("update")
    @ResponseBody
    public String update(CityInfo cityInfo) {
	    cityInfoService.update(cityInfo);
	    return "";
    }

    @RequestMapping("detail")
    @ResponseBody
    public String detail(@RequestParam Integer id) {
        CityInfo cityInfo = cityInfoService.findById(id);
        return cityInfo.toString();
    }

    @RequestMapping("list")
    @ResponseBody
    public String list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) throws IOException {
//        PageHelper.startPage(page, size);
//        List<CityInfo> list = cityInfoService.findAll();
//        PageInfo pageInfo = new PageInfo(list);
//        return list.toString();
        testParseJson3(cityInfoService);
        return "";
    }
    public void testParseJson3(CityInfoService cityInfoService) throws IOException {
        File file = new File("D:\\devData\\demo\\src\\main\\resources\\china-city-data.json");
        byte[] bytes = FileUtil.readAsByteArray(file);
//        StringBuffer stringBuffer = new StringBuffer();
        String sb = new String(bytes, StandardCharsets.ISO_8859_1.name());
        Map map = JSONObject.parseObject(sb, Map.class);
        List<CityInfo> list = Lists.newArrayList();
        map.forEach((k, v) -> {
            ((JSONArray) v).forEach(item -> {
                try {
                    JsonWeatherCity jsonWeatherCity = JSONObject.toJavaObject((JSON) item, JsonWeatherCity.class);
                    CityInfo cityInfo = new CityInfo();
                    cityInfo.setCode(jsonWeatherCity.getId());
                    cityInfo.setMark((String) k);
                    cityInfo.setName(jsonWeatherCity.getName());
                    list.add(cityInfo);
//                    cityInfoService.save(cityInfo);
                }catch (Exception e){
                    LOGGER.info("",e);
                }
            });
        });
        cityInfoService.save(list);
    }

}
