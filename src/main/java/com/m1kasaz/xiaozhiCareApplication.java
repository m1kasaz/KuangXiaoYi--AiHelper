package com.m1kasaz;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.m1kasaz.mapper")
public class xiaozhiCareApplication {
    public static void main(String[] args) {
        SpringApplication.run(xiaozhiCareApplication.class, args);
    }
}
