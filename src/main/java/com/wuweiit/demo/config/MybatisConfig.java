package com.wuweiit.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;



@Configuration

@MapperScan("com.wuweiit.demo.dao")
public class MybatisConfig {


}
