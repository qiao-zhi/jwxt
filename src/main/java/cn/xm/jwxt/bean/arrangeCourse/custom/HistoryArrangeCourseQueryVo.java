package cn.xm.jwxt.bean.arrangeCourse.custom;

/**
 * 项目名称：jwxt
 * 类描述：用于历史排课信息查询的查询条件
 * 创建人：LL
 * 创建时间：2018/5/11 21:19
 */
public class HistoryArrangeCourseQueryVo {
    //学年
    private String academicYear;
    //学期
    private String term;
    //排课任务ID
    private String arrangeTaskId;

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

    public String getArrangeTaskId() {
        return arrangeTaskId;
    }

    public void setArrangeTaskId(String arrangeTaskId) {
        this.arrangeTaskId = arrangeTaskId;
    }
}
