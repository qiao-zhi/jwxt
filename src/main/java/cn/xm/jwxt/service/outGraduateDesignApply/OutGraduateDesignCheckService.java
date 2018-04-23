package cn.xm.jwxt.service.outGraduateDesignApply;

/**
 *
 */
public interface OutGraduateDesignCheckService {
    /**
     * 根据校外申请编号查询校外毕设基本信息表的审批情况
     * @param outsideApplyID
     * @return
     */
    public int selectOGDInfoStatus(String outsideApplyID);

    /**
     * 根据校外申请编号查询校外毕设课题申请表的审批情况
     * @param outsideApplyID
     * @return
     */
    public int selectOGDTitleApplyStatus(String outsideApplyID);

    /**
     * 根据校外申请编号查询校外毕设请假表的审批情况
     * @param outsideApplyID
     * @return
     */
    public int selectOGDLeaveApplyStatus(String outsideApplyID);

    /**
     * 根据校外申请编号查询校外毕设自我管理协议书的审批情况
     * @param outsideApplyID
     * @return
     */
    public int selectOGDAgreementStatus(String outsideApplyID);
}
