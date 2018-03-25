package cn.xm.jwxt.bean.trainScheme;

public class Trainschemecoursedesign {
    private String traincoursedesignid;

    private String trainingschemeid;

    private String coursedesignname;

    private String semester;

    private String yearnum;

    private String isarrange;

    private String remark;

    public String getTraincoursedesignid() {
        return traincoursedesignid;
    }

    public void setTraincoursedesignid(String traincoursedesignid) {
        this.traincoursedesignid = traincoursedesignid == null ? null : traincoursedesignid.trim();
    }

    public String getTrainingschemeid() {
        return trainingschemeid;
    }

    public void setTrainingschemeid(String trainingschemeid) {
        this.trainingschemeid = trainingschemeid == null ? null : trainingschemeid.trim();
    }

    public String getCoursedesignname() {
        return coursedesignname;
    }

    public void setCoursedesignname(String coursedesignname) {
        this.coursedesignname = coursedesignname == null ? null : coursedesignname.trim();
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester == null ? null : semester.trim();
    }

    public String getYearnum() {
        return yearnum;
    }

    public void setYearnum(String yearnum) {
        this.yearnum = yearnum == null ? null : yearnum.trim();
    }

    public String getIsarrange() {
        return isarrange;
    }

    public void setIsarrange(String isarrange) {
        this.isarrange = isarrange == null ? null : isarrange.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}