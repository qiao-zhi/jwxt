/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GradesigncheckgroupVo
 * Author:   xuexiaolei
 * Date:     2018/5/8 0:24
 * Description: 小组和老师学生信息
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.bean.graduateDesign;

import cn.xm.jwxt.bean.baseInfo.TStudentBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈小组和老师学生信息〉
 *
 * @author xuexiaolei
 * @create 2018/5/8
 * @since 1.0.0
 */
public class GradesigncheckgroupVo {
    private String groupid;

    private String teacheridSum;

    private String groupname;

    private String grouptype;

    //将list中的老师名称拼接出来
    private String teachernameSum;

    //小组内学生总人数
    private Integer studentCountInGroup;

    public String getTeacheridSum() {
        return teacheridSum;
    }

    public void setTeacheridSum(String teacheridSum) {
        this.teacheridSum = teacheridSum;
    }

    public Integer getStudentCountInGroup() {
        return studentCountInGroup;
    }

    public void setStudentCountInGroup(Integer studentCountInGroup) {
        this.studentCountInGroup = studentCountInGroup;
    }

    public String getTeachernameSum() {
        return teachernameSum;
    }

    public void setTeachernameSum(String teachernameSum) {
        this.teachernameSum = teachernameSum;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getGrouptype() {
        return grouptype;
    }

    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype == null ? null : grouptype.trim();
    }

}