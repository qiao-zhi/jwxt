package cn.xm.jwxt.mapper.graduateDesign.studentGPM;

import cn.xm.jwxt.bean.graduateDesign.*;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.List;

/**
 * 课题管理
 */
public interface StudentGPMMapper {

    /**
     * 初始化界面
     * 根据学生id，查询结果表。获取结果id、教师题目id、学生姓名
     * 获取到教师题目id，查询教师id、课题id、课题名称，类型，来源。
     *      查询教师id，获取教师名称、
     * 获取结果id，查询任务表的学生签字字段、任务书id、
     *      任务书id、查询进度表填写状态
     * @param studentID
     * @return StudentPDVo
     */
    public StudentPDVo selectPDInfo(String studentID) throws SQLException;

    /**
     * 查询进度表。
     *
     * @param studentID
     * @return
     */
    public ProgramTableVo selectProgramTable(String studentID) throws SQLException;

    /**
     * 添加数据
     * 进度表中，序号、备注不填写
     *
     * @param progressinfo
     * @return
     */
    public int insertProgramTable(Graduatetaskprogressinfo progressinfo) throws SQLException;

    /**
     * 更新进度表
     *
     * @param progressinfo
     * @return
     */
    public int updateProgramTable(Graduatetaskprogressinfo progressinfo) throws SQLException;

    /**
     * 根据学生id，插询任务书id
     *
     * @param studentID
     * @return
     */
    public String selectBookIDByStudentID(String studentID) throws SQLException;

    /**
     * 更新任务表，通过学生id，查询结果表，对应任务表，修改学生签字字段
     *
     * @param studentID
     * @param isStudentSign
     * @return
     */
    public int updateStudentSign(@Param("studentID") String studentID, @Param("isStudentSign") int isStudentSign) throws SQLException;

    /**
     * 初始化课题详细信息
     *
     * @param studentID 学生id
     * @return
     */
    public Teachergredesigntitle selectProjectDetailInfo(String studentID) throws SQLException;

    /**
     * 根据去年时间查询< 申请时间，查询课题申请表。
     *
     * @param yearNum
     * @return
     */
    public int selectIsCheckSuccessProject(String yearNum) throws SQLException;

    /**
     * 查询毕设学生选题表的是否提交。
     *
     * @param studentID
     * @return isSubmit
     * @throws SQLException
     */
    public String selectIsSubmitProjectChoose(String studentID) throws SQLException;

    /**
     * 查询结果表
     *
     * @param studentID
     * @return
     * @throws SQLException
     */
    public Studenttitleresult selectTitleResult(String studentID) throws SQLException;

    /**
     * 查询任务书
     *
     * @param studenttitleresultid 结果表id
     * @return
     * @throws SQLException
     */
    public Taskbookinfo selectTaskBook(String studenttitleresultid) throws SQLException;

    /**
     * 查询教师名字
     * 先查教师id
     *
     * @param teachertitleid 课题申请表
     * @return
     * @throws SQLException
     */
    public String selectTeacherName(String teachertitleid) throws SQLException;

    /**
     * 查询计划进程表
     * @param studentID
     * @return 计划进程表对象
     * @throws SQLException
     */
    public Graduatetaskprogressinfo selectTaskProgramTable(String studentID) throws SQLException;

    /**
     * 根据任务书id查询中期检查安排表
     * @param bookid
     * @return
     * @throws SQLException
     */
    public Cencheckarrangeinfo selectCencheckarrangeinfoByTaskBookID(String bookid) throws SQLException;

    /**
     * 查询中期检查基本信息表，根据他的id
     * @param cencheckinfoid
     * @return
     * @throws SQLException
     */
    public Cencheckbaseinfo selectCencheckbaseinfo(String cencheckinfoid) throws SQLException;

    /**
     * 获取中期检查地点
     * @param groupid
     * @return
     * @throws SQLException
     */
    public String selectReplyAddressByGroupidByGraDesignCheckGroup(String groupid) throws SQLException;

    /**
     *指导教师id查询毕业答辩安排表
     * @param bookid
     * @return
     * @throws SQLException
     */
    public Pleaarrangeinfo selectPleaArrangeInfoByTaskBookID(String bookid) throws SQLException;

    /**
     * 查询毕业答辩基本信息表，根据他的id
     * @param pleaid
     * @return
     * @throws SQLException
     */
    public Finallypleainfo selectFinallyPleaInfo(String pleaid) throws SQLException;

    /**
     * 获取毕业答辩地点
     * @param groupid
     * @return
     * @throws SQLException
     */
    public String selectReplyAddressByGroupidByGraDesignCheckGroupNew(String groupid) throws SQLException;

    /**
     * 根据学生id，获取学生姓名
     * @param studentID
     * @return
     * @throws SQLException
     */
    public String selectStudentNameByStudentID(String studentID) throws SQLException;

    /*---------------------------初始化文件信息----------------------------------*/

    /**
     * 任务书
     * @param studentID
     * @return
     */
    public String selectTaskbookNum(String studentID);

    /**
     * 计划进程表
     * @param studentID
     * @return
     */
    public String selectProgramtableNum(String studentID) throws SQLException;

    /**
     * 通过学生id，查询学生学号
     * @param studentNum
     * @return
     * @throws SQLException
     */
    public String selectStudentIDByStudentNum(String studentNum) throws SQLException;

/*    *//**
     * 中期检查表
     * @param studentID
     * @return
     *//*
    public String selectMiddletableNum(String studentID) throws SQLException;

    *//**
     * 论文评审表
     * @param studentID
     * @return
     *//*
    public String selectThesistableNum(String studentID) throws SQLException;

    *//**
     * 考勤表
     * @param studentID
     * @return
     *//*
    public String selectAttendancetableNum(String studentID) throws SQLException;

    *//**
     * 毕业论文
     * @param studentID
     * @return
     *//*
    public String selectThesisNum(String studentID) throws SQLException;*/
}
