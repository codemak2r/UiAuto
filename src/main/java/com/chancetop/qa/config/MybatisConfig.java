package com.chancetop.qa.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: zw.wen
 */
@Configuration
@MapperScan(basePackages = {"com.chancetop.qa.mappers"} )
public class MybatisConfig {
}
