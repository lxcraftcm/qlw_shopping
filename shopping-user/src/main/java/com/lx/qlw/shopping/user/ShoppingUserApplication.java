package com.lx.qlw.shopping.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.lx.qlw.shopping.api.mapper")
public class ShoppingUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingUserApplication.class, args);
    }

}
