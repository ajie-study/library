package com.family;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ajie
 * @date 2019-11-20 15:22
 */

@SpringBootApplication  //启动类
@MapperScan("com.family.mapper")
public class LibraryApp {

    public static void main(String[] args) {
        SpringApplication.run(LibraryApp.class, args);
    }
}
