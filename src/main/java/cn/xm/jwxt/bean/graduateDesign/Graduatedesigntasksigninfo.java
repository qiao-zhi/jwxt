package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

public class Graduatedesigntasksigninfo {
    private String gratasksignid;

    private String signId;

    private String bookid;

    private Date tasksigntime;

    private String tasksigntype;

    public String getGratasksignid() {
        return gratasksignid;
    }

    public void setGratasksignid(String gratasksignid) {
        this.gratasksignid = gratasksignid == null ? null : gratasksignid.trim();
    }

    public String getSignId() {
        return signId;
    }

    public void setSignId(String signId) {
        this.signId = signId == null ? null : signId.trim();
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid == null ? null : bookid.trim();
    }

    public Date getTasksigntime() {
        return tasksigntime;
    }

    public void setTasksigntime(Date tasksigntime) {
        this.tasksigntime = tasksigntime;
    }

    public String getTasksigntype() {
        return tasksigntype;
    }

    public void setTasksigntype(String tasksigntype) {
        this.tasksigntype = tasksigntype == null ? null : tasksigntype.trim();
    }
}