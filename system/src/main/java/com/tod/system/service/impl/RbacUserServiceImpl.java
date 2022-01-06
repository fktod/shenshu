package com.tod.system.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacUserDao;
import com.tod.system.entity.RbacUser;
import com.tod.system.service.RbacUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

/**
 * 用户表(RbacUser)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:29
 */
@Service("rbacUserService")
public class RbacUserServiceImpl extends ServiceImpl<RbacUserDao, RbacUser> implements RbacUserService {

    public RbacUser getByUsername(String username) {
        return this.baseMapper.selectOne(Wrappers.<RbacUser>lambdaQuery()
                .eq(StringUtils.isNotBlank(username),
                        RbacUser::getUsername,
                        username));
    }
}

