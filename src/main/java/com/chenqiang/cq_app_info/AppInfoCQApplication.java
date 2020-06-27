package com.chenqiang.cq_app_info;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chenqiang.cq_app_info.dao")
public class AppInfoCQApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppInfoCQApplication.class, args);
    }

}
