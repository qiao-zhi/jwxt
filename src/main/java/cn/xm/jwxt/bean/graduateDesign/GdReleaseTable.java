package cn.xm.jwxt.bean.graduateDesign;

public class GdReleaseTable {
    /**
     * 发布ID
     */
    private String releaseID;
    /**
     *毕设基本信息编号
     */
    private String graDesignID;
    /**
     * 课题发布标识
     */
    private String projectReleaseFlag;
    /**
     * 学生选题标识
     */
    private String chooseProjectReleaseFlag;

    private String remark;

    public String getReleaseID() {
        return releaseID;
    }

    public void setReleaseID(String releaseID) {
        this.releaseID = releaseID;
    }

    public String getGraDesignID() {
        return graDesignID;
    }

    public void setGraDesignID(String graDesignID) {
        this.graDesignID = graDesignID;
    }

    public String getProjectReleaseFlag() {
        return projectReleaseFlag;
    }

    public void setProjectReleaseFlag(String projectReleaseFlag) {
        this.projectReleaseFlag = projectReleaseFlag;
    }

    public String getChooseProjectReleaseFlag() {
        return chooseProjectReleaseFlag;
    }

    public void setChooseProjectReleaseFlag(String chooseProjectReleaseFlag) {
        this.chooseProjectReleaseFlag = chooseProjectReleaseFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
