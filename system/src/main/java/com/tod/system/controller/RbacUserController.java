package com.tod.system.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tod.system.entity.RbacUser;
import com.tod.system.entity.RbacUserRole;
import com.tod.system.service.RbacUserRoleService;
import com.tod.system.service.RbacUserService;
import com.tod.system.utils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 用户表(RbacUser)表控制层
 *
 * @author makejava
 * @since 2021-12-31 16:12:28
 */
@RestController
@RequestMapping("rbacUser")
public class RbacUserController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RbacUserService rbacUserService;
    @Autowired
    private RbacUserRoleService rbacUserRoleService;

    /**
     * 分页查询所有数据
     *
     * @param page     分页对象
     * @param rbacUser 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<RbacUser> page, RbacUser rbacUser) {
        return success(this.rbacUserService.page(page, new QueryWrapper<>(rbacUser)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.rbacUserService.getById(id));
    }

    @GetMapping("username/{username}")
    public R getByUsername(@PathVariable String username) {
        RbacUser byUsername = this.rbacUserService.getByUsername(username);
        if (byUsername != null) {
            List<RbacUserRole> list = rbacUserRoleService.list(Wrappers.<RbacUserRole>lambdaQuery().eq(RbacUserRole::getUserId, byUsername.getId()));
            Map<String, Object> userMap = BeanUtils.beanToMap(byUsername);
            userMap.put("roles", list);
            return success(userMap);
        }
        return failed("账号不存在");
    }

    /**
     * 新增数据
     *
     * @param rbacUser 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody RbacUser rbacUser) {
        return success(this.rbacUserService.save(rbacUser));
    }

    /**
     * 修改数据
     *
     * @param rbacUser 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody RbacUser rbacUser) {
        return success(this.rbacUserService.updateById(rbacUser));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.rbacUserService.removeByIds(idList));
    }
}

