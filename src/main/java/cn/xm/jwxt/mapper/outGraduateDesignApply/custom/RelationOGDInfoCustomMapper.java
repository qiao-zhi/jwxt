package cn.xm.jwxt.mapper.outGraduateDesignApply.custom;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;
import java.util.List;

public interface RelationOGDInfoCustomMapper {
    /**
     * 根据申请ID查询学生校外毕设的申请表中得信息
     * @param outsideApplyID
     * @return
     */
    Outgradesigninfo selectInfoByOutsideApplyID(String outsideApplyID);
}
