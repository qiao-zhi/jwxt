package cn.xm.jwxt.bean.outGraduateDesignApply;

import java.util.Date;

public class Outsidegradesignattachment {
    private String attachmentid;

    private String outsideapplyid;

    private String attachmentoldname;

    private String newname;

    private String attachmentaddr;

    private Date uploaddate;

    private String attachmenttype;

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
}