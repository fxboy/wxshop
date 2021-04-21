package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:20
 */
public class SysRole implements Serializable {
    private static final long serialVersionUID = 220152995280073332L;
    
    private Integer roleId;
    
    private String roleName;
    /**
    * 是否启用
    */
    private Integer roleStatus;

        
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
        
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
        
    public Integer getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(Integer roleStatus) {
        this.roleStatus = roleStatus;
    }

}