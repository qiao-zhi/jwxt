package cn.xm.jwxt.mapper.outGraduateDesignApply.custom;

import java.util.List;
import java.util.Map;

public interface OGDApplyResultCustomMapper {

    /*跟新毕设结果表中的学生为校外*/
    int updateStudentTitleResultToOutSchool(String outsideApplyId);
    /*查询一个班级中校外毕设的人的详细信息*/
    List<Map<String,Object>> countOGDStudentNumInClass(String classID);

}
