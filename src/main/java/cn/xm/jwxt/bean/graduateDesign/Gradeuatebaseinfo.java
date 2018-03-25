package cn.xm.jwxt.bean.graduateDesign;

public class Gradeuatebaseinfo {
    private String gradesignid;

    private String graduatedesignname;

    private String majorid;

    private String graduatedesc;

    private String yearnum;

    private String semesternum;

    private String status;

    private String remark;

    public String getGradesignid() {
        return gradesignid;
    }

    public void setGradesignid(String gradesignid) {
        this.gradesignid = gradesignid == null ? null : gradesignid.trim();
    }

    public String getGraduatedesignname() {
        return graduatedesignname;
    }

    public void setGraduatedesignname(String graduatedesignname) {
        this.graduatedesignname = graduatedesignname == null ? null : graduatedesignname.trim();
    }

    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid == null ? null : majorid.trim();
    }

    public String getGraduatedesc() {
        return graduatedesc;
    }

    public void setGraduatedesc(String graduatedesc) {
        this.graduatedesc = graduatedesc == null ? null : graduatedesc.trim();
    }

    public String getYearnum() {
        return yearnum;
    }

    public void setYearnum(String yearnum) {
        this.yearnum = yearnum == null ? null : yearnum.trim();
    }

    public String getSemesternum() {
        return semesternum;
    }

    public void setSemesternum(String semesternum) {
        this.semesternum = semesternum == null ? null : semesternum.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}