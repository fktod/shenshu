package com.tod.system.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 用户组用户关联表(RbacGroupUser)表实体类
 *
 * @author makejava
 * @since 2021-12-31 16:12:24
 */
@SuppressWarnings("serial")
public class RbacGroupUser extends Model<RbacGroupUser> {
    //用户组id
    private Long groupId;
    //用户id
    private Long id;
    //删除标识
    private Integer delFlag;


    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}

