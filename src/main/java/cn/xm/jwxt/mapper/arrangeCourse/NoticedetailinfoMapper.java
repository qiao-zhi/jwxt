package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.Noticedetailinfo;
import cn.xm.jwxt.bean.arrangeCourse.NoticedetailinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticedetailinfoMapper {
    int countByExample(NoticedetailinfoExample example);

    int deleteByExample(NoticedetailinfoExample example);

    int deleteByPrimaryKey(Integer noticedatailid);

    int insert(Noticedetailinfo record);

    int insertSelective(Noticedetailinfo record);

    List<Noticedetailinfo> selectByExample(NoticedetailinfoExample example);

    Noticedetailinfo selectByPrimaryKey(Integer noticedatailid);

    int updateByExampleSelective(@Param("record") Noticedetailinfo record, @Param("example") NoticedetailinfoExample example);

    int updateByExample(@Param("record") Noticedetailinfo record, @Param("example") NoticedetailinfoExample example);

    int updateByPrimaryKeySelective(Noticedetailinfo record);

    int updateByPrimaryKey(Noticedetailinfo record);
}