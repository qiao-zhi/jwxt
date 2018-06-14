package cn.xm.jwxt.bean.graduateDesign;

/**
 * 毕设学生选题表
 */
public class Gradesignstudenttitleinfo {
    private String studenttitleid;

    private String studentid;

    private String firstteachertitleid;

    private String secteachertitleid;

    private String ischecked;

    private String remark;

    private String isSubmit;

    public String getIsSubmit() {
        return isSubmit;
    }

    public void setIsSubmit(String isSubmit) {
        this.isSubmit = isSubmit;
    }

    public String getStudenttitleid() {
        return studenttitleid;
    }

    public void setStudenttitleid(String studenttitleid) {
        this.studenttitleid = studenttitleid == null ? null : studenttitleid.trim();
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getFirstteachertitleid() {
        return firstteachertitleid;
    }

    public void setFirstteachertitleid(String firstteachertitleid) {
        this.firstteachertitleid = firstteachertitleid == null ? null : firstteachertitleid.trim();
    }

    public String getSecteachertitleid() {
        return secteachertitleid;
    }

    public void setSecteachertitleid(String secteachertitleid) {
        this.secteachertitleid = secteachertitleid == null ? null : secteachertitleid.trim();
    }

    public String getIschecked() {
        return ischecked;
    }

    public void setIschecked(String ischecked) {
        this.ischecked = ischecked == null ? null : ischecked.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}