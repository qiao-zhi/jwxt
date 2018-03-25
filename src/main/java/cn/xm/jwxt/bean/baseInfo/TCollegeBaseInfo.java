package cn.xm.jwxt.bean.baseInfo;

public class TCollegeBaseInfo {
    private String collegeid;

    private String collegenum;

    private String collegename;

    private String collegeshortname;

    private String collegeintroduction;

    private String collegepresident;

    private String collegepresidentf;

    private String upcollegenum;

    private String remark1;

    private String remark2;

    public String getCollegeid() {
        return collegeid;
    }

    public void setCollegeid(String collegeid) {
        this.collegeid = collegeid == null ? null : collegeid.trim();
    }

    public String getCollegenum() {
        return collegenum;
    }

    public void setCollegenum(String collegenum) {
        this.collegenum = collegenum == null ? null : collegenum.trim();
    }

    public String getCollegename() {
        return collegename;
    }

    public void setCollegename(String collegename) {
        this.collegename = collegename == null ? null : collegename.trim();
    }

    public String getCollegeshortname() {
        return collegeshortname;
    }

    public void setCollegeshortname(String collegeshortname) {
        this.collegeshortname = collegeshortname == null ? null : collegeshortname.trim();
    }

    public String getCollegeintroduction() {
        return collegeintroduction;
    }

    public void setCollegeintroduction(String collegeintroduction) {
        this.collegeintroduction = collegeintroduction == null ? null : collegeintroduction.trim();
    }

    public String getCollegepresident() {
        return collegepresident;
    }

    public void setCollegepresident(String collegepresident) {
        this.collegepresident = collegepresident == null ? null : collegepresident.trim();
    }

    public String getCollegepresidentf() {
        return collegepresidentf;
    }

    public void setCollegepresidentf(String collegepresidentf) {
        this.collegepresidentf = collegepresidentf == null ? null : collegepresidentf.trim();
    }

    public String getUpcollegenum() {
        return upcollegenum;
    }

    public void setUpcollegenum(String upcollegenum) {
        this.upcollegenum = upcollegenum == null ? null : upcollegenum.trim();
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