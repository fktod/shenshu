package com.tod.system.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 用户角色关联表(RbacUserRole)表实体类
 *
 * @author makejava
 * @since 2021-12-31 16:12:29
 */
@SuppressWarnings("serial")
public class RbacUserRole extends Model<RbacUserRole> {
    //用户id
    private Long userId;
    //角色id
    private Long roleId;
    //删除标识
    private Integer delFlag;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

