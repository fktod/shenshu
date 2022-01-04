package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacGroupDao;
import com.tod.system.entity.RbacGroup;
import com.tod.system.service.RbacGroupService;
import org.springframework.stereotype.Service;

/**
 * 用户组表(RbacGroup)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:24
 */
@Service("rbacGroupService")
public class RbacGroupServiceImpl extends ServiceImpl<RbacGroupDao, RbacGroup> implements RbacGroupService {

}

