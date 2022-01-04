package com.tod.system.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 权限接口关联表(RbacPrivilegeApi)表实体类
 *
 * @author makejava
 * @since 2021-12-31 16:12:26
 */
@SuppressWarnings("serial")
public class RbacPrivilegeApi extends Model<RbacPrivilegeApi> {
    //权限id
    private Long privilegeId;
    //接口id
    private Long apiId;
    //删除标识
    private Integer delFlag;


    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }

    public Long getApiId() {
        return apiId;
    }

    public void setApiId(Long apiId) {
        this.apiId = apiId;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

