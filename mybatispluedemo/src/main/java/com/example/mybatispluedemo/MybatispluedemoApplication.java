package com.example.mybatispluedemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatispluedemo.Mapper")
public class MybatispluedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatispluedemoApplication.class, args);
    }

}
