package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigntitleapply;

import java.sql.SQLException;

/**
 * 对学生校外毕设课题申请表的操作
 * @author Abner
 */
public interface OutGraDesignTitleApplyService {
    /**
     * 通过校外申请编号查询题目申请表信息（题目申请表和审核表）
     * @param titleID
     * @return
     * @throws SQLException
     */
    public Outgradesigntitleapply selectTitleInfoByTitleID(String titleID) throws SQLException;

    /**
     * 根据校外申请编号修改题目申请信息并初始化审核表（申请表和审核表）
     * @param outGraDesignTitleApply
     * @return
     * @throws SQLException
     */
    public boolean updateTitleApply(Outgradesigntitleapply outGraDesignTitleApply) throws SQLException;

    /**
     * 提交校外毕设题目申请
     * @param outgradesignapplyid
     * @return
     * @throws SQLException
     */
    public boolean commitTitle(String outgradesignapplyid) throws SQLException;


}
