package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Checkleave;

import java.sql.SQLException;

public interface CheckLeaveService {
    /**
     *
     * @param checkLeave
     * @return
     * @throws SQLException
     */
    public boolean insertCheckLeave(Checkleave checkLeave) throws SQLException;

    /**
     *
     * @param outsideApplyID
     * @return
     * @throws SQLException
     */
    public boolean deleteAllByOutsideApplyID(String outsideApplyID) throws SQLException;
}
