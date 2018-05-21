/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TTeacherInfoVo
 * Author:   xuexiaolei
 * Date:     2018/5/7 18:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.bean.graduateDesign;

/**
 * 〈存放老师信息的表〉<br>
 * 〈〉
 *
 * @author xuexiaolei
 * @create 2018/5/7
 * @since 1.0.0
 */
public class TTeacherInfoVo {

    private String teacherid;

    private String teachername;

    private String studentcount;

    private Integer gropersonid;

    private String groupid;

    private String cencheckinfoid;

    private String pleaid;

    private String grouprole;

    private String groupname;

    private String replyaddress;

    private String arrangetime;

    private String replytime;

    public String getPleaid() {
        return pleaid;
    }

    public void setPleaid(String pleaid) {
        this.pleaid = pleaid;
    }

    public String getStudentcount() {
        return studentcount;
    }

    public void setStudentcount(String studentcount) {
        this.studentcount = studentcount;
    }

    public String getCencheckinfoid() {
        return cencheckinfoid;
    }

    public void setCencheckinfoid(String cencheckinfoid) {
        this.cencheckinfoid = cencheckinfoid;
    }

    public String getArrangetime() {
        return arrangetime;
    }

    public void setArrangetime(String arrangetime) {
        this.arrangetime = arrangetime;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public Integer getGropersonid() {
        return gropersonid;
    }

    public void setGropersonid(Integer gropersonid) {
        this.gropersonid = gropersonid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getGrouprole() {
        return grouprole;
    }

    public void setGrouprole(String grouprole) {
        this.grouprole = grouprole;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getReplyaddress() {
        return replyaddress;
    }

    public void setReplyaddress(String replyaddress) {
        this.replyaddress = replyaddress;
    }

    public String getReplytime() {
        return replytime;
    }

    public void setReplytime(String replytime) {
        this.replytime = replytime;
    }
}