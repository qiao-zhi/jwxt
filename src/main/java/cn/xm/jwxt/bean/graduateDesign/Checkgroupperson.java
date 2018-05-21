package cn.xm.jwxt.bean.graduateDesign;

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;

/**
 * 检查小组成员表
 */
public class Checkgroupperson {
    private Integer gropersonid;

    private String teacherid;

    private String teachername;

    private String groupid;

    private String grouprole;

    private String remark;

    private Gradesigncheckgroup gradesigncheckgroup;

    private TTeacherBaseInfo tTeacherBaseInfo;

    public void settTeacherBaseInfo(TTeacherBaseInfo tTeacherBaseInfo) {
        this.tTeacherBaseInfo = tTeacherBaseInfo;
    }

    public TTeacherBaseInfo gettTeacherBaseInfo() {
        return tTeacherBaseInfo;
    }

    public void setGradesigncheckgroup(Gradesigncheckgroup gradesigncheckgroup) {
        this.gradesigncheckgroup = gradesigncheckgroup;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public Gradesigncheckgroup getGradesigncheckgroup() {
        return gradesigncheckgroup;
    }

    public Integer getGropersonid() {
        return gropersonid;
    }

    public void setGropersonid(Integer gropersonid) {
        this.gropersonid = gropersonid;
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