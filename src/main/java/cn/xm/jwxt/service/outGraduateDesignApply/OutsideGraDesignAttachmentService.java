package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outsidegradesignattachment;

import java.sql.SQLException;

/**
 * 对校外毕设申请的附件信息进行操作
 * @author Abner
 */
public interface OutsideGraDesignAttachmentService {
    /**
     * 查询附件详细信息（附件表）
     * @param outsideApplyID
     * @return
     * @throws SQLException
     */
    public Outsidegradesignattachment selectAttachmentByODGID(String outsideApplyID) throws SQLException;

    /**
     * 修改附件信息初始化
     * @param graDesignLeaveApply
     * @return
     * @throws SQLException
     */
    public int updateAttachment(Outsidegradesignattachment graDesignLeaveApply) throws SQLException;

    public int deleteAttachment(String outsideApplyID) throws SQLException;
}
