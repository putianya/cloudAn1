package com.hy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.hy.mapper")
public class CloudDissApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudDissApplication.class, args);
    }
}
