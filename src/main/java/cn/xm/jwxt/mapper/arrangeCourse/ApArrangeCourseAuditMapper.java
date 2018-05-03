package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseAudit;
import cn.xm.jwxt.bean.arrangeCourse.ApArrangeCourseAuditExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApArrangeCourseAuditMapper {
    int countByExample(ApArrangeCourseAuditExample example);

    int deleteByExample(ApArrangeCourseAuditExample example);

    int deleteByPrimaryKey(String auditId);

    int insert(ApArrangeCourseAudit record);

    int insertSelective(ApArrangeCourseAudit record);

    List<ApArrangeCourseAudit> selectByExample(ApArrangeCourseAuditExample example);

    ApArrangeCourseAudit selectByPrimaryKey(String auditId);

    int updateByExampleSelective(@Param("record") ApArrangeCourseAudit record, @Param("example") ApArrangeCourseAuditExample example);

    int updateByExample(@Param("record") ApArrangeCourseAudit record, @Param("example") ApArrangeCourseAuditExample example);

    int updateByPrimaryKeySelective(ApArrangeCourseAudit record);

    int updateByPrimaryKey(ApArrangeCourseAudit record);
}