package com.tod.gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("demo1")
    public String demo1() {
        return "demo1";
    }

    @GetMapping("demo2")
    public String demo2() {
        return "demo2";
    }

    @GetMapping("demo3")
    public String demo(String param) {
        return "demo3:" + param;
    }
}
