package cn.xm.jwxt.bean.system;

public class Rolepermission {
    private Integer rolepermissionid;

    private String roleid;

    private String permissionid;

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
}