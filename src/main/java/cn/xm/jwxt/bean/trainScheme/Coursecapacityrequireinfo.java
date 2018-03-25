package cn.xm.jwxt.bean.trainScheme;

public class Coursecapacityrequireinfo {
    private Integer coursecapacityid;

    private String trainningschemeid;

    private String courseid;

    private Integer capacityid;

    private String remark;

    public Integer getCoursecapacityid() {
        return coursecapacityid;
    }

    public void setCoursecapacityid(Integer coursecapacityid) {
        this.coursecapacityid = coursecapacityid;
    }

    public String getTrainningschemeid() {
        return trainningschemeid;
    }

    public void setTrainningschemeid(String trainningschemeid) {
        this.trainningschemeid = trainningschemeid == null ? null : trainningschemeid.trim();
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public Integer getCapacityid() {
        return capacityid;
    }

    public void setCapacityid(Integer capacityid) {
        this.capacityid = capacityid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}