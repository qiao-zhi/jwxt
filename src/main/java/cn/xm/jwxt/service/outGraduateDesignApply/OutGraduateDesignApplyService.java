package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface OutGraduateDesignApplyService {


    /**
     * 判断毕设课题安排情况，
     * @return true：安排完成，可以进行校外毕设申请 false：题目未安排，无法进行校外毕设申请。
     * @throws SQLException
     */
    public boolean isFinishTitleResult(String studentID) throws SQLException;

    /**
     * 根据学生ID查询校外毕设申请
     * 创建学生申请校外毕设所需要的表并初始化（附件表、基本信息表、课题表、协议书、请假表）
     * @param studentID
     * @return true:申请过 false:未申请
     * @throws SQLException
     */
    public boolean applyOGD(String studentID) throws SQLException;

    /**
     * 根据学生ID查询校外毕设申请,
     * 创建学生申请校外毕设所需要的表并初始化（附件表、基本信息表、课题表、协议书、请假表）
     * 查询校外毕设文件提交情况,
     * @param studentID
     * @return
     * @throws SQLException
     */
    public Map<String,Object> checkFile(String studentID) throws SQLException;

    /**
     * 根据审批等级状态查询当前待本级审批的校外毕设申请
     * @param checkState
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> selectWaitCheck(String checkState) throws SQLException;

    /**
     * 根据学期学年学生姓名查询统计
     * @param map
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> selectStudentByExample(Map<String,String> map)throws SQLException;
}
