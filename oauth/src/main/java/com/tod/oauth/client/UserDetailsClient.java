package com.tod.oauth.client;


import com.baomidou.mybatisplus.extension.api.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "shenshu-system"
)
public interface UserDetailsClient {

    @GetMapping("system/rbacUser/username/{username}")
    public R getByUsername(@PathVariable String username);
}
