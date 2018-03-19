package com.config;

import tk.mybatis.mapper.common.*;

/**
 * 通用 Mapper, 如果被扫描到会报异常
 * Created by zhh on 2017/09/18.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> ,ConditionMapper<T>,IdsMapper<T>{
}
