package cn.xm.jwxt.bean.system;

public class Permission {
    private String permissionid;//主键

    private String permissionname;//权限名称

    private String permissionstatus;//权限状态

    private String permissiontype;//权限类型(菜单，权限还是其他)

    private String url;//对应的URL地址

    private String permissioncode;//权限码

    private String parentid;//父全选编号

    private String sortnum;//排序码(用于菜单排序)

    private String description;//描述

    public String getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(String permissionid) {
        this.permissionid = permissionid == null ? null : permissionid.trim();
    }

    public String getPermissionname() {
        return permissionname;
    }

    public void setPermissionname(String permissionname) {
        this.permissionname = permissionname == null ? null : permissionname.trim();
    }

    public String getPermissionstatus() {
        return permissionstatus;
    }

    public void setPermissionstatus(String permissionstatus) {
        this.permissionstatus = permissionstatus == null ? null : permissionstatus.trim();
    }

    public String getPermissiontype() {
        return permissiontype;
    }

    public void setPermissiontype(String permissiontype) {
        this.permissiontype = permissiontype == null ? null : permissiontype.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPermissioncode() {
        return permissioncode;
    }

    public void setPermissioncode(String permissioncode) {
        this.permissioncode = permissioncode == null ? null : permissioncode.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getSortnum() {
        return sortnum;
    }

    public void setSortnum(String sortnum) {
        this.sortnum = sortnum == null ? null : sortnum.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}