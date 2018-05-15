package cn.xm.jwxt.bean.system;

import java.util.Date;

public class Logtable {
    private Integer logid;

    private String operatorname;//操操作人姓名

    private String operatorid;//操作人ID

    private String operatortype;//操作人类型型(学生还是老师)

    private String operatorunitname;//操作人所属单位

    private String operatedescription;//操作描述

    private String operateresult;//操作结果(正常，异常)

    private String operateclass;//操作的类

    private String operatemethod;//操作的方法

    private Date operatedate;//操作日期

    private String operateip;//操作的IP地址

    private String remark;//备注

    public Integer getLogid() {
        return logid;
    }

    public void setLogid(Integer logid) {
        this.logid = logid;
    }

    public String getOperatorname() {
        return operatorname;
    }

    public void setOperatorname(String operatorname) {
        this.operatorname = operatorname == null ? null : operatorname.trim();
    }

    public String getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(String operatorid) {
        this.operatorid = operatorid == null ? null : operatorid.trim();
    }

    public String getOperatortype() {
        return operatortype;
    }

    public void setOperatortype(String operatortype) {
        this.operatortype = operatortype == null ? null : operatortype.trim();
    }

    public String getOperatorunitname() {
        return operatorunitname;
    }

    public void setOperatorunitname(String operatorunitname) {
        this.operatorunitname = operatorunitname == null ? null : operatorunitname.trim();
    }

    public String getOperatedescription() {
        return operatedescription;
    }

    public void setOperatedescription(String operatedescription) {
        this.operatedescription = operatedescription == null ? null : operatedescription.trim();
    }

    public String getOperateresult() {
        return operateresult;
    }

    public void setOperateresult(String operateresult) {
        this.operateresult = operateresult == null ? null : operateresult.trim();
    }

    public String getOperateclass() {
        return operateclass;
    }

    public void setOperateclass(String operateclass) {
        this.operateclass = operateclass == null ? null : operateclass.trim();
    }

    public String getOperatemethod() {
        return operatemethod;
    }

    public void setOperatemethod(String operatemethod) {
        this.operatemethod = operatemethod == null ? null : operatemethod.trim();
    }

    public Date getOperatedate() {
        return operatedate;
    }

    public void setOperatedate(Date operatedate) {
        this.operatedate = operatedate;
    }

    public String getOperateip() {
        return operateip;
    }

    public void setOperateip(String operateip) {
        this.operateip = operateip == null ? null : operateip.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}