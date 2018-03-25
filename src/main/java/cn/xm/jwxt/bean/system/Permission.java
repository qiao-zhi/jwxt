package cn.xm.jwxt.bean.system;

public class Permission {
    private String permissionid;

    private String permissionname;

    private String permissionstatus;

    private String permissiontype;

    private String url;

    private String permissioncode;

    private String parentid;

    private String sortnum;

    private String description;

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