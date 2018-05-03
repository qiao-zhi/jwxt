package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outsidegradesignagreemen;

import java.sql.SQLException;

public interface OutGraDesignAgreementService {
    /**
     * 修改一条自我管理协议记录
     * @param oGDAgreement
     * @return
     * @throws SQLException
     */
    public boolean updateOGDAgreement(Outsidegradesignagreemen oGDAgreement) throws SQLException;

    /**
     * 删除一条
     * @param outsideApplyID
     * @return
     * @throws SQLException
     */
    public boolean deleteOGDAgreement(String outsideApplyID) throws SQLException;
}
