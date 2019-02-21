package com.cn.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cn.service.Impl.HelloServiceImpl;

@FeignClient(value = "liufu-hello",fallback=HelloServiceImpl.class)
public interface HelloService {
    @RequestMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}
