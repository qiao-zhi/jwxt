package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;

import java.sql.SQLException;

/**
 * 对学生校外申请基本信息表操作
 * @author Abner
 */
public interface Outgradesigninfoservice {
    /**
     * 根据学生ID查询是否需要申请校外毕设
     * @param studentID
     * @return
     * @throws SQLException
     */
    public boolean selectIsOutByStudentID(String studentID) throws SQLException;

    /**
     * 根据校外毕设基本信息申请ID查询校外毕设基本信息表(基本信息表和审核表)
     * @param outsideApplyID
     * @return
     * @throws SQLException
     */
    public Outgradesigninfo selectInfoByOutsideApplyID(String outsideApplyID) throws SQLException;

    /**
     *  修改一条数据（修改的同时初始化申请表）
     * @param outgraDesignInfo
     * @return
     * @throws SQLException
     */
    public boolean updateInfo(Outgradesigninfo outgraDesignInfo) throws SQLException;

    /**
     * 根据申请ID删除校外毕设删除所有表中的信息
     * @param outsideApplyID
     * @return
     * @throws SQLException
     */
    public boolean deleteInfo(String outsideApplyID) throws SQLException;

    /**
     * 插入一条数据
     * @param outgraDesignInfo
     * @return
     * @throws SQLException
     */
    public boolean insertInfo(Outgradesigninfo outgraDesignInfo) throws SQLException;
}
