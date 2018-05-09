package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesignsurebook;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outsidegradesignagreemen;

import java.sql.SQLException;

public interface OutGraDesignAggAndSureService {

    /**
     * 更改保证书中的内容
     * @param outgradesignsurebook
     * @return
     * @throws SQLException
     */
    public Boolean updateSureBySureID(Outgradesignsurebook outgradesignsurebook)throws SQLException;

    /**
     * 根据ID查询保证书内容
     * @param sureID
     * @return
     * @throws SQLException
     */
    public Outgradesignsurebook selectBySureID(String sureID) throws SQLException;
    

    /**
     * 查询一条自我管理协议记录
     * @param agreementID
     * @return
     * @throws SQLException
     */
    public Outsidegradesignagreemen selectByID(String agreementID) throws SQLException;

    /**
     * 修改一条自我管理协议记录
     * @param oGDAgreement
     * @return
     * @throws SQLException
     */
    public boolean updateOGDAgreementById(Outsidegradesignagreemen oGDAgreement) throws SQLException;

    /**
     * 删除一条自我管理协议
     * @param outsideApplyID
     * @return
     * @throws SQLException
     */
    public boolean deleteOGDAgreement(String outsideApplyID) throws SQLException;
}
