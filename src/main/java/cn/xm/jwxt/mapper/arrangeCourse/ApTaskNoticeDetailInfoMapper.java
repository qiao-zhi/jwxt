package cn.xm.jwxt.mapper.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfo;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApTaskNoticeDetailInfoMapper {
    int countByExample(ApTaskNoticeDetailInfoExample example);

    int deleteByExample(ApTaskNoticeDetailInfoExample example);

    int deleteByPrimaryKey(Integer noticeDetailId);

    int insert(ApTaskNoticeDetailInfo record);

    int insertSelective(ApTaskNoticeDetailInfo record);

    List<ApTaskNoticeDetailInfo> selectByExample(ApTaskNoticeDetailInfoExample example);

    ApTaskNoticeDetailInfo selectByPrimaryKey(Integer noticeDetailId);

    int updateByExampleSelective(@Param("record") ApTaskNoticeDetailInfo record, @Param("example") ApTaskNoticeDetailInfoExample example);

    int updateByExample(@Param("record") ApTaskNoticeDetailInfo record, @Param("example") ApTaskNoticeDetailInfoExample example);

    int updateByPrimaryKeySelective(ApTaskNoticeDetailInfo record);

    int updateByPrimaryKey(ApTaskNoticeDetailInfo record);
}