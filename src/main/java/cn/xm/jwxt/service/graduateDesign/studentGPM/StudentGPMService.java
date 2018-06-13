package cn.xm.jwxt.service.graduateDesign.studentGPM;

import cn.xm.jwxt.bean.graduateDesign.*;

import java.util.List;

public interface StudentGPMService {

    /**
     * 初始化界面
     *
     * @param studentID
     * @return
     */
    public StudentPDVo getPDInfo(String studentID) throws Exception;

    /**
     * 初始化表计划进程表
     *
     * @param studentID
     * @return
     */
    public ProgramTableVo getProgramTable(String studentID) throws Exception;

    /**
     * 保存进程表信息
     *
     * @param studentID
     * @return
     */
    public boolean saveProgramTable(Graduatetaskprogressinfo progressinfo, String studentID) throws Exception;

    /**
     * 保存任务表签字信息
     *
     * @param studentID
     * @param studentName
     * @return
     */
    public boolean saveStudentSign(String studentID, String studentName) throws Exception;

    /**
     * 初始化课题详细信息
     *
     * @param studentID
     * @return
     */
    public Teachergredesigntitle getProjectDetailInfo(String studentID) throws Exception;

    /**
     * 课题选择通知
     *
     * @param studentID
     * @return
     */
    public String getProjectChooseState(String studentID) throws Exception;

    /**
     * 获取任务书签字通知
     * @param studentID
     * @return
     * @throws Exception
     */
    public String getTaskbookSignState(String studentID) throws Exception;

    /**
     * 判断是否填写计划进程表
     * @param studentID
     * @return
     * @throws Exception
     */
    public String getGraduateCheckState(String studentID) throws Exception;

    /**
     * 中期检查提示
     * @param studentID
     * @return
     * @throws Exception
     */
    public String getMiddleCheckState(String studentID) throws Exception;

    /**
     * 毕业答辩提示
     * @param studentID
     * @return
     * @throws Exception
     */
    public String getProgramTableState(String studentID) throws Exception;

    /**
     * 初始化文件管理信息
     * @param studentID
     * @return
     * @throws Exception
     */
    public List<FileInfoVo> initFIleInfo(String studentID) throws Exception;

    /**
     * 通过学生学号，获取学生id
     * @param studentNum
     * @return
     * @throws Exception
     */
    public String getStudentIDByStudentNum(String studentNum) throws Exception;
}
