package com.cn.service.Impl;

import org.springframework.stereotype.Component;

import com.cn.service.HelloService;

@Component
public class HelloServiceImpl implements HelloService{

    @Override
    public String hello(String name) {
        // TODO Auto-generated method stub
        return "sorry,"+name+",server error!";
    }

}
