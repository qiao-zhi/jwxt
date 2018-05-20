package cn.xm.jwxt.bean.outGraduateDesignApply;

public class Checkassignment {
    private String checkId;

    private String assignmentid;

    private String checkpeople;

    private String teachersign;

    private String remark;

    public String getCheckId() {
        return checkId;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId == null ? null : checkId.trim();
    }

    public String getAssignmentid() {
        return assignmentid;
    }

    public void setAssignmentid(String assignmentid) {
        this.assignmentid = assignmentid == null ? null : assignmentid.trim();
    }

    public String getCheckpeople() {
        return checkpeople;
    }

    public void setCheckpeople(String checkpeople) {
        this.checkpeople = checkpeople == null ? null : checkpeople.trim();
    }

    public String getTeachersign() {
        return teachersign;
    }

    public void setTeachersign(String teachersign) {
        this.teachersign = teachersign == null ? null : teachersign.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}