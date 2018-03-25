package cn.xm.jwxt.bean.arrangeCourse;

public class Noticeinfo {
    private String noticebookid;

    private String noticebookname;

    private String yearnum;

    private String semester;

    private String institutename;

    private String remark;

    public String getNoticebookid() {
        return noticebookid;
    }

    public void setNoticebookid(String noticebookid) {
        this.noticebookid = noticebookid == null ? null : noticebookid.trim();
    }

    public String getNoticebookname() {
        return noticebookname;
    }

    public void setNoticebookname(String noticebookname) {
        this.noticebookname = noticebookname == null ? null : noticebookname.trim();
    }

    public String getYearnum() {
        return yearnum;
    }

    public void setYearnum(String yearnum) {
        this.yearnum = yearnum == null ? null : yearnum.trim();
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester == null ? null : semester.trim();
    }

    public String getInstitutename() {
        return institutename;
    }

    public void setInstitutename(String institutename) {
        this.institutename = institutename == null ? null : institutename.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}