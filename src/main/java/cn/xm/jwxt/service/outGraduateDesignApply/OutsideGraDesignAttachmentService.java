package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outsidegradesignattachment;

/**
 * 对校外毕设申请的附件信息进行操作
 * @author Abner
 */
public interface OutsideGraDesignAttachmentService {
    public Outsidegradesignattachment selectIAttachment(String outsideApplyID);
    public int updateAttachment(Outsidegradesignattachment graDesignLeaveApply);
    public int deleteAttachment(String outsideApplyID);
    public int insertAttachment(Outsidegradesignattachment graDesignLeaveApply);
}
