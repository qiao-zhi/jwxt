package cn.xm.jwxt.bean.trainScheme;

import java.util.Date;

public class Trainschemeinfo {
    private String trainingschemeid;

    private String trainingschemaname;

    private String majorname;

    private String majorid;

    private String reviseperson;

    private String checkperson;

    private String majormanager;

    private String majortype;

    private Date createtime;

    private String isuse;

    private String trainingtarget;

    private String trainingrequire;

    private String remark1;

    private String remark2;

    public String getTrainingschemeid() {
        return trainingschemeid;
    }

    public void setTrainingschemeid(String trainingschemeid) {
        this.trainingschemeid = trainingschemeid == null ? null : trainingschemeid.trim();
    }

    public String getTrainingschemaname() {
        return trainingschemaname;
    }

    public void setTrainingschemaname(String trainingschemaname) {
        this.trainingschemaname = trainingschemaname == null ? null : trainingschemaname.trim();
    }

    public String getMajorname() {
        return majorname;
    }

    public void setMajorname(String majorname) {
        this.majorname = majorname == null ? null : majorname.trim();
    }

    public String getMajorid() {
        return majorid;
    }

    public void setMajorid(String majorid) {
        this.majorid = majorid == null ? null : majorid.trim();
    }

    public String getReviseperson() {
        return reviseperson;
    }

    public void setReviseperson(String reviseperson) {
        this.reviseperson = reviseperson == null ? null : reviseperson.trim();
    }

    public String getCheckperson() {
        return checkperson;
    }

    public void setCheckperson(String checkperson) {
        this.checkperson = checkperson == null ? null : checkperson.trim();
    }

    public String getMajormanager() {
        return majormanager;
    }

    public void setMajormanager(String majormanager) {
        this.majormanager = majormanager == null ? null : majormanager.trim();
    }

    public String getMajortype() {
        return majortype;
    }

    public void setMajortype(String majortype) {
        this.majortype = majortype == null ? null : majortype.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getIsuse() {
        return isuse;
    }

    public void setIsuse(String isuse) {
        this.isuse = isuse == null ? null : isuse.trim();
    }

    public String getTrainingtarget() {
        return trainingtarget;
    }

    public void setTrainingtarget(String trainingtarget) {
        this.trainingtarget = trainingtarget == null ? null : trainingtarget.trim();
    }

    public String getTrainingrequire() {
        return trainingrequire;
    }

    public void setTrainingrequire(String trainingrequire) {
        this.trainingrequire = trainingrequire == null ? null : trainingrequire.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }
}