package com.lx.qlw.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.lx.qlw.shopping.api.mapper")
public class ShoppingUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShoppingUserServiceApplication.class, args);
    }

}
