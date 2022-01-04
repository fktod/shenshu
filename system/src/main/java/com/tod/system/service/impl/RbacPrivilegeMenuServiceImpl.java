package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacPrivilegeMenuDao;
import com.tod.system.entity.RbacPrivilegeMenu;
import com.tod.system.service.RbacPrivilegeMenuService;
import org.springframework.stereotype.Service;

/**
 * 权限菜单关联表(RbacPrivilegeMenu)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:27
 */
@Service("rbacPrivilegeMenuService")
public class RbacPrivilegeMenuServiceImpl extends ServiceImpl<RbacPrivilegeMenuDao, RbacPrivilegeMenu> implements RbacPrivilegeMenuService {

}

