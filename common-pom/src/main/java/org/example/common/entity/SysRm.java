package org.example.common.entity;

import java.io.Serializable;

/**
 * auth 鉴权模块实体类
 * @author Fanxing
 * @since 2021-04-21 13:18:19
 */
public class SysRm implements Serializable {
    private static final long serialVersionUID = 315363036912354652L;
    
    private Integer rmId;
    
    private Integer roleId;
    
    private Integer menuId;

        
    public Integer getRmId() {
        return rmId;
    }

    public void setRmId(Integer rmId) {
        this.rmId = rmId;
    }
        
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
        
    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

}