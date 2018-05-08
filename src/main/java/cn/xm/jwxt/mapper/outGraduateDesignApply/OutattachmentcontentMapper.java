package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outattachmentcontent;
import cn.xm.jwxt.bean.outGraduateDesignApply.OutattachmentcontentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutattachmentcontentMapper {
    int countByExample(OutattachmentcontentExample example);

    int deleteByExample(OutattachmentcontentExample example);

    int deleteByPrimaryKey(String contentid);

    int insert(Outattachmentcontent record);

    int insertSelective(Outattachmentcontent record);

    List<Outattachmentcontent> selectByExample(OutattachmentcontentExample example);

    Outattachmentcontent selectByPrimaryKey(String contentid);

    int updateByExampleSelective(@Param("record") Outattachmentcontent record, @Param("example") OutattachmentcontentExample example);

    int updateByExample(@Param("record") Outattachmentcontent record, @Param("example") OutattachmentcontentExample example);

    int updateByPrimaryKeySelective(Outattachmentcontent record);

    int updateByPrimaryKey(Outattachmentcontent record);
}