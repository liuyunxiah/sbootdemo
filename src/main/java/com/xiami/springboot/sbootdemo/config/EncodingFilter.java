package com.xiami.springboot.sbootdemo.config;

import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author LYX
 * @date 2019/6/13
 */
@WebFilter("/*")
public class EncodingFilter implements WebMvcConfigurer{


}
