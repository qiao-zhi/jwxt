package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;
import java.util.List;

public class Outsidegradesignattachment {
    private String attachmentid;

    private String outsideapplyid;

    private String attachmentname;

    private Date uploaddate;

    private String iscommit;

    private String attachmenttype;

    private String remark;

    private List<Outattachmentcontent> oGDAttachmentContent;

    public List<Outattachmentcontent> getoGDAttachmentContent() {
        return oGDAttachmentContent;
    }

    public void setoGDAttachmentContent(List<Outattachmentcontent> oGDAttachmentContent) {
        this.oGDAttachmentContent = oGDAttachmentContent;
    }

    public String getAttachmentid() {
        return attachmentid;
    }

    public void setAttachmentid(String attachmentid) {
        this.attachmentid = attachmentid == null ? null : attachmentid.trim();
    }

    public String getOutsideapplyid() {
        return outsideapplyid;
    }

    public void setOutsideapplyid(String outsideapplyid) {
        this.outsideapplyid = outsideapplyid == null ? null : outsideapplyid.trim();
    }

    public String getAttachmentname() {
        return attachmentname;
    }

    public void setAttachmentname(String attachmentname) {
        this.attachmentname = attachmentname == null ? null : attachmentname.trim();
    }

    public Date getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    public String getIscommit() {
        return iscommit;
    }

    public void setIscommit(String iscommit) {
        this.iscommit = iscommit == null ? null : iscommit.trim();
    }

    public String getAttachmenttype() {
        return attachmenttype;
    }

    public void setAttachmenttype(String attachmenttype) {
        this.attachmenttype = attachmenttype == null ? null : attachmenttype.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}