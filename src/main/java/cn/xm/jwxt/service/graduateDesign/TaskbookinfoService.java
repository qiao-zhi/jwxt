package cn.xm.jwxt.service.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Taskbookinfo;
import cn.xm.jwxt.bean.graduateDesign.TaskbookinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TaskbookinfoService {
    int countByExample(TaskbookinfoExample example);

    boolean deleteByExample(TaskbookinfoExample example);

    boolean deleteByPrimaryKey(Integer bookid);

    boolean insert(Taskbookinfo record);

    boolean insertSelective(Taskbookinfo record);

    List<Taskbookinfo> selectByExample(TaskbookinfoExample example);

    Taskbookinfo selectByPrimaryKey(Integer bookid);

    boolean updateByExampleSelective(@Param("record") Taskbookinfo record, @Param("example") TaskbookinfoExample example);

    boolean updateByExample(@Param("record") Taskbookinfo record, @Param("example") TaskbookinfoExample example);

    boolean updateByPrimaryKeySelective(Taskbookinfo record);

    boolean updateByPrimaryKey(Taskbookinfo record);
}
