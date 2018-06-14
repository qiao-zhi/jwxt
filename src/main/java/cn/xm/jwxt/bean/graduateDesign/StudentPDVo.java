package cn.xm.jwxt.bean.graduateDesign;

public class StudentPDVo {
    /**
     * 任务书id
     */
    private String bookID;

    /**
     * 判断任务书是否签字
     */
    private String isStudentSign;

    private String studentName;

    private String teacherName;

    /**
     * 是否上传论文
     */
    private String isUpThesis;

    /**
     * 课题id
     */
    private String teacherTitleID;

    /**
     * 课题名称
     */
    private String titlename;

    /**
     * 课题类型
     */
    private String projectType;

    /**
     * 课题来源
     */
    private String titleOrigin;

    /**
     * 判断进程表是否提交
     */
    private String fillStatus;

    public String getTeacherTitleID() {
        return teacherTitleID;
    }

    public void setTeacherTitleID(String teacherTitleID) {
        this.teacherTitleID = teacherTitleID;
    }

    public String getTitlename() {
        return titlename;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getTitleOrigin() {
        return titleOrigin;
    }

    public void setTitleOrigin(String titleOrigin) {
        this.titleOrigin = titleOrigin;
    }

    public String getBookID() {
        return bookID;
    }

    public void setBookID(String bookID) {
        this.bookID = bookID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getIsUpThesis() {
        return isUpThesis;
    }

    public void setIsUpThesis(String isUpThesis) {
        this.isUpThesis = isUpThesis;
    }

    public String getIsStudentSign() {
        return isStudentSign;
    }

    public void setIsStudentSign(String isStudentSign) {
        this.isStudentSign = isStudentSign;
    }

    public String getFillStatus() {
        return fillStatus;
    }

    public void setFillStatus(String fillStatus) {
        this.fillStatus = fillStatus;
    }
}
