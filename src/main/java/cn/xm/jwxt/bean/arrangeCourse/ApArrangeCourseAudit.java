package cn.xm.jwxt.bean.arrangeCourse;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ApArrangeCourseAudit {
    private String auditId;

    private String arrangeTaskId;

    private String auditorName;

    private String auditorId;

    private Date auditTime;

    private String auditSuggestion;

    private String auditResult;

    private String remark;

    public String getAuditId() {
        return auditId;
    }

    public void setAuditId(String auditId) {
        this.auditId = auditId == null ? null : auditId.trim();
    }

    public String getArrangeTaskId() {
        return arrangeTaskId;
    }

    public void setArrangeTaskId(String arrangeTaskId) {
        this.arrangeTaskId = arrangeTaskId == null ? null : arrangeTaskId.trim();
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName == null ? null : auditorName.trim();
    }

    public String getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(String auditorId) {
        this.auditorId = auditorId == null ? null : auditorId.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditSuggestion() {
        return auditSuggestion;
    }

    public void setAuditSuggestion(String auditSuggestion) {
        this.auditSuggestion = auditSuggestion == null ? null : auditSuggestion.trim();
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult == null ? null : auditResult.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}