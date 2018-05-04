package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Projectcheck;

import java.sql.SQLException;

public interface ProjectCheckService {
    /**
     *
     * @param projectCheck
     * @return
     * @throws SQLException
     */
    public boolean insertProjectCheck(Projectcheck projectCheck)throws SQLException;

    /**
     *
     * @param outsideApplyID
     * @return
     * @throws SQLException
     */
    public boolean deleteAllByOutsideApplyID(String outsideApplyID) throws SQLException;
}
