package com.tod.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${spring.cc}")
    private String cc;

    @GetMapping("query-demo")
    public String hello(){
        return "ssssssssssssssssssss==========";
    }

    @GetMapping("demo")
    public String hello2(){
        return "ssssssssssssssssssss==========";
    }
}
