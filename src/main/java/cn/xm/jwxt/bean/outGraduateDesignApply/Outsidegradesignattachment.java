package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Outsidegradesignattachment {
    private String attachmentid;

    private String outsideapplyid;

    private String attachmentname;

    private String attachmentoldname;

    private String newname;

    private String attachmentaddr;

    private Date uploaddate;

    private String attachmenttype;

    private String remark;

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

    public String getAttachmentoldname() {
        return attachmentoldname;
    }

    public void setAttachmentoldname(String attachmentoldname) {
        this.attachmentoldname = attachmentoldname == null ? null : attachmentoldname.trim();
    }

    public String getNewname() {
        return newname;
    }

    public void setNewname(String newname) {
        this.newname = newname == null ? null : newname.trim();
    }

    public String getAttachmentaddr() {
        return attachmentaddr;
    }

    public void setAttachmentaddr(String attachmentaddr) {
        this.attachmentaddr = attachmentaddr == null ? null : attachmentaddr.trim();
    }

    public Date getUploaddate() {
        return uploaddate;
    }

    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
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