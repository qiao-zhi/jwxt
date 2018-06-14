package cn.xm.jwxt.service.graduateDesign.projectManage;

import cn.xm.jwxt.bean.graduateDesign.ChooseProjectVo;
import cn.xm.jwxt.bean.graduateDesign.Gradesignstudenttitleinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleDetailVo;

import java.util.List;
import java.util.Map;

public interface ChooseProjectService {
    /**
     * 根据条件，查询课题信息
     * @param condition 课题名称、教师名称
     * @return 教师名称、课题id、课题名称、课题类型、课题来源、学生人数
     */
    List<Map<String,String>> getProjectInfoByCondition(Map<String, String> condition) throws Exception;

    /**
     * 获取课题申请详细信息
     * @param teacherTitleID
     * @return
     */
    public TeachergredesigntitleDetailVo getProjectInfoDetail(String teacherTitleID) throws Exception;

    /**
     * 初始化选择课题信息
     * @param studentNum
     * @return
     */
    public List<ChooseProjectVo> getChooseProjectInfo(String studentNum) throws Exception;

    /**
     * 保存选择课题
     * @param gradesignstudenttitleinfo
     * @return
     */
    public boolean saveChooseProject(Gradesignstudenttitleinfo gradesignstudenttitleinfo) throws Exception;

    /**
     * 通过学生学号，查询学生id
     * @param studentNum
     * @return
     * @throws Exception
     */
    public String getStudentIDByStudentNum(String studentNum) throws Exception;

    /**
     * 通过学号，获取专业id
     * @param userCode
     * @return
     * @throws Exception
     */
    public String getMajorIDByStudentNum(String userCode) throws Exception;
}
