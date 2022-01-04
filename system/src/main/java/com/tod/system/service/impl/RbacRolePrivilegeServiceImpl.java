package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacRolePrivilegeDao;
import com.tod.system.entity.RbacRolePrivilege;
import com.tod.system.service.RbacRolePrivilegeService;
import org.springframework.stereotype.Service;

/**
 * 角色权限关联表(RbacRolePrivilege)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:28
 */
@Service("rbacRolePrivilegeService")
public class RbacRolePrivilegeServiceImpl extends ServiceImpl<RbacRolePrivilegeDao, RbacRolePrivilege> implements RbacRolePrivilegeService {

}

