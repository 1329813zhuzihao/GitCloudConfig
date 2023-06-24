package com.itlike.controller;

import com.itlike.util.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @RequestMapping("/getGoods")
    public ResponseResult getGoods(){
        ResponseResult my_goods_data = ResponseResult.success("My Goods Data--getGoods1");
        System.out.println("来到了");
       /* System.out.println(1/0);*/
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return my_goods_data;
    }
}
