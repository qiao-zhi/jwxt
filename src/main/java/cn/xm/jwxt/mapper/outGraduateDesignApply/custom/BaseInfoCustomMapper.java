package cn.xm.jwxt.mapper.outGraduateDesignApply.custom;

import cn.xm.jwxt.bean.graduateDesign.Gradeuatebaseinfo;
import cn.xm.jwxt.bean.graduateDesign.Studenttitleresult;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;

import java.util.Map;

public interface BaseInfoCustomMapper {
    //根据学生id查询是否完成毕设申请
    Studenttitleresult isFinishTitleResult(String studentID);

    //根据学生ID查询校外毕设申请表中是否有学生数据
    Outgradesigninfo selectIsApplyByStudentID(String studentID);

    //查询学生申请文件提交情况
    Map<String,Object> selectFileStatus (String outsideApplyID);

    //根据学生ID从毕设信息表中查询学年信息
    Gradeuatebaseinfo selectGradeuateBaseInfoBystudentID(String studentID);
}
