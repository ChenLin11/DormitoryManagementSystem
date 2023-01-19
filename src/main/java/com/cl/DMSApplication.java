package com.cl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class DMSApplication {

    public static void main(String[] args) {
        SpringApplication.run(DMSApplication.class, args);
    }

}