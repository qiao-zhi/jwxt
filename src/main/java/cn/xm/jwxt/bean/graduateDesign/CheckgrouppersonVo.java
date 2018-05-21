/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CheckgrouppersonVo
 * Author:   xuexiaolei
 * Date:     2018/4/30 13:39
 * Description: 检查小组信息及其其他信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈检查小组信息及其其他信息〉
 *
 * @author xuexiaolei
 * @create 2018/4/30
 * @since 1.0.0
 */
public class CheckgrouppersonVo {

    private Integer gropersonid;

    private String teacherid;

    private String groupid;

    private String teachername;

    private String groupname;

    private String groupleader;

    private Integer studentcount;

    private String grouprole;

    private String replyaddress;

    private String arrangetime;

    private String replytime;

    private String groupremark;

    private Integer page;

    private Integer limit;

    private Integer gouppersonCount;

    private String searchTeachername;

    private String searchGroupname;

    public String getArrangetime() {
        return arrangetime;
    }

    public void setArrangetime(String arrangetime) {
        this.arrangetime = arrangetime;
    }

    public Integer getGouppersonCount() {
        return gouppersonCount;
    }

    public void setGouppersonCount(Integer gouppersonCount) {
        this.gouppersonCount = gouppersonCount;
    }

    public String getSearchTeachername() {
        return searchTeachername;
    }

    public void setSearchTeachername(String searchTeachername) {
        this.searchTeachername = searchTeachername;
    }

    public String getSearchGroupname() {
        return searchGroupname;
    }

    public void setSearchGroupname(String searchGroupname) {
        this.searchGroupname = searchGroupname;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

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
        this.teacherid = teacherid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getGroupleader() {
        return groupleader;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public void setGroupleader(String groupleader) {

        this.groupleader = groupleader;
    }

    public Integer getStudentcount() {
        return studentcount;
    }

    public void setStudentcount(Integer studentcount) {
        this.studentcount = studentcount;
    }

    public String getGrouprole() {
        return grouprole;
    }

    public void setGrouprole(String grouprole) {
        this.grouprole = grouprole;
    }

    public String getReplyaddress() {
        return replyaddress;
    }

    public void setReplyaddress(String replyaddress) {
        this.replyaddress = replyaddress;
    }

    public String getGroupremark() {
        return groupremark;
    }

    public void setGroupremark(String groupremark) {
        this.groupremark = groupremark;
    }

    public String getReplytime() {
        return replytime;
    }

    public void setReplytime(String replytime) {
        this.replytime = replytime;
    }
}