package cn.xm.jwxt.controller.arrangeCourse;

/**
 * 项目名称：jwxt
 * 类描述：通知书明细ENUM
 * 创建人：LL
 * 创建时间：2018/5/3 11:48
 */
public enum NoticeDetailEnum {
    //如果打算自定义自己的方法，那么必须在enum实例序列的最后添加一个分号。而且 Java 要求必须先定义 enum 实例。
    //序号
    DATAIL_SORT(0),
    //课程代码
    COURSE_CODE(1),
    //课程名称
    COURSE_NAME(2),
    //教学计划号
    TEACH_PLAN_NUM(3),
    //专业名称
    MAJOR_NAME(4),
    //校区代码
    CAMPUS_CODE(5),
    //班级名称和人数
    CLASS_NAME_SUM(6),
    //年级
    GRADE(7),
    //专业总人数
    MAJOR_STUDENTS_NUMBER(8),
    //考核方式
    TEST_METHOD(9),
    //周学时
    WEEK_PERIOD(10),
    //总学时
    TOTAL_PERIOD(11),
    //上课起止周次
    START_STOP_WEEK(12),
    //上课时数
    CONTACT_TIME(13),
    //实验时数
    EXPERIMENTAL_TIME(16),
    //课程性质
    COURSE_CHARACTER(19);
    private int index;
    NoticeDetailEnum(int index){
        this.index = index;
    }

    /**
     * 根据类型的序号，返回类型的枚举实例。
     * @param index 类型名称
     */
    public static NoticeDetailEnum fromIndex(int index) {
        for (NoticeDetailEnum noticeInfo : NoticeDetailEnum.values()) {
            if (index == noticeInfo.getIndex()) {
                return noticeInfo;
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
