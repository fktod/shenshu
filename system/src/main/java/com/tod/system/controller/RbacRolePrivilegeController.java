package com.tod.system.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tod.system.entity.RbacRolePrivilege;
import com.tod.system.service.RbacRolePrivilegeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 角色权限关联表(RbacRolePrivilege)表控制层
 *
 * @author makejava
 * @since 2021-12-31 16:12:28
 */
@RestController
@RequestMapping("rbacRolePrivilege")
public class RbacRolePrivilegeController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RbacRolePrivilegeService rbacRolePrivilegeService;

    /**
     * 分页查询所有数据
     *
     * @param page              分页对象
     * @param rbacRolePrivilege 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<RbacRolePrivilege> page, RbacRolePrivilege rbacRolePrivilege) {
        return success(this.rbacRolePrivilegeService.page(page, new QueryWrapper<>(rbacRolePrivilege)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.rbacRolePrivilegeService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param rbacRolePrivilege 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody RbacRolePrivilege rbacRolePrivilege) {
        return success(this.rbacRolePrivilegeService.save(rbacRolePrivilege));
    }

    /**
     * 修改数据
     *
     * @param rbacRolePrivilege 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody RbacRolePrivilege rbacRolePrivilege) {
        return success(this.rbacRolePrivilegeService.updateById(rbacRolePrivilege));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.rbacRolePrivilegeService.removeByIds(idList));
    }
}

