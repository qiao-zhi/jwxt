package cn.xm.jwxt.bean.arrangeCourse;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ApArrangeCourseTask {
    private String arrangeTaskId;

    private String noticeBookId;

    private String noticeBookName;

    private String majorName;

    private String majorId;

    private String academicYear;

    private String term;

    private String originatorName;

    private String originatorId;

    private Date taskCreateTime;

    private Date taskReceiptTime;

    private String taskReceiptName;

    private String taskReceiptId;

    private String taskStatus;

    private String isDelete;

    private String remark;

    public String getArrangeTaskId() {
        return arrangeTaskId;
    }

    public void setArrangeTaskId(String arrangeTaskId) {
        this.arrangeTaskId = arrangeTaskId == null ? null : arrangeTaskId.trim();
    }

    public String getNoticeBookId() {
        return noticeBookId;
    }

    public void setNoticeBookId(String noticeBookId) {
        this.noticeBookId = noticeBookId == null ? null : noticeBookId.trim();
    }

    public String getNoticeBookName() {
        return noticeBookName;
    }

    public void setNoticeBookName(String noticeBookName) {
        this.noticeBookName = noticeBookName == null ? null : noticeBookName.trim();
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName == null ? null : majorName.trim();
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId == null ? null : majorId.trim();
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear == null ? null : academicYear.trim();
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term == null ? null : term.trim();
    }

    public String getOriginatorName() {
        return originatorName;
    }

    public void setOriginatorName(String originatorName) {
        this.originatorName = originatorName == null ? null : originatorName.trim();
    }

    public String getOriginatorId() {
        return originatorId;
    }

    public void setOriginatorId(String originatorId) {
        this.originatorId = originatorId == null ? null : originatorId.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getTaskCreateTime() {
        return taskCreateTime;
    }

    public void setTaskCreateTime(Date taskCreateTime) {
        this.taskCreateTime = taskCreateTime;
    }
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getTaskReceiptTime() {
        return taskReceiptTime;
    }

    public void setTaskReceiptTime(Date taskReceiptTime) {
        this.taskReceiptTime = taskReceiptTime;
    }

    public String getTaskReceiptName() {
        return taskReceiptName;
    }

    public void setTaskReceiptName(String taskReceiptName) {
        this.taskReceiptName = taskReceiptName == null ? null : taskReceiptName.trim();
    }

    public String getTaskReceiptId() {
        return taskReceiptId;
    }

    public void setTaskReceiptId(String taskReceiptId) {
        this.taskReceiptId = taskReceiptId == null ? null : taskReceiptId.trim();
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus == null ? null : taskStatus.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}