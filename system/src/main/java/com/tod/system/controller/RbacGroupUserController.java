package com.tod.system.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tod.system.entity.RbacGroupUser;
import com.tod.system.service.RbacGroupUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 用户组用户关联表(RbacGroupUser)表控制层
 *
 * @author makejava
 * @since 2021-12-31 16:12:24
 */
@RestController
@RequestMapping("rbacGroupUser")
public class RbacGroupUserController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RbacGroupUserService rbacGroupUserService;

    /**
     * 分页查询所有数据
     *
     * @param page          分页对象
     * @param rbacGroupUser 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<RbacGroupUser> page, RbacGroupUser rbacGroupUser) {
        return success(this.rbacGroupUserService.page(page, new QueryWrapper<>(rbacGroupUser)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.rbacGroupUserService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param rbacGroupUser 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody RbacGroupUser rbacGroupUser) {
        return success(this.rbacGroupUserService.save(rbacGroupUser));
    }

    /**
     * 修改数据
     *
     * @param rbacGroupUser 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody RbacGroupUser rbacGroupUser) {
        return success(this.rbacGroupUserService.updateById(rbacGroupUser));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.rbacGroupUserService.removeByIds(idList));
    }
}

