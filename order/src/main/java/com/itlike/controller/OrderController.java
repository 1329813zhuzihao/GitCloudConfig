package com.itlike.controller;

import com.itlike.util.ResponseResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @RequestMapping("/getOrder")
    public ResponseResult getGoods(){
        ResponseResult my_goods_data = ResponseResult.success("My Order Data--getOrder2");
        return my_goods_data;
    }
}
