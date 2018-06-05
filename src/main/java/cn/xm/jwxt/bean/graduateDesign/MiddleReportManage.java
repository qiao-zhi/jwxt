/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MiddleReportManage
 * Author:   xuexiaolei
 * Date:     2018/5/12 11:31
 * Description: 中期检查审核管理需要查询的学生信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.bean.graduateDesign;

/**
 * 〈一句话功能简述〉<br> 
 * 〈中期检查审核管理需要查询的学生信息〉
 *
 * @author xuexiaolei
 * @create 2018/5/12
 * @since 1.0.0
 */
public class MiddleReportManage {
    //学生id
    private String studentid;

    //学号
    private String studentnum;

    //学生姓名
    private String studentname;

    //班级名称
    private String classname;

    //毕设题目
    private String titlename;

    //指导教师
    private String leaderteacher;

    //中期检查教师
    private String cencheckteacher;

    //是否进行检查
    private String ischecked;

    //是否进行答辩
    private String ischeckedNew;

    //检查表填写情况
    private String checktablefilled;

    //检查状态
    private String checkedstate;

    //答辩状态
    private String checkedNewstate;

    //成绩表填写情况
    private String gradetablefilled;

    //毕设类型
    private String isout;


    //学院信息，教研室信息未定

    //中期检查结果信息 start
    //中期检查安排id
    private Integer cenArrangeInfoId;

    //工作进度
    private String wordProgress;

    //工作态度情况
    private String workAttitude;

    //质量评价
    private String qualityAdvice;

    //问题和建议
    private String problemAndAatter;

    //检查时间
    private String checkTime;
    //中期检查结果信息 end


    public Integer getCenArrangeInfoId() {
        return cenArrangeInfoId;
    }

    public void setCenArrangeInfoId(Integer cenArrangeInfoId) {
        this.cenArrangeInfoId = cenArrangeInfoId;
    }

    public String getStudentnum() {
        return studentnum;
    }

    public void setStudentnum(String studentnum) {
        this.studentnum = studentnum;
    }

    public String getWordProgress() {
        return wordProgress;
    }

    public void setWordProgress(String wordProgress) {
        this.wordProgress = wordProgress;
    }

    public String getWorkAttitude() {
        return workAttitude;
    }

    public void setWorkAttitude(String workAttitude) {
        this.workAttitude = workAttitude;
    }

    public String getQualityAdvice() {
        return qualityAdvice;
    }

    public void setQualityAdvice(String qualityAdvice) {
        this.qualityAdvice = qualityAdvice;
    }

    public String getProblemAndAatter() {
        return problemAndAatter;
    }

    public void setProblemAndAatter(String problemAndAatter) {
        this.problemAndAatter = problemAndAatter;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getTitlename() {
        return titlename;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    public String getLeaderteacher() {
        return leaderteacher;
    }

    public void setLeaderteacher(String leaderteacher) {
        this.leaderteacher = leaderteacher;
    }

    public String getCencheckteacher() {
        return cencheckteacher;
    }

    public void setCencheckteacher(String cencheckteacher) {
        this.cencheckteacher = cencheckteacher;
    }

    public String getIschecked() {
        return ischecked;
    }

    public void setIschecked(String ischecked) {
        this.ischecked = ischecked;
    }

    public String getChecktablefilled() {
        return checktablefilled;
    }

    public void setChecktablefilled(String checktablefilled) {
        this.checktablefilled = checktablefilled;
    }

    public String getIsout() {
        return isout;
    }

    public void setIsout(String isout) {
        this.isout = isout;
    }

    public String getIscheckedNew() {
        return ischeckedNew;
    }

    public void setIscheckedNew(String ischeckedNew) {
        this.ischeckedNew = ischeckedNew;
    }

    public String getCheckedNewstate() {
        return checkedNewstate;
    }

    public void setCheckedNewstate(String checkedNewstate) {
        this.checkedNewstate = checkedNewstate;
    }

    public String getGradetablefilled() {
        return gradetablefilled;
    }

    public void setGradetablefilled(String gradetablefilled) {
        this.gradetablefilled = gradetablefilled;
    }

    public String getCheckedstate() {
        return checkedstate;
    }

    public void setCheckedstate(String checkedstate) {
        this.checkedstate = checkedstate;
    }
}