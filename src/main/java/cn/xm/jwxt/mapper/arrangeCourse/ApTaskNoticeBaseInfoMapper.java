package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeBaseInfo;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApTaskNoticeBaseInfoMapper {
    int countByExample(ApTaskNoticeBaseInfoExample example);

    int deleteByExample(ApTaskNoticeBaseInfoExample example);

    int deleteByPrimaryKey(String noticeBookId);

    int insert(ApTaskNoticeBaseInfo record);

    int insertSelective(ApTaskNoticeBaseInfo record);

    List<ApTaskNoticeBaseInfo> selectByExample(ApTaskNoticeBaseInfoExample example);

    ApTaskNoticeBaseInfo selectByPrimaryKey(String noticeBookId);

    int updateByExampleSelective(@Param("record") ApTaskNoticeBaseInfo record, @Param("example") ApTaskNoticeBaseInfoExample example);

    int updateByExample(@Param("record") ApTaskNoticeBaseInfo record, @Param("example") ApTaskNoticeBaseInfoExample example);

    int updateByPrimaryKeySelective(ApTaskNoticeBaseInfo record);

    int updateByPrimaryKey(ApTaskNoticeBaseInfo record);
}