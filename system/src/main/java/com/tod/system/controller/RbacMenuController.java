package com.tod.system.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tod.system.entity.RbacMenu;
import com.tod.system.service.RbacMenuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 菜单表(RbacMenu)表控制层
 *
 * @author makejava
 * @since 2021-12-31 16:12:25
 */
@RestController
@RequestMapping("rbacMenu")
public class RbacMenuController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RbacMenuService rbacMenuService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param rbacMenu 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<RbacMenu> page, RbacMenu rbacMenu) {
        return success(this.rbacMenuService.page(page, new QueryWrapper<>(rbacMenu)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.rbacMenuService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param rbacMenu 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody RbacMenu rbacMenu) {
        return success(this.rbacMenuService.save(rbacMenu));
    }

    /**
     * 修改数据
     *
     * @param rbacMenu 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody RbacMenu rbacMenu) {
        return success(this.rbacMenuService.updateById(rbacMenu));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.rbacMenuService.removeByIds(idList));
    }
}

