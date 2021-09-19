package org.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("org.example.mapper")
@SpringBootApplication
// TODO 类名首字母大写
public class helloWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(helloWorldApplication.class, args);
    }
}
