package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacPrivilegeDao;
import com.tod.system.entity.RbacPrivilege;
import com.tod.system.service.RbacPrivilegeService;
import org.springframework.stereotype.Service;

/**
 * 权限表(RbacPrivilege)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:26
 */
@Service("rbacPrivilegeService")
public class RbacPrivilegeServiceImpl extends ServiceImpl<RbacPrivilegeDao, RbacPrivilege> implements RbacPrivilegeService {

}

