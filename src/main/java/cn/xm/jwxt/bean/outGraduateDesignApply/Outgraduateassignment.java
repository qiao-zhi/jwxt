package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;
import java.util.List;

public class Outgraduateassignment {
    private String assignmentid;

    private String outsideapplyid;

    private String tablename;

    private String samegroup;

    private Date starttime;

    private Date endtime;

    private String title;

    private String request;

    private String content;

    private String submitfile;

    private String studentsign;

    private String isok;

    private String checkstatus;

    private String remark1;

    private Outgradesigninfo outgradesigninfo;
    private Outsidegradesignagreemen outsidegradesignagreemen;
    private Gradesignleaveapply gradesignleaveapply;
    private List<Checkassignment> checkassignments;

    public Outgradesigninfo getOutgradesigninfo() {
        return outgradesigninfo;
    }

    public void setOutgradesigninfo(Outgradesigninfo outgradesigninfo) {
        this.outgradesigninfo = outgradesigninfo;
    }

    public String getAssignmentid() {
        return assignmentid;
    }

    public Outsidegradesignagreemen getOutsidegradesignagreemen() {
        return outsidegradesignagreemen;
    }

    public void setOutsidegradesignagreemen(Outsidegradesignagreemen outsidegradesignagreemen) {
        this.outsidegradesignagreemen = outsidegradesignagreemen;
    }

    public Gradesignleaveapply getGradesignleaveapply() {
        return gradesignleaveapply;
    }

    public void setGradesignleaveapply(Gradesignleaveapply gradesignleaveapply) {
        this.gradesignleaveapply = gradesignleaveapply;
    }

    public List<Checkassignment> getCheckassignments() {
        return checkassignments;
    }

    public void setCheckassignments(List<Checkassignment> checkassignments) {
        this.checkassignments = checkassignments;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid == null ? null : assignmentid.trim();
    }

    public String getOutsideapplyid() {
        return outsideapplyid;
    }

    public void setOutsideapplyid(String outsideapplyid) {
        this.outsideapplyid = outsideapplyid == null ? null : outsideapplyid.trim();
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    public String getSamegroup() {
        return samegroup;
    }

    public void setSamegroup(String samegroup) {
        this.samegroup = samegroup == null ? null : samegroup.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getSubmitfile() {
        return submitfile;
    }

    public void setSubmitfile(String submitfile) {
        this.submitfile = submitfile == null ? null : submitfile.trim();
    }

    public String getStudentsign() {
        return studentsign;
    }

    public void setStudentsign(String studentsign) {
        this.studentsign = studentsign == null ? null : studentsign.trim();
    }

    public String getIsok() {
        return isok;
    }

    public void setIsok(String isok) {
        this.isok = isok == null ? null : isok.trim();
    }

    public String getCheckstatus() {
        return checkstatus;
    }

    public void setCheckstatus(String checkstatus) {
        this.checkstatus = checkstatus == null ? null : checkstatus.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }
}