package com.hy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DruidDatasourceConfig {
    @ConfigurationProperties(prefix = "spring.datasource") // 使用spring.datasource前缀的配置属性
    @Bean
    public DruidDataSource druidDataSource(){
        return new DruidDataSource(); // 返回一个DruidDataSource对象
    }
}
