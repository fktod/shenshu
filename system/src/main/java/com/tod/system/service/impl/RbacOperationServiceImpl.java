package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacOperationDao;
import com.tod.system.entity.RbacOperation;
import com.tod.system.service.RbacOperationService;
import org.springframework.stereotype.Service;

/**
 * 功能操作表(RbacOperation)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:25
 */
@Service("rbacOperationService")
public class RbacOperationServiceImpl extends ServiceImpl<RbacOperationDao, RbacOperation> implements RbacOperationService {

}

