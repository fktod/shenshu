package com.tod.system.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tod.system.entity.RbacPrivilegeOperation;
import com.tod.system.service.RbacPrivilegeOperationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 权限操作关联表(RbacPrivilegeOperation)表控制层
 *
 * @author makejava
 * @since 2021-12-31 16:12:27
 */
@RestController
@RequestMapping("rbacPrivilegeOperation")
public class RbacPrivilegeOperationController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RbacPrivilegeOperationService rbacPrivilegeOperationService;

    /**
     * 分页查询所有数据
     *
     * @param page                   分页对象
     * @param rbacPrivilegeOperation 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<RbacPrivilegeOperation> page, RbacPrivilegeOperation rbacPrivilegeOperation) {
        return success(this.rbacPrivilegeOperationService.page(page, new QueryWrapper<>(rbacPrivilegeOperation)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.rbacPrivilegeOperationService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param rbacPrivilegeOperation 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody RbacPrivilegeOperation rbacPrivilegeOperation) {
        return success(this.rbacPrivilegeOperationService.save(rbacPrivilegeOperation));
    }

    /**
     * 修改数据
     *
     * @param rbacPrivilegeOperation 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody RbacPrivilegeOperation rbacPrivilegeOperation) {
        return success(this.rbacPrivilegeOperationService.updateById(rbacPrivilegeOperation));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.rbacPrivilegeOperationService.removeByIds(idList));
    }
}

