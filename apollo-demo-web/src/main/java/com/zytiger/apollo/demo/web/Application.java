package com.zytiger.apollo.demo.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * 入口
 *
 * @author zytiger
 * @version OrderController.java, v 0.1 2018-08-28 10:50
 */
@SpringBootApplication
@Slf4j
@ComponentScans(@ComponentScan("com.zytiger.apollo.demo"))
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
