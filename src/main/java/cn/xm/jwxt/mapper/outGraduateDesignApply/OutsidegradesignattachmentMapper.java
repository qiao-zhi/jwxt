package cn.xm.jwxt.mapper.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outsidegradesignattachment;
import cn.xm.jwxt.bean.outGraduateDesignApply.OutsidegradesignattachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutsidegradesignattachmentMapper {
    int countByExample(OutsidegradesignattachmentExample example);

    int deleteByExample(OutsidegradesignattachmentExample example);

    int deleteByPrimaryKey(String attachmentid);

    int insert(Outsidegradesignattachment record);

    int insertSelective(Outsidegradesignattachment record);

    List<Outsidegradesignattachment> selectByExample(OutsidegradesignattachmentExample example);

    Outsidegradesignattachment selectByPrimaryKey(String attachmentid);

    int updateByExampleSelective(@Param("record") Outsidegradesignattachment record, @Param("example") OutsidegradesignattachmentExample example);

    int updateByExample(@Param("record") Outsidegradesignattachment record, @Param("example") OutsidegradesignattachmentExample example);

    int updateByPrimaryKeySelective(Outsidegradesignattachment record);

    int updateByPrimaryKey(Outsidegradesignattachment record);
}