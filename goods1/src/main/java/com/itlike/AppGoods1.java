package com.itlike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppGoods1 {
    public static void main(String[] args) {
        SpringApplication.run(AppGoods1.class,args);
    }
}
