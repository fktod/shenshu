package com.tod.oauth.controller;

import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.tod.oauth.client.UserDetailsClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController extends ApiController {
    @Autowired
    private UserDetailsClient client;

    @GetMapping("user")
    public R user() {
        return success(client.getByUsername("test").getData());
    }
}
