package cn.xm.jwxt.mapper.outGraduateDesignApply.custom;

import cn.xm.jwxt.bean.outGraduateDesignApply.Gradesignleaveapply;

public interface RelationOGDLeaveCustomMapper {
    Gradesignleaveapply selectLeaveByOutsideApplyID(String leaveID);
}
