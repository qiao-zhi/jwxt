package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigntitleapply;

/**
 * 对学生校外毕设课题申请表的操作
 * @author Abner
 */
public interface OutGraDesignTitleApplyService {
    /**
     * 通过校外申请编号对校外课题申请表进行操作
     * @param outsideApplyID
     * @return
     */
    public Outgradesigntitleapply selectTitleApply(String outsideApplyID);
    public int updateTitleApply(Outgradesigntitleapply outGraDesignTitleApply);
    public int deleteTitleApply(String outsideApplyID);
    public int insertTitleApply(Outgradesigntitleapply outGraDesignTitleApply);
}
