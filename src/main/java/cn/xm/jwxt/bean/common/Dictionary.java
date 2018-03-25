package cn.xm.jwxt.bean.common;

public class Dictionary {
    private String dictionaryid;

    private String dictionaryname;

    private String updictionaryid;

    private String description;

    private String datatype;

    private String sortno;

    private String isuse;

    private String remark1;

    public String getDictionaryid() {
        return dictionaryid;
    }

    public void setDictionaryid(String dictionaryid) {
        this.dictionaryid = dictionaryid == null ? null : dictionaryid.trim();
    }

    public String getDictionaryname() {
        return dictionaryname;
    }

    public void setDictionaryname(String dictionaryname) {
        this.dictionaryname = dictionaryname == null ? null : dictionaryname.trim();
    }

    public String getUpdictionaryid() {
        return updictionaryid;
    }

    public void setUpdictionaryid(String updictionaryid) {
        this.updictionaryid = updictionaryid == null ? null : updictionaryid.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype == null ? null : datatype.trim();
    }

    public String getSortno() {
        return sortno;
    }

    public void setSortno(String sortno) {
        this.sortno = sortno == null ? null : sortno.trim();
    }

    public String getIsuse() {
        return isuse;
    }

    public void setIsuse(String isuse) {
        this.isuse = isuse == null ? null : isuse.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }
}