package cn.xm.jwxt.mapper.outGraduateDesignApply.custom;

import cn.xm.jwxt.bean.baseInfo.TCollegeBaseInfo;
import cn.xm.jwxt.bean.baseInfo.TTeacherBaseInfo;

import java.util.List;
import java.util.Map;

public interface CheckStuApplyBaseInfoMapper {

    /**
     * 根据当前用户查询学院基本信息
     * @param userID
     * @return
     */
    TCollegeBaseInfo selectCollegeInfoByUserID(String userID);

    /*根据学期、指导教师名称、学号、和审核状态查询本学院校外毕设申请学生信息*/
    /**
     * @param map(collageName,stadyYear,inTeacherName,studentNum,checkStatus)
     * @return
     */
    List<Map<String,Object>> selectCollageODGApplyStuInfo (Map<String,Object> map);
}
