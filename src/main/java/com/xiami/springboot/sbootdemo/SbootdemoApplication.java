package com.xiami.springboot.sbootdemo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 启动类
 * @author LYX
 * @date 2018/6/12
 */
@SpringBootApplication
@MapperScan(basePackages = "com.xiami.springboot.sbootdemo.mapper")
public class SbootdemoApplication {

    @Autowired
    private ApplicationArguments applicationArguments;

    public static void main(String[] args) {
        SpringApplication.run(SbootdemoApplication.class, args);
    }

}
