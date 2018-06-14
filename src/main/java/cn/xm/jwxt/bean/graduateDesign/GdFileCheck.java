package cn.xm.jwxt.bean.graduateDesign;

public class GdFileCheck {
    private String id;//审核id

    private String auditResult;
    private String auditContent;
    private String auditTime;
    private String StudentTitleresultID;//结果id

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuditResult() {
        return auditResult;
    }

    public void setAuditResult(String auditResult) {
        this.auditResult = auditResult;
    }

    public String getAuditContent() {
        return auditContent;
    }

    public void setAuditContent(String auditContent) {
        this.auditContent = auditContent;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public String getStudentTitleresultID() {
        return StudentTitleresultID;
    }

    public void setStudentTitleresultID(String studentTitleresultID) {
        StudentTitleresultID = studentTitleresultID;
    }
}
