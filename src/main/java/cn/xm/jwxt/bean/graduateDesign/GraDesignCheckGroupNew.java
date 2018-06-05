/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GraDesignCheckGroupNew
 * Author:   xuexiaolei
 * Date:     2018/5/10 21:43
 * Description: 毕设答辩小组
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.bean.graduateDesign;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈毕设答辩小组〉
 *
 * @author xuexiaolei
 * @create 2018/5/10
 * @since 1.0.0
 */
public class GraDesignCheckGroupNew {

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