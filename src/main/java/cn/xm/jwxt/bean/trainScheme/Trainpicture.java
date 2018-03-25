package cn.xm.jwxt.bean.trainScheme;

import java.util.Date;

public class Trainpicture {
    private Integer pictureid;

    private String trainningschemeid;

    private Integer picturetype;

    private String pictureoriname;

    private String picturenowname;

    private Date uptime;

    private String remark;

    public Integer getPictureid() {
        return pictureid;
    }

    public void setPictureid(Integer pictureid) {
        this.pictureid = pictureid;
    }

    public String getTrainningschemeid() {
        return trainningschemeid;
    }

    public void setTrainningschemeid(String trainningschemeid) {
        this.trainningschemeid = trainningschemeid == null ? null : trainningschemeid.trim();
    }

    public Integer getPicturetype() {
        return picturetype;
    }

    public void setPicturetype(Integer picturetype) {
        this.picturetype = picturetype;
    }

    public String getPictureoriname() {
        return pictureoriname;
    }

    public void setPictureoriname(String pictureoriname) {
        this.pictureoriname = pictureoriname == null ? null : pictureoriname.trim();
    }

    public String getPicturenowname() {
        return picturenowname;
    }

    public void setPicturenowname(String picturenowname) {
        this.picturenowname = picturenowname == null ? null : picturenowname.trim();
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}