package cn.xm.jwxt.bean.trainScheme;

public class Trainningcapacitybaseinfo {
    private Integer capacityid;

    private String trainingschemeid;

    private String capacitysort;

    private String capacityname;

    private String capacitydescription;

    private String remark;

    public Integer getCapacityid() {
        return capacityid;
    }

    public void setCapacityid(Integer capacityid) {
        this.capacityid = capacityid;
    }

    public String getTrainingschemeid() {
        return trainingschemeid;
    }

    public void setTrainingschemeid(String trainingschemeid) {
        this.trainingschemeid = trainingschemeid == null ? null : trainingschemeid.trim();
    }

    public String getCapacitysort() {
        return capacitysort;
    }

    public void setCapacitysort(String capacitysort) {
        this.capacitysort = capacitysort == null ? null : capacitysort.trim();
    }

    public String getCapacityname() {
        return capacityname;
    }

    public void setCapacityname(String capacityname) {
        this.capacityname = capacityname == null ? null : capacityname.trim();
    }

    public String getCapacitydescription() {
        return capacitydescription;
    }

    public void setCapacitydescription(String capacitydescription) {
        this.capacitydescription = capacitydescription == null ? null : capacitydescription.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}