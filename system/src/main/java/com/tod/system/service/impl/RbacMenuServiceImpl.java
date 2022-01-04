package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacMenuDao;
import com.tod.system.entity.RbacMenu;
import com.tod.system.service.RbacMenuService;
import org.springframework.stereotype.Service;

/**
 * 菜单表(RbacMenu)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:25
 */
@Service("rbacMenuService")
public class RbacMenuServiceImpl extends ServiceImpl<RbacMenuDao, RbacMenu> implements RbacMenuService {

}

