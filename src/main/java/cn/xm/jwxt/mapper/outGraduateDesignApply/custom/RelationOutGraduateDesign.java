package cn.xm.jwxt.mapper.outGraduateDesignApply.custom;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;
import java.util.List;

public interface RelationOutGraduateDesign {
    /**
     * 根据申请ID查询学生校外毕设的所有信息
     * @param outsideApplyID
     * @return
     */
    Outgradesigninfo findAllByOutsideApplyID(String outsideApplyID);
}
