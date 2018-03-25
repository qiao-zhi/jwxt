package cn.xm.jwxt.mapper.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Taskbookinfo;
import cn.xm.jwxt.bean.graduateDesign.TaskbookinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskbookinfoMapper {
    int countByExample(TaskbookinfoExample example);

    int deleteByExample(TaskbookinfoExample example);

    int deleteByPrimaryKey(Integer bookid);

    int insert(Taskbookinfo record);

    int insertSelective(Taskbookinfo record);

    List<Taskbookinfo> selectByExample(TaskbookinfoExample example);

    Taskbookinfo selectByPrimaryKey(Integer bookid);

    int updateByExampleSelective(@Param("record") Taskbookinfo record, @Param("example") TaskbookinfoExample example);

    int updateByExample(@Param("record") Taskbookinfo record, @Param("example") TaskbookinfoExample example);

    int updateByPrimaryKeySelective(Taskbookinfo record);

    int updateByPrimaryKey(Taskbookinfo record);
}