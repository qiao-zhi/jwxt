package cn.xm.jwxt.controller.baseInfo;


public enum StudentEnum {

    //如果打算自定义自己的方法，那么必须在enum实例序列的最后添加一个分号。而且 Java 要求必须先定义 enum 实例。
    //序号
    STUDENT_NUM(0),
    //学生学号
    STUDNET_NAME(1),
    //学生姓名
    STUDENT_SEX(2),
    //学生性别
    IDNUM(3),
    //身份证号
    ENROLLMENTTIME(4),
    //入学时间
    END_TIME(5);
    //毕业时间
    private int index;
    StudentEnum(int index){
        this.index = index;
    }

    /**
     * 根据类型的序号，返回类型的枚举实例。
     * @param index 类型名称
     */
    public static StudentEnum fromIndex(int index) {
        for (StudentEnum studentInfo : StudentEnum.values()) {
            if (index == studentInfo.getIndex()) {
                return studentInfo;
            }
        }
        return null;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
