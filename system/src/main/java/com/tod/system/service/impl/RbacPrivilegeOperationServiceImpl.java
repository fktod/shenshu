package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacPrivilegeOperationDao;
import com.tod.system.entity.RbacPrivilegeOperation;
import com.tod.system.service.RbacPrivilegeOperationService;
import org.springframework.stereotype.Service;

/**
 * 权限操作关联表(RbacPrivilegeOperation)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:27
 */
@Service("rbacPrivilegeOperationService")
public class RbacPrivilegeOperationServiceImpl extends ServiceImpl<RbacPrivilegeOperationDao, RbacPrivilegeOperation> implements RbacPrivilegeOperationService {

}

