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
     * @param attachmentID
     * @return
     * @throws SQLException
     */
    public Outsidegradesignattachment selectAttachmentByAttID(String attachmentID) throws SQLException;

    /**
     * 提交附件信息修改状态为1
     * @param attachmentID
     * @param type
     * @return
     * @throws SQLException
     */
    public boolean commitAttachment(String attachmentID,String type) throws SQLException;

    /**
     * 保存附件信息中状态字段
     * @param attachmentID,type
     * @return
     * @throws SQLException
     */
    public boolean updateAttachment(String attachmentID,String type) throws SQLException;

    /**
     * 根据id删除一条附件信息内容
     * @param contentID
     * @return
     * @throws SQLException
     */
    public boolean deleteAttachmentContentbyID(String contentID) throws SQLException;

    /**
     *
     * @return
     * @throws SQLException
     */
    public boolean addAttachmentContent(String attachmentID,String fileName) throws SQLException;

}
