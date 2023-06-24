package com.itlike.service;

import com.itlike.util.ResponseResult;
import org.springframework.stereotype.Component;

@Component
public class GoodFeignClientFallBack implements GoodsFeignClient{
    @Override
    public Object getGoods() {
        return ResponseResult.error("服务器正在维护，请稍后再试....");
    }
}
