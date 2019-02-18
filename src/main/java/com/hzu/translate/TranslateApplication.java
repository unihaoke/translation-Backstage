package com.hzu.translate;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.hzu.translate.dao")//扫描mapper
@ComponentScan(basePackages = {"com.hzu.translate.*"})//扫描Controller
public class TranslateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TranslateApplication.class, args);
    }

}

