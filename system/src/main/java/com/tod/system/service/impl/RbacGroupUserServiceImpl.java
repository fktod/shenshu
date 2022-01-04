package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacGroupUserDao;
import com.tod.system.entity.RbacGroupUser;
import com.tod.system.service.RbacGroupUserService;
import org.springframework.stereotype.Service;

/**
 * 用户组用户关联表(RbacGroupUser)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:25
 */
@Service("rbacGroupUserService")
public class RbacGroupUserServiceImpl extends ServiceImpl<RbacGroupUserDao, RbacGroupUser> implements RbacGroupUserService {

}

