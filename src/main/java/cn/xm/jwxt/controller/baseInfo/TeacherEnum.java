package cn.xm.jwxt.controller.baseInfo;

public enum TeacherEnum {

    //如果打算自定义自己的方法，那么必须在enum实例序列的最后添加一个分号。而且 Java 要求必须先定义 enum 实例。
    //序号
    TEACHER_NUM(0),
    //教师编号
    TEACHER_NAEM(1),
    //教师姓名
//    COLLEGE_NAME(2),
//    //学院名称
//    MAJOR_ID(3),
//    //专业编号
    TEACHER_SEX(2),
    //教师性别
    TEACHER_TEL(3),
    //教师电话
//    MAJOR_NAME(20),
//    //专业名称
    POSITIONALTITLE(4),
    //职称
    TEACHERPOSITION(5),
    //职务
//    COLLEGE_ID(20),
//    //学院编号
    EDUCATION(6),
    //学历
    DEGREE(7),
    //学位
    GRADUATE_SCHOOL(8),
    //毕业学校
    GRADUATE_MAJOR(9),
    //毕业专业
    JOINSCHOOLTIME(10);
    //入校时间
//    IN_POSITION(11);
//    //是否在职
    private int index;
    TeacherEnum(int index){
        this.index = index;
    }

    /**
     * 根据类型的序号，返回类型的枚举实例。
     * @param index 类型名称
     */
    public static TeacherEnum fromIndex(int index) {
        for (TeacherEnum teacherInfo : TeacherEnum.values()) {
            if (index == teacherInfo.getIndex()) {
                return teacherInfo;
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
