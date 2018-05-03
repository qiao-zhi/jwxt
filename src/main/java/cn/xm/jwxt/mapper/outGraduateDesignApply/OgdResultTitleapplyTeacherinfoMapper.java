package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.OgdResultTitleapplyTeacherinfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.OgdResultTitleapplyTeacherinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OgdResultTitleapplyTeacherinfoMapper {
    int countByExample(OgdResultTitleapplyTeacherinfoExample example);

    int deleteByExample(OgdResultTitleapplyTeacherinfoExample example);

    int insert(OgdResultTitleapplyTeacherinfo record);

    int insertSelective(OgdResultTitleapplyTeacherinfo record);

    List<OgdResultTitleapplyTeacherinfo> selectByExample(OgdResultTitleapplyTeacherinfoExample example);

    int updateByExampleSelective(@Param("record") OgdResultTitleapplyTeacherinfo record, @Param("example") OgdResultTitleapplyTeacherinfoExample example);

    int updateByExample(@Param("record") OgdResultTitleapplyTeacherinfo record, @Param("example") OgdResultTitleapplyTeacherinfoExample example);
}