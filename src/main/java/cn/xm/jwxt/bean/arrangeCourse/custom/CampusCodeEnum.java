package cn.xm.jwxt.bean.arrangeCourse.custom;

/**
 * 项目名称：jwxt
 * 类描述：校区编码的枚举类
 * 创建人：LL
 * 创建时间：2018/5/14 11:25
 */
public enum CampusCodeEnum {
    MAIN_CAMPUS("1","主校区"),
    HUAKE_CAMPUS("2","华科学院"),
    JINCHENG_CAMPUS("3","晋城校区");

    private String status;
    private String value;
    //构造函数
    CampusCodeEnum(String status,String value){
        this.status = status;
        this.value = value;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
