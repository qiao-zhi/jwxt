package cn.xm.jwxt.bean.trainScheme;

public class Coursetypeinfo {
    private Integer coursetypeid;

    private String typenum;

    private String uptypenum;

    private String typename;

    private String trainingschemeid;

    private String remark;

    public Integer getCoursetypeid() {
        return coursetypeid;
    }

    public void setCoursetypeid(Integer coursetypeid) {
        this.coursetypeid = coursetypeid;
    }

    public String getTypenum() {
        return typenum;
    }

    public void setTypenum(String typenum) {
        this.typenum = typenum == null ? null : typenum.trim();
    }

    public String getUptypenum() {
        return uptypenum;
    }

    public void setUptypenum(String uptypenum) {
        this.uptypenum = uptypenum == null ? null : uptypenum.trim();
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public String getTrainingschemeid() {
        return trainingschemeid;
    }

    public void setTrainingschemeid(String trainingschemeid) {
        this.trainingschemeid = trainingschemeid == null ? null : trainingschemeid.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}