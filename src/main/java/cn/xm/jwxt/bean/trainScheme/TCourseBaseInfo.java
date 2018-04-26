package cn.xm.jwxt.bean.trainScheme;

public class TCourseBaseInfo {
    private String courseid;//课程编号

    private String coursenum;//课程编号

    private String courseplatform;//课程平台

    private String coursenature;//课程性质

    private String coursenamecn;//中文名称

    private String coursenameen;//英文名称

    private String credit;//学分

    private String coursehour;//学时

    private String teachhour;//讲课时长

    private String experimenthour;//实验时长

    private String computerhour;//上级时长

    private String practicehour;//实践时长

    private String weeklyhour;//周学时分配

    private String scoringway;//计分方式

    private String coursehourmethod;//学时单位

    private String remark1;//备注一(用于标记是否删除)

    private String remark2;//备注二

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getCoursenum() {
        return coursenum;
    }

    public void setCoursenum(String coursenum) {
        this.coursenum = coursenum == null ? null : coursenum.trim();
    }

    public String getCourseplatform() {
        return courseplatform;
    }

    public void setCourseplatform(String courseplatform) {
        this.courseplatform = courseplatform == null ? null : courseplatform.trim();
    }

    public String getCoursenature() {
        return coursenature;
    }

    public void setCoursenature(String coursenature) {
        this.coursenature = coursenature == null ? null : coursenature.trim();
    }

    public String getCoursenamecn() {
        return coursenamecn;
    }

    public void setCoursenamecn(String coursenamecn) {
        this.coursenamecn = coursenamecn == null ? null : coursenamecn.trim();
    }

    public String getCoursenameen() {
        return coursenameen;
    }

    public void setCoursenameen(String coursenameen) {
        this.coursenameen = coursenameen == null ? null : coursenameen.trim();
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit == null ? null : credit.trim();
    }

    public String getCoursehour() {
        return coursehour;
    }

    public void setCoursehour(String coursehour) {
        this.coursehour = coursehour == null ? null : coursehour.trim();
    }

    public String getTeachhour() {
        return teachhour;
    }

    public void setTeachhour(String teachhour) {
        this.teachhour = teachhour == null ? null : teachhour.trim();
    }

    public String getExperimenthour() {
        return experimenthour;
    }

    public void setExperimenthour(String experimenthour) {
        this.experimenthour = experimenthour == null ? null : experimenthour.trim();
    }

    public String getComputerhour() {
        return computerhour;
    }

    public void setComputerhour(String computerhour) {
        this.computerhour = computerhour == null ? null : computerhour.trim();
    }

    public String getPracticehour() {
        return practicehour;
    }

    public void setPracticehour(String practicehour) {
        this.practicehour = practicehour == null ? null : practicehour.trim();
    }

    public String getWeeklyhour() {
        return weeklyhour;
    }

    public void setWeeklyhour(String weeklyhour) {
        this.weeklyhour = weeklyhour == null ? null : weeklyhour.trim();
    }

    public String getScoringway() {
        return scoringway;
    }

    public void setScoringway(String scoringway) {
        this.scoringway = scoringway == null ? null : scoringway.trim();
    }

    public String getCoursehourmethod() {
        return coursehourmethod;
    }

    public void setCoursehourmethod(String coursehourmethod) {
        this.coursehourmethod = coursehourmethod == null ? null : coursehourmethod.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    @Override
    public String toString() {
        return "TCourseBaseInfo{" +
                "courseid='" + courseid + '\'' +
                ", coursenum='" + coursenum + '\'' +
                ", courseplatform='" + courseplatform + '\'' +
                ", coursenature='" + coursenature + '\'' +
                ", coursenamecn='" + coursenamecn + '\'' +
                ", coursenameen='" + coursenameen + '\'' +
                ", credit='" + credit + '\'' +
                ", coursehour='" + coursehour + '\'' +
                ", teachhour='" + teachhour + '\'' +
                ", experimenthour='" + experimenthour + '\'' +
                ", computerhour='" + computerhour + '\'' +
                ", practicehour='" + practicehour + '\'' +
                ", weeklyhour='" + weeklyhour + '\'' +
                ", scoringway='" + scoringway + '\'' +
                ", coursehourmethod='" + coursehourmethod + '\'' +
                ", remark1='" + remark1 + '\'' +
                ", remark2='" + remark2 + '\'' +
                '}';
    }
}