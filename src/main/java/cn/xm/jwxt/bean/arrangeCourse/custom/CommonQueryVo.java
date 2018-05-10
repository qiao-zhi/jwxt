package cn.xm.jwxt.bean.arrangeCourse.custom;

import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：公共查询条件映射类
 * 创建人：LL
 * 创建时间：2018/4/28 18:53
 */
public class CommonQueryVo {
    //当前页
    private Integer currentPage;
    //当前页显示条数
    private Integer pageSize;
    //学院ID
    private String academicId;
    //专业ID
    private String majorId;
    //学年
    private String academicYear;
    //学期
    private String term;
    //排课任务状态
    private List<String> taskStatus;

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getAcademicId() {
        return academicId;
    }

    public void setAcademicId(String academicId) {
        this.academicId = academicId;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public List<String> getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(List<String> taskStatus) {
        this.taskStatus = taskStatus;
    }
}
