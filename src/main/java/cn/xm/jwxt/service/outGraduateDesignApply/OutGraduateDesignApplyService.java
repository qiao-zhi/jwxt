package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;

public interface OutGraduateDesignApplyService {
    /**
     * 根据校外申请编号查询校外毕设文件提交情况
     * @param outsideApplyID
     * @return
     */
    public int checkFile(String outsideApplyID);

    /**
     * 通过校外申请编号查询校外毕设申请信息
     * @param outsideApplyID
     * @return
     */
    public Outgradesigninfo findAllOutGraDesBySID(String outsideApplyID);

}
