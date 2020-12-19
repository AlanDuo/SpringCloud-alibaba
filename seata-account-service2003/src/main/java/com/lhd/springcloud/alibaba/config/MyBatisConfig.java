package com.lhd.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@MapperScan({"com.lhd.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
