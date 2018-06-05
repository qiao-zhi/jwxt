package cn.xm.jwxt.controller.baseInfo;

public enum TeacherEnum {

    //如果打算自定义自己的方法，那么必须在enum实例序列的最后添加一个分号。而且 Java 要求必须先定义 enum 实例。
    //序号
    TEACHER_NUM(0),
    //教师编号
    TEACHER_NAEM(20),
    //教师姓名
    TEACHER_SEX(2),
    //教师性别
    MAJOR_NAME(20),
    //专业名称
    MAJOR_ID(11),
    //专业编号
    COLLEGE_NAME(20),
    //学院名称
    COLLEGE_ID(20),
    //学院编号
    POSITIONALTITLE(20),
    //职称
    TEACHERPOSITION(26),
    //职务
    JOINSCHOOLTIME(15),
    //入校时间
    TEACHER_TEL(11),
    //教师电话
    GRADUATE_SCHOOL(20),
    //毕业学校
    GRADUATE_MAJOR(20),
    //毕业专业
    TEACHERBIRTH(9),
    //教师生日
    IN_POSITION(10);
    //是否在职
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
