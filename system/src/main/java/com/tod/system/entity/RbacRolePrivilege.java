package com.tod.system.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 角色权限关联表(RbacRolePrivilege)表实体类
 *
 * @author makejava
 * @since 2021-12-31 16:12:28
 */
@SuppressWarnings("serial")
public class RbacRolePrivilege extends Model<RbacRolePrivilege> {
    //角色id
    private Long roleId;
    //权限id
    private Long privilegeId;
    //删除标识
    private Integer delFlag;


    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

