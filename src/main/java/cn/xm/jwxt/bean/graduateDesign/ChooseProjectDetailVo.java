package cn.xm.jwxt.bean.graduateDesign;
import java.util.Date;

/**
 * 教师毕业课题题目申请表
 */
public class ChooseProjectDetailVo {

    private String titlename;

    private String resulttype;

    private String projecttype;

    private String targetrequire;

    private String researchcontent;

    private String titleorigin;

    private String titletype;

    private Short reqirestudentnum;

    private Date gdTime;

    public String getTitlename() {
        return titlename;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    public String getResulttype() {
        return resulttype;
    }

    public void setResulttype(String resulttype) {
        this.resulttype = resulttype;
    }

    public String getProjecttype() {
        return projecttype;
    }

    public void setProjecttype(String projecttype) {
        this.projecttype = projecttype;
    }

    public String getTargetrequire() {
        return targetrequire;
    }

    public void setTargetrequire(String targetrequire) {
        this.targetrequire = targetrequire;
    }

    public String getResearchcontent() {
        return researchcontent;
    }

    public void setResearchcontent(String researchcontent) {
        this.researchcontent = researchcontent;
    }

    public String getTitleorigin() {
        return titleorigin;
    }

    public void setTitleorigin(String titleorigin) {
        this.titleorigin = titleorigin;
    }

    public String getTitletype() {
        return titletype;
    }

    public void setTitletype(String titletype) {
        this.titletype = titletype;
    }

    public Short getReqirestudentnum() {
        return reqirestudentnum;
    }

    public void setReqirestudentnum(Short reqirestudentnum) {
        this.reqirestudentnum = reqirestudentnum;
    }

    public Date getGdTime() {
        return gdTime;
    }

    public void setGdTime(Date gdTime) {
        this.gdTime = gdTime;
    }
}