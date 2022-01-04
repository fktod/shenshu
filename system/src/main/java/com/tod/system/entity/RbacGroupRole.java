package com.tod.system.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 用户组角色关联表(RbacGroupRole)表实体类
 *
 * @author makejava
 * @since 2021-12-31 16:12:24
 */
@SuppressWarnings("serial")
public class RbacGroupRole extends Model<RbacGroupRole> {
    //用户组id
    private Long groupId;
    //角色id
    private Long roleId;
    //删除标识
    private Integer delFlag;


    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
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

