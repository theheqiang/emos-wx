package com.example.emos.wx;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@Slf4j
@ServletComponentScan
public class EmosWxApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmosWxApiApplication.class, args);
    }

}
