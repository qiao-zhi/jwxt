package cn.xm.jwxt.bean.arrangeCourse.custom;

/**
 * 项目名称：jwxt
 * 类描述：排课任务状态的枚举类
 * 创建人：LL
 * 创建时间：2018/5/4 13:22
 */
public enum ArrangeCourseTaskStatusEnum {
    //1未分配；
    NOT_MANAGE("1","未分配"),
    //2未发送；
    NOT_SEND("2","未发送"),
    //3未接收；
    NOT_RECEIVE("3","未接收"),
    //4待排课；
    WAIT_ARRANGE("4","待排课"),
    //5待审核；
    WAIT_AUDIT("5","待审核"),
    //6通过审核；
    PASS_AUDIT("6","审核通过"),
    //7不通过审核
    NOT_PASS_AUDIT("7","审核不通过");

    private String status;
    private String value;
    //构造函数
    ArrangeCourseTaskStatusEnum(String status,String value){
        this.status = status;
        this.value = value;
    }

    /**
     * 根据状态码返回对应的枚举实例
     * @param status
     * @return
     */
    public static ArrangeCourseTaskStatusEnum formStatus(String status){
        for(ArrangeCourseTaskStatusEnum taskStatusEnum : ArrangeCourseTaskStatusEnum.values()){
            if(taskStatusEnum.getStatus().equals(status)){
                return taskStatusEnum;
            }
        }
        throw new IllegalArgumentException("错误的状态码" + status);
    }

    /**
     * 根据状态码返回对应的value值
     * @param status
     * @return
     */
    public static String getStatusValue(String status){
        for(ArrangeCourseTaskStatusEnum taskStatusEnum : ArrangeCourseTaskStatusEnum.values()){
            if(taskStatusEnum.getStatus().equals(status)){
                return taskStatusEnum.getValue();
            }
        }
        throw new IllegalArgumentException("错误的状态码" + status);
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
