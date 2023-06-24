package com.itlike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AppGoods {
    public static void main(String[] args) {
        SpringApplication.run(AppGoods.class,args);
    }
}
