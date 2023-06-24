package com.itlike.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;


@FeignClient(name = "provide-goods",fallback = GoodFeignClientFallBack.class)
public interface GoodsFeignClient {
    @RequestMapping("/getGoods")
    public Object getGoods();
}
