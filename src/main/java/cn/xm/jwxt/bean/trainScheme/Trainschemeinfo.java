package cn.xm.jwxt.bean.trainScheme;

import java.util.Date;

public class Trainschemeinfo {
    private String trainingschemeid;//培养方案ID

    private String trainingschemaname;//培养方案名称

    private String majorname;//专业名称

    private String majorid;//专业代码

    private String reviseperson;//修订人

    private String checkperson;//审核人

    private String majormanager;//专业负责人

    private String majortype;//学科门类

    private Date createtime;//创建时间

    private String isuse;//是否启用

    private String trainingtarget;//培养目标

    private String trainingrequire;//培养要求

    private String trainyears;//修业年限

    private String traindegree;//授予学位

    private String maincourse;//主干学科

    private String corecourse;//核心课程

    private String maintestitem;//主要实践性教学环节

    private String mainmajorexperience;//主要专业实验

    private String majorfeature;//专业特色

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

    public String getTrainyears() {
        return trainyears;
    }

    public void setTrainyears(String trainyears) {
        this.trainyears = trainyears == null ? null : trainyears.trim();
    }

    public String getTraindegree() {
        return traindegree;
    }

    public void setTraindegree(String traindegree) {
        this.traindegree = traindegree == null ? null : traindegree.trim();
    }

    public String getMaincourse() {
        return maincourse;
    }

    public void setMaincourse(String maincourse) {
        this.maincourse = maincourse == null ? null : maincourse.trim();
    }

    public String getCorecourse() {
        return corecourse;
    }

    public void setCorecourse(String corecourse) {
        this.corecourse = corecourse == null ? null : corecourse.trim();
    }

    public String getMaintestitem() {
        return maintestitem;
    }

    public void setMaintestitem(String maintestitem) {
        this.maintestitem = maintestitem == null ? null : maintestitem.trim();
    }

    public String getMainmajorexperience() {
        return mainmajorexperience;
    }

    public void setMainmajorexperience(String mainmajorexperience) {
        this.mainmajorexperience = mainmajorexperience == null ? null : mainmajorexperience.trim();
    }

    public String getMajorfeature() {
        return majorfeature;
    }

    public void setMajorfeature(String majorfeature) {
        this.majorfeature = majorfeature == null ? null : majorfeature.trim();
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