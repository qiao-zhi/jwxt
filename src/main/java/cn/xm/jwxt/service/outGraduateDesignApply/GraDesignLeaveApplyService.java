package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Gradesignleaveapply;

import java.sql.SQLException;

/**
 * 通过校外申请编号对毕业生请假表进行操作
 * @author Abner
 */
public interface GraDesignLeaveApplyService {
    /**
     * 根据校外申请ID查询请假表的信息（请假表审核表和销假表）
     * @param outsideApplyID
     * @return
     * @throws SQLException
     */
    public Gradesignleaveapply selectLeaveApplyByLeaveID(String leaveID) throws SQLException;

    /**
     * 修改请假表初始化销假表和审核表
     * @param graDesignLeaveApply
     * @return
     * @throws SQLException
     */
    public boolean updateInfo(Gradesignleaveapply graDesignLeaveApply) throws SQLException;

    public boolean deleteInfo(String outsideApplyID) throws SQLException;
}
