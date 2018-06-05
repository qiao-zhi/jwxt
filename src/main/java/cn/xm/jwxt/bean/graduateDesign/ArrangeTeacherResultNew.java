/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: ArrangeTeacherResultNew
 * Author:   xuexiaolei
 * Date:     2018/5/10 21:44
 * Description: 毕业答辩老师互审安排结果表
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.bean.graduateDesign;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈毕业答辩老师互审安排结果表〉
 *
 * @author xuexiaolei
 * @create 2018/5/10
 * @since 1.0.0
 */
public class ArrangeTeacherResultNew {
    private String arrangeresultid;

    private String teachernameone;

    private String teacheronegroupid;

    private String studentCountInTeacherOne;

    private String teachernametwo;

    private String teachertwogroupid;

    private String studentCountInTeacherTwo;

    private Date arrangetime;

    public String getTeacheronegroupid() {
        return teacheronegroupid;
    }

    public void setTeacheronegroupid(String teacheronegroupid) {
        this.teacheronegroupid = teacheronegroupid;
    }

    public String getTeachertwogroupid() {
        return teachertwogroupid;
    }

    public void setTeachertwogroupid(String teachertwogroupid) {
        this.teachertwogroupid = teachertwogroupid;
    }

    public String getArrangeresultid() {
        return arrangeresultid;
    }

    public void setArrangeresultid(String arrangeresultid) {
        this.arrangeresultid = arrangeresultid;
    }

    public Date getArrangetime() {
        return arrangetime;
    }

    public void setArrangetime(Date arrangetime) {
        this.arrangetime = arrangetime;
    }

    public String getTeachernameone() {
        return teachernameone;
    }

    public void setTeachernameone(String teachernameone) {
        this.teachernameone = teachernameone;
    }

    public String getTeachernametwo() {
        return teachernametwo;
    }

    public void setTeachernametwo(String teachernametwo) {
        this.teachernametwo = teachernametwo;
    }

    public String getStudentCountInTeacherOne() {
        return studentCountInTeacherOne;
    }

    public void setStudentCountInTeacherOne(String studentCountInTeacherOne) {
        this.studentCountInTeacherOne = studentCountInTeacherOne;
    }

    public String getStudentCountInTeacherTwo() {
        return studentCountInTeacherTwo;
    }

    public void setStudentCountInTeacherTwo(String studentCountInTeacherTwo) {
        this.studentCountInTeacherTwo = studentCountInTeacherTwo;
    }
}