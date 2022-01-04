package com.tod.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tod.system.dao.RbacApiDao;
import com.tod.system.entity.RbacApi;
import com.tod.system.service.RbacApiService;
import org.springframework.stereotype.Service;

/**
 * API接口表(RbacApi)表服务实现类
 *
 * @author makejava
 * @since 2021-12-31 16:12:23
 */
@Service("rbacApiService")
public class RbacApiServiceImpl extends ServiceImpl<RbacApiDao, RbacApi> implements RbacApiService {

}

