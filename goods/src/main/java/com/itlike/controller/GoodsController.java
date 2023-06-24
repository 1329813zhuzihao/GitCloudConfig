package com.itlike.controller;

import com.itlike.util.ResponseResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @RequestMapping("/getGoods")
    public ResponseResult getGoods(){
        ResponseResult my_goods_data = ResponseResult.success("My Goods Data--getGoods");
        return my_goods_data;
    }
}
