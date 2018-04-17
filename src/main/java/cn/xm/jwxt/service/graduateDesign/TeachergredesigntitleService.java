package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Teachergredesigntitle;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 教师毕业课题题目申请表的栏的清单Service
 */
public interface TeachergredesigntitleService {
    int countByExample(TeachergredesigntitleExample example);

    boolean deleteByExample(TeachergredesigntitleExample example);

    boolean deleteByPrimaryKey(String teachertitleid);

    boolean insert(Teachergredesigntitle record);

    boolean insertSelective(Teachergredesigntitle record);

    List<Teachergredesigntitle> selectByExample(TeachergredesigntitleExample example);

    Teachergredesigntitle selectByPrimaryKey(String teachertitleid);

    boolean updateByExampleSelective(@Param("record") Teachergredesigntitle record, @Param("example") TeachergredesigntitleExample example);

    boolean updateByExample(@Param("record") Teachergredesigntitle record, @Param("example") TeachergredesigntitleExample example);

    boolean updateByPrimaryKeySelective(Teachergredesigntitle record);

    boolean updateByPrimaryKey(Teachergredesigntitle record);
}
