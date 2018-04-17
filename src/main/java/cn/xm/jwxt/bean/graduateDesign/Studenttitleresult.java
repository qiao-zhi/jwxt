package cn.xm.jwxt.bean.graduateDesign;

/**
 * 学生选题最终结果表
 */
public class Studenttitleresult {
    private String studenttitleresultid;

    private String gradesignid;

    private String studentid;

    private String teachertitleid;

    private String finallyname;

    private String isout;

    private String remark;

    public String getStudenttitleresultid() {
        return studenttitleresultid;
    }

    public void setStudenttitleresultid(String studenttitleresultid) {
        this.studenttitleresultid = studenttitleresultid == null ? null : studenttitleresultid.trim();
    }

    public String getGradesignid() {
        return gradesignid;
    }

    public void setGradesignid(String gradesignid) {
        this.gradesignid = gradesignid == null ? null : gradesignid.trim();
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getTeachertitleid() {
        return teachertitleid;
    }

    public void setTeachertitleid(String teachertitleid) {
        this.teachertitleid = teachertitleid == null ? null : teachertitleid.trim();
    }

    public String getFinallyname() {
        return finallyname;
    }

    public void setFinallyname(String finallyname) {
        this.finallyname = finallyname == null ? null : finallyname.trim();
    }

    public String getIsout() {
        return isout;
    }

    public void setIsout(String isout) {
        this.isout = isout == null ? null : isout.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}