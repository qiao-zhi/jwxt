package cn.xm.jwxt.bean.system;

import java.util.List;
import java.util.Set;

public class User {
    private String userid;//用户ID

    private String usercode;//用户code(登录用这个)

    private String username;//用户姓名

    private String password;//用户密码

    private String usersort;//用户类型

    private String userstuteanum;//用户编号(学号或者教师编号)

    private String userunitname;//用户所属单位名称(班级名称或者教研室名称)

    private String userunitnum;//班级编码或者教研室编码

    private String isuse;//是否在用

    private String remark1;//备注

    private List<Permission> permissions;//所有权限

    private Set<String> permissionCodes;//所有权限码

    private List<Permission> menuPermissions;//所有菜单权限(按序号排列)

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUsersort() {
        return usersort;
    }

    public void setUsersort(String usersort) {
        this.usersort = usersort == null ? null : usersort.trim();
    }

    public String getUserstuteanum() {
        return userstuteanum;
    }

    public void setUserstuteanum(String userstuteanum) {
        this.userstuteanum = userstuteanum == null ? null : userstuteanum.trim();
    }

    public String getUserunitname() {
        return userunitname;
    }

    public void setUserunitname(String userunitname) {
        this.userunitname = userunitname == null ? null : userunitname.trim();
    }

    public String getUserunitnum() {
        return userunitnum;
    }

    public void setUserunitnum(String userunitnum) {
        this.userunitnum = userunitnum == null ? null : userunitnum.trim();
    }

    public String getIsuse() {
        return isuse;
    }

    public void setIsuse(String isuse) {
        this.isuse = isuse == null ? null : isuse.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<String> getPermissionCodes() {
        return permissionCodes;
    }

    public void setPermissionCodes(Set<String> permissionCodes) {

        this.permissionCodes = permissionCodes;
    }

    public List<Permission> getMenuPermissions() {
        return menuPermissions;
    }

    public void setMenuPermissions(List<Permission> menuPermissions) {
        this.menuPermissions = menuPermissions;
    }
}