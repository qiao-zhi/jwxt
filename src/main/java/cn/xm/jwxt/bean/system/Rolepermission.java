package cn.xm.jwxt.bean.system;

import java.util.List;

public class Rolepermission {
    private Integer rolepermissionid;

    private String roleid;

    private String permissionid;

    private Permission permission;

    public Integer getRolepermissionid() {
        return rolepermissionid;
    }

    public void setRolepermissionid(Integer rolepermissionid) {
        this.rolepermissionid = rolepermissionid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }

    public Permission getPermission() {
        return permission;
    }

    public void setPermission(Permission permission) {
        this.permission = permission;
    }
}