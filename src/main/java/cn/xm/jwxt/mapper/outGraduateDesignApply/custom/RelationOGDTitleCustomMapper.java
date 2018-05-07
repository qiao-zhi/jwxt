package cn.xm.jwxt.mapper.outGraduateDesignApply.custom;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigntitleapply;

public interface RelationOGDTitleCustomMapper {
    Outgradesigntitleapply selectTitleByOutsideApplyID(String titleID);
}
