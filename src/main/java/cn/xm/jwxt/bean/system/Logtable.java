package cn.xm.jwxt.bean.system;

public class Logtable {
    private Integer logid;//记录主键(自增)

    private String operatorname;//操作人姓名

    private String operatorid;//操作人编号(学生学号或者教师编号)

    private String operatortype;//操作人类型(学生或者老师)

    private String operatorunitname;//操作人所属部门名称(班级名称或者教研室名称)

    private String operatedescription;//操作描述

    private String operateresult;//操作结果

    private String operateclass;//操作的类

    private String operatemethod;//操作的方法

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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}