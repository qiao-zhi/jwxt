package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.Noticeinfo;
import cn.xm.jwxt.bean.arrangeCourse.NoticeinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeinfoMapper {
    int countByExample(NoticeinfoExample example);

    int deleteByExample(NoticeinfoExample example);

    int deleteByPrimaryKey(String noticebookid);

    int insert(Noticeinfo record);

    int insertSelective(Noticeinfo record);

    List<Noticeinfo> selectByExample(NoticeinfoExample example);

    Noticeinfo selectByPrimaryKey(String noticebookid);

    int updateByExampleSelective(@Param("record") Noticeinfo record, @Param("example") NoticeinfoExample example);

    int updateByExample(@Param("record") Noticeinfo record, @Param("example") NoticeinfoExample example);

    int updateByPrimaryKeySelective(Noticeinfo record);

    int updateByPrimaryKey(Noticeinfo record);
}