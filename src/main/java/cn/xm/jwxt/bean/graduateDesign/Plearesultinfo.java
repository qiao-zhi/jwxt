package cn.xm.jwxt.bean.graduateDesign;

public class Plearesultinfo {
    private Integer plearesultid;

    private Integer arrangeid;

    private String guideteacheradvice;

    private String guideteacherscore;

    private String readteacheradvice;

    private String readteacherscore;

    private Float plearesultscore;

    private Float finallyscore;

    private String pleamainmatter;

    private String committeeadvice;

    private String remark;

    public Integer getPlearesultid() {
        return plearesultid;
    }

    public void setPlearesultid(Integer plearesultid) {
        this.plearesultid = plearesultid;
    }

    public Integer getArrangeid() {
        return arrangeid;
    }

    public void setArrangeid(Integer arrangeid) {
        this.arrangeid = arrangeid;
    }

    public String getGuideteacheradvice() {
        return guideteacheradvice;
    }

    public void setGuideteacheradvice(String guideteacheradvice) {
        this.guideteacheradvice = guideteacheradvice == null ? null : guideteacheradvice.trim();
    }

    public String getGuideteacherscore() {
        return guideteacherscore;
    }

    public void setGuideteacherscore(String guideteacherscore) {
        this.guideteacherscore = guideteacherscore == null ? null : guideteacherscore.trim();
    }

    public String getReadteacheradvice() {
        return readteacheradvice;
    }

    public void setReadteacheradvice(String readteacheradvice) {
        this.readteacheradvice = readteacheradvice == null ? null : readteacheradvice.trim();
    }

    public String getReadteacherscore() {
        return readteacherscore;
    }

    public void setReadteacherscore(String readteacherscore) {
        this.readteacherscore = readteacherscore == null ? null : readteacherscore.trim();
    }

    public Float getPlearesultscore() {
        return plearesultscore;
    }

    public void setPlearesultscore(Float plearesultscore) {
        this.plearesultscore = plearesultscore;
    }

    public Float getFinallyscore() {
        return finallyscore;
    }

    public void setFinallyscore(Float finallyscore) {
        this.finallyscore = finallyscore;
    }

    public String getPleamainmatter() {
        return pleamainmatter;
    }

    public void setPleamainmatter(String pleamainmatter) {
        this.pleamainmatter = pleamainmatter == null ? null : pleamainmatter.trim();
    }

    public String getCommitteeadvice() {
        return committeeadvice;
    }

    public void setCommitteeadvice(String committeeadvice) {
        this.committeeadvice = committeeadvice == null ? null : committeeadvice.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}