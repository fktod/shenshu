package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacRoleDao;
import com.tod.system.entity.RbacRole;
import com.tod.system.service.RbacRoleService;
import org.springframework.stereotype.Service;

/**
 * 角色表(RbacRole)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:28
 */
@Service("rbacRoleService")
public class RbacRoleServiceImpl extends ServiceImpl<RbacRoleDao, RbacRole> implements RbacRoleService {

}

