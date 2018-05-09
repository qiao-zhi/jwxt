package cn.xm.jwxt.bean.outGraduateDesignApply;

public class Outattachmentcontent {
    private String contentid;

    private String attachmentid;

    private String contentnum;

    private String contenturl;

    private String remark;

    public String getContentid() {
        return contentid;
    }

    public void setContentid(String contentid) {
        this.contentid = contentid == null ? null : contentid.trim();
    }

    public String getAttachmentid() {
        return attachmentid;
    }

    public void setAttachmentid(String attachmentid) {
        this.attachmentid = attachmentid == null ? null : attachmentid.trim();
    }

    public String getContentnum() {
        return contentnum;
    }

    public void setContentnum(String contentnum) {
        this.contentnum = contentnum == null ? null : contentnum.trim();
    }

    public String getContenturl() {
        return contenturl;
    }

    public void setContenturl(String contenturl) {
        this.contenturl = contenturl == null ? null : contenturl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}