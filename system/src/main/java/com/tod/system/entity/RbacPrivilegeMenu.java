package com.tod.system.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 权限菜单关联表(RbacPrivilegeMenu)表实体类
 *
 * @author makejava
 * @since 2021-12-31 16:12:27
 */
@SuppressWarnings("serial")
public class RbacPrivilegeMenu extends Model<RbacPrivilegeMenu> {
    //权限id
    private Long privilegeId;
    //菜单id
    private Long menuId;
    //删除标识
    private Integer delFlag;


    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

