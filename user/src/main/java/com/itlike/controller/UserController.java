package com.itlike.controller;

import com.itlike.service.GoodsFeignClient;
import com.itlike.util.ResponseResult;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    //注入restTemplate
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private GoodsFeignClient goodsFeignClient;


    @RequestMapping("/getUser")
    public ResponseResult getUser(){
        return ResponseResult.success("调用成功",goodsFeignClient.getGoods());
    }


    /*@RequestMapping("/getUser")
    @HystrixCommand(fallbackMethod = "fallbackMethod",
            threadPoolKey = "goods-2",
            threadPoolProperties ={
                    @HystrixProperty(name = "coreSize",value = "5")
            })
    public ResponseResult getUser(){
        return ResponseResult.success("调用成功",goodsFeignClient.getGoods());
        Object forObject = restTemplate.getForObject
                ("http://provide-goods/getGoods", Object.class);
        return ResponseResult.success("调用成功",forObject);
    }*/

    @RequestMapping("/getOrder")
    public ResponseResult getOrder(){
        Object forObject = restTemplate.getForObject
                ("http://provide-order/getOrder", Object.class);
        return ResponseResult.success("调用成功",forObject);
    }

    //Hystrix降级
   /* public ResponseResult fallbackMethod(){
        return ResponseResult.error("服务器正在维护，请稍后再试....");
    }*/

}
