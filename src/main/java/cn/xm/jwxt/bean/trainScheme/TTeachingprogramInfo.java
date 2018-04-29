package cn.xm.jwxt.bean.trainScheme;

/**
 * 课程教学资料
 */
public class TTeachingprogramInfo {
    private Integer coursefileid;

    private String courseid;

    private String fileoriname;

    private String filenowname;

    private String filetype;

    private String remark1;

    public Integer getCoursefileid() {
        return coursefileid;
    }

    public void setCoursefileid(Integer coursefileid) {
        this.coursefileid = coursefileid;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getFileoriname() {
        return fileoriname;
    }

    public void setFileoriname(String fileoriname) {
        this.fileoriname = fileoriname == null ? null : fileoriname.trim();
    }

    public String getFilenowname() {
        return filenowname;
    }

    public void setFilenowname(String filenowname) {
        this.filenowname = filenowname == null ? null : filenowname.trim();
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }
}