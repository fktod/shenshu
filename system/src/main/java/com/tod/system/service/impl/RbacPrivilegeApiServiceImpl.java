package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacPrivilegeApiDao;
import com.tod.system.entity.RbacPrivilegeApi;
import com.tod.system.service.RbacPrivilegeApiService;
import org.springframework.stereotype.Service;

/**
 * 权限接口关联表(RbacPrivilegeApi)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:26
 */
@Service("rbacPrivilegeApiService")
public class RbacPrivilegeApiServiceImpl extends ServiceImpl<RbacPrivilegeApiDao, RbacPrivilegeApi> implements RbacPrivilegeApiService {

}

