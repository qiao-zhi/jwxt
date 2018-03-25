package cn.xm.jwxt.bean.graduateDesign;

public class Checkgroupperson {
    private Integer gropersonid;

    private String teacherid;

    private String teachername;

    private String groupid;

    private String grouprole;

    private String remark;

    public Integer getGropersonid() {
        return gropersonid;
    }

    public void setGropersonid(Integer gropersonid) {
        this.gropersonid = gropersonid;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getGrouprole() {
        return grouprole;
    }

    public void setGrouprole(String grouprole) {
        this.grouprole = grouprole == null ? null : grouprole.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}