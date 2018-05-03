package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Checkoutgradesigninfo;

import java.sql.SQLException;

public interface CheckOutGraDesignInfoService {
    /**
     * 插入一条审批记录
     * @param checkOutGraDesignInfo
     * @return
     * @throws SQLException
     */
    public boolean insertCheckOGDInfo(Checkoutgradesigninfo checkOutGraDesignInfo) throws SQLException;

    /**
     * 根据校外申请ID删除所有审批记录
     * @param outsideApplyID
     * @return
     * @throws SQLException
     */
    public boolean deleteByOutsideApplyID(String outsideApplyID) throws SQLException;
}
