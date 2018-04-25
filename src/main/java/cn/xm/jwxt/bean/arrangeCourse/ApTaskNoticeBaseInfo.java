package cn.xm.jwxt.bean.arrangeCourse;

import java.util.Date;

public class ApTaskNoticeBaseInfo {
    private String noticeBookId;

    private String noticeBookName;

    private String academicYear;

    private String term;

    private String academicId;

    private String academicName;

    private String createrName;

    private String createrId;

    private Date createTime;

    private String isInput;

    private String isDelete;

    private String remark;

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

    public String getAcademicId() {
        return academicId;
    }

    public void setAcademicId(String academicId) {
        this.academicId = academicId == null ? null : academicId.trim();
    }

    public String getAcademicName() {
        return academicName;
    }

    public void setAcademicName(String academicName) {
        this.academicName = academicName == null ? null : academicName.trim();
    }

    public String getCreaterName() {
        return createrName;
    }

    public void setCreaterName(String createrName) {
        this.createrName = createrName == null ? null : createrName.trim();
    }

    public String getCreaterId() {
        return createrId;
    }

    public void setCreaterId(String createrId) {
        this.createrId = createrId == null ? null : createrId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIsInput() {
        return isInput;
    }

    public void setIsInput(String isInput) {
        this.isInput = isInput == null ? null : isInput.trim();
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