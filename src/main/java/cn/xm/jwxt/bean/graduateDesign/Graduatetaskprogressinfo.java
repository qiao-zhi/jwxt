package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

/**
 * 毕设任务进度表
 */
public class Graduatetaskprogressinfo {
    private String progressid;

    private String bookid;

    private String tasktimerange;

    private String content;

    private Date edittime;

    private String progresssort;

    private String remark;

    private String fillStatus;

    public String getFillStatus() {
        return fillStatus;
    }

    public void setFillStatus(String fillStatus) {
        this.fillStatus = fillStatus;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getProgressid() {
        return progressid;
    }

    public void setProgressid(String progressid) {
        this.progressid = progressid;
    }

    public String getTasktimerange() {
        return tasktimerange;
    }

    public void setTasktimerange(String tasktimerange) {
        this.tasktimerange = tasktimerange == null ? null : tasktimerange.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }

    public String getProgresssort() {
        return progresssort;
    }

    public void setProgresssort(String progresssort) {
        this.progresssort = progresssort == null ? null : progresssort.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}