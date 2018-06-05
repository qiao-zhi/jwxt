package cn.xm.jwxt.bean.graduateDesign;

import java.util.List;

/**
 * 中期检查小组表
 */
public class Gradesigncheckgroup {
    private String groupid;

    private String groupname;

    private String grouptype;

    private String replyaddress;

    private String remark;

    private List<Checkgroupperson> checkgrouppersonList;

    public List<Checkgroupperson> getCheckgrouppersonList() {
        return checkgrouppersonList;
    }

    public void setCheckgrouppersonList(List<Checkgroupperson> checkgrouppersonList) {
        this.checkgrouppersonList = checkgrouppersonList;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid == null ? null : groupid.trim();
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getGrouptype() {
        return grouptype;
    }

    public void setGrouptype(String grouptype) {
        this.grouptype = grouptype == null ? null : grouptype.trim();
    }

    public String getReplyaddress() {
        return replyaddress;
    }

    public void setReplyaddress(String replyaddress) {
        this.replyaddress = replyaddress == null ? null : replyaddress.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}