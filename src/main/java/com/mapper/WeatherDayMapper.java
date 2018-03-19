package com.mapper;

import com.domain.WeatherDay;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author 73598.
 * @Date 2018/3/8 0008.
 * @Time 11:11.
 */
public interface WeatherDayMapper {
    @Select("select * from weather_day where id = #{id}")
    WeatherDay findCityById(@Param("id") String id);

    /**
     */
    @Select("select * from weather_day")
    @Results(id = "weather_day", value = {
            @Result(property = "id", column = "id", id = true),
            @Result(property = "day", column = "day"),
            @Result(property = "cityId", column = "city_Id"),
            @Result(property = "weather", column = "weather")
    })
    List<WeatherDay> getWeathers();

    @Select("select * from weather_day where id = #{value}")
    @ResultMap("weather_day")
    WeatherDay getUserById(@Param("id") String id);

    @Select("select * from weather_day where city_Id = #{cityId}")
    @ResultMap("weather_day")
    List<WeatherDay> getUsersByFirstName(@Param("cityId") String cityId);
}
