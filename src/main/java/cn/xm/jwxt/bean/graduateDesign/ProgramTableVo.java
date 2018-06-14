package cn.xm.jwxt.bean.graduateDesign;

public class ProgramTableVo {

    private String studentName;
    private String teacherName;
    private String className;
    private String studentNum;
    private String thesisTitle;
    private String gdTitle;//毕设题目
    private String taskTimeRange;
    private String content;
    private String progressId;//进度id

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

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(String studentNum) {
        this.studentNum = studentNum;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public String getGdTitle() {
        return gdTitle;
    }

    public void setGdTitle(String gdTitle) {
        this.gdTitle = gdTitle;
    }

    public String getTaskTimeRange() {
        return taskTimeRange;
    }

    public void setTaskTimeRange(String taskTimeRange) {
        this.taskTimeRange = taskTimeRange;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getProgressId() {
        return progressId;
    }

    public void setProgressId(String progressId) {
        this.progressId = progressId;
    }
}
