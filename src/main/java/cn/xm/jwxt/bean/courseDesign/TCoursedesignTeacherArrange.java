package cn.xm.jwxt.bean.courseDesign;

public class TCoursedesignTeacherArrange {
    private String coursedesignteacherarrangeid;

    private String coursedesignarrangeid;

    private String teacherid;

    private String classnames;

    private String display;

    public String getCoursedesignteacherarrangeid() {
        return coursedesignteacherarrangeid;
    }

    public void setCoursedesignteacherarrangeid(String coursedesignteacherarrangeid) {
        this.coursedesignteacherarrangeid = coursedesignteacherarrangeid == null ? null : coursedesignteacherarrangeid.trim();
    }

    public String getCoursedesignarrangeid() {
        return coursedesignarrangeid;
    }

    public void setCoursedesignarrangeid(String coursedesignarrangeid) {
        this.coursedesignarrangeid = coursedesignarrangeid == null ? null : coursedesignarrangeid.trim();
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getClassnames() {
        return classnames;
    }

    public void setClassnames(String classnames) {
        this.classnames = classnames == null ? null : classnames.trim();
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display == null ? null : display.trim();
    }
}