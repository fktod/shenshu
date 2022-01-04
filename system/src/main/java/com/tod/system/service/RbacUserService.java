package com.tod.system.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tod.system.entity.RbacUser;

/**
 * 用户表(RbacUser)表服务接口
 *
 * @author makejava
 * @since 2021-12-31 16:12:28
 */
public interface RbacUserService extends IService<RbacUser> {

    RbacUser getByUsername(String username);
}

