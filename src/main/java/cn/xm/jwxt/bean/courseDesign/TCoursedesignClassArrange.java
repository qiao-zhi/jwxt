package cn.xm.jwxt.bean.courseDesign;

public class TCoursedesignClassArrange {
    private String coursedesignclassarrangeid;

    private String coursedesignarrangeid;

    private String classid;

    public String getCoursedesignclassarrangeid() {
        return coursedesignclassarrangeid;
    }

    public void setCoursedesignclassarrangeid(String coursedesignclassarrangeid) {
        this.coursedesignclassarrangeid = coursedesignclassarrangeid == null ? null : coursedesignclassarrangeid.trim();
    }

    public String getCoursedesignarrangeid() {
        return coursedesignarrangeid;
    }

    public void setCoursedesignarrangeid(String coursedesignarrangeid) {
        this.coursedesignarrangeid = coursedesignarrangeid == null ? null : coursedesignarrangeid.trim();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }
}