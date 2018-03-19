package com.tests.utilTest;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.domain.CityInfo;
import com.domain.JsonWeather;
import com.domain.JsonWeatherCity;
import com.domain.JsonWeatherMap;
import com.service.CityInfoService;
import com.tests.BaseTest;
import org.aspectj.util.FileUtil;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.IOException;
import java.nio.charset.*;
import java.util.*;

/**
 * @author 73598.
 * @Date 2018/3/14 0014.
 * @Time 20:09.
 */
public class UtilTest extends BaseTest {
    private static Logger LOGGER = LoggerFactory.getLogger(UtilTest.class);
    @Test
    public void testJsonParse() throws IOException {
        File file = new File("D:\\devData\\demo\\src\\main\\resources\\china-city-data.json");
        byte[] bytes = FileUtil.readAsByteArray(file);
//        StringBuffer stringBuffer = new StringBuffer();
        String sb = new String(bytes, StandardCharsets.ISO_8859_1.name());
//        System.out.println(sb);

        String cnStr = "{" +
                "  \"A\": [" +
                "    {" +
                "      \"id\": \"820100\"," +
                "      \"name\": \"\\u6fb3\\u95e8\\u534a\\u5c9b\"" +
                "    }," +
                "    {" +
                "      \"id\": \"659002\"," +
                "      \"name\": \"\\u963f\\u62c9\\u5c14\\u5e02\"" +
                "    }" +
                "  ]," +
                "  \"B\": [" +
                "    {" +
                "      \"id\": \"110100\"," +
                "      \"name\": \"\\u5317\\u4eac\"" +
                "    }" +
                "  ]" +
                "}";

        System.out.println(cnStr);
        JSONObject jsonObject = JSON.parseObject(sb);
        jsonObject.forEach((k, v) -> {
//            JsonWeatherCity jsonWeatherCity = JSON.parseObject(,JsonWeatherCity.class);
////            JsonWeatherCity jsonWeatherCity = new JsonWeatherCity();
//            jsonWeatherCity.setMark(k);
//            jsonWeatherCity.
            System.out.println(k);
            JSONArray array = (JSONArray) v;
            array.forEach(item -> {
                System.out.println(item);
                System.out.println(item.getClass());
                JsonWeatherCity jsonWeatherCity = JSONObject.toJavaObject((JSON) item, JsonWeatherCity.class);
                System.out.println(jsonWeatherCity.getId());
                System.out.println(k);
            });
        });
        //        JsonWeatherMap jsonWeatherData = JSON.parseObject(cnStr, JsonWeatherMap.class);
//        jsonWeatherData.getJsonWeatherList();
//        jsonWeatherData.getJsonWeatherList().forEach(item->item.getJsonWeatherCityList().forEach(city-> System.out.println(city.getName())));
//        objects.forEach(object-> Arrays.asList(object).forEach(item ->{
//            System.out.println(item);
//            System.out.println("----");
//        } ));

    }

    @Test
    public void TestObject2Json() {
        JsonWeatherCity city = new JsonWeatherCity();
        city.setName("徐克宝");
        city.setId("110");
        JsonWeatherCity city2 = new JsonWeatherCity();
        city2.setName("徐克宝2");
        city2.setId("112");

        JsonWeather jsonWeather = new JsonWeather();
        jsonWeather.setJsonWeatherCityList(Arrays.asList(city, city2));
        jsonWeather.setMark("A");
        System.out.println(JSON.toJSONString(jsonWeather));
        JsonWeatherCity city3 = new JsonWeatherCity();
        city3.setName("徐克宝");
        city3.setId("110");
        System.out.println(JSON.toJSONString(city3));
    }

    @Test
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
