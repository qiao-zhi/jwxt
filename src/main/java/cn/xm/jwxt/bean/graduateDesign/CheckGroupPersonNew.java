/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CheckGroupPersonNew
 * Author:   xuexiaolei
 * Date:     2018/5/10 21:44
 * Description: 答辩小组成员表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.bean.graduateDesign;

import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈答辩小组成员表〉
 *
 * @author xuexiaolei
 * @create 2018/5/10
 * @since 1.0.0
 */
public class CheckGroupPersonNew {

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