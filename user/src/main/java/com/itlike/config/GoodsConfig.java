package com.itlike.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//随机
@Configuration
public class GoodsConfig {
    @Bean  //让Ribbon负载均衡随机，如果不写这个方法Ribbion默认是轮询s
    public IRule iRule(){
        return new RandomRule();
    }
}
