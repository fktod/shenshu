package com.tod.system.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 权限操作关联表(RbacPrivilegeOperation)表实体类
 *
 * @author makejava
 * @since 2021-12-31 16:12:27
 */
@SuppressWarnings("serial")
public class RbacPrivilegeOperation extends Model<RbacPrivilegeOperation> {
    //权限id
    private Long privilegeId;
    //操作id
    private Long operationId;
    //删除标识
    private Integer delFlag;


    public Long getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }

    public Long getOperationId() {
        return operationId;
    }

    public void setOperationId(Long operationId) {
        this.operationId = operationId;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

