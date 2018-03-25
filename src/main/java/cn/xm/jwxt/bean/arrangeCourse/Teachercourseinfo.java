package cn.xm.jwxt.bean.arrangeCourse;

public class Teachercourseinfo {
    private Integer teachercourseid;

    private String arrangebaseinfoid;

    private String teachercourse;

    private Integer trainscjemeid;

    public Integer getTeachercourseid() {
        return teachercourseid;
    }

    public void setTeachercourseid(Integer teachercourseid) {
        this.teachercourseid = teachercourseid;
    }

    public String getArrangebaseinfoid() {
        return arrangebaseinfoid;
    }

    public void setArrangebaseinfoid(String arrangebaseinfoid) {
        this.arrangebaseinfoid = arrangebaseinfoid == null ? null : arrangebaseinfoid.trim();
    }

    public String getTeachercourse() {
        return teachercourse;
    }

    public void setTeachercourse(String teachercourse) {
        this.teachercourse = teachercourse == null ? null : teachercourse.trim();
    }

    public Integer getTrainscjemeid() {
        return trainscjemeid;
    }

    public void setTrainscjemeid(Integer trainscjemeid) {
        this.trainscjemeid = trainscjemeid;
    }
}