package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacGroupRoleDao;
import com.tod.system.entity.RbacGroupRole;
import com.tod.system.service.RbacGroupRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户组角色关联表(RbacGroupRole)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:24
 */
@Service("rbacGroupRoleService")
public class RbacGroupRoleServiceImpl extends ServiceImpl<RbacGroupRoleDao, RbacGroupRole> implements RbacGroupRoleService {

}

