package com.lijian.jianmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.lijian.jianmall.dao")
@SpringBootApplication
public class JianmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(JianmallApplication.class, args);
    }

}
