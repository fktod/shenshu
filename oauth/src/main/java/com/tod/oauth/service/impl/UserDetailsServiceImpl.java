package com.tod.oauth.service.impl;

import com.baomidou.mybatisplus.extension.api.R;
import com.tod.oauth.client.UserDetailsClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Map;

@Slf4j
@Service("userDetailService")
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserDetailsClient userDetailsClient;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        R resp = userDetailsClient.getByUsername(s);
        if (!resp.ok() || resp.getData() == null) {
            return null;
        }
        Map<String, Object> data = (Map<String, Object>) resp.getData();
        return User.builder()
                .username((String) data.get("username"))
                .password((String) data.get("password"))
                .accountExpired(false)
                .accountLocked(false)
                .credentialsExpired(false)
                .disabled(false)
                .authorities(new HashSet<>())
                .build();
    }


}
