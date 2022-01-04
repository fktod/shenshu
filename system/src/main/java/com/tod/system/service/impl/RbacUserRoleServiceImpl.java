package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacUserRoleDao;
import com.tod.system.entity.RbacUserRole;
import com.tod.system.service.RbacUserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户角色关联表(RbacUserRole)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:29
 */
@Service("rbacUserRoleService")
public class RbacUserRoleServiceImpl extends ServiceImpl<RbacUserRoleDao, RbacUserRole> implements RbacUserRoleService {

}

