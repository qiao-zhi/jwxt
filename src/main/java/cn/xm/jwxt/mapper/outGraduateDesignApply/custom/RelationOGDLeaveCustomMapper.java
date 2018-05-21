package cn.xm.jwxt.mapper.outGraduateDesignApply.custom;

import cn.xm.jwxt.bean.outGraduateDesignApply.Gradesignleaveapply;

public interface RelationOGDLeaveCustomMapper {
    /**
     * 通过请假编号查询学生请假信息
     * @param leaveID
     * @return
     */
    Gradesignleaveapply selectLeaveByOutsideApplyID(String leaveID);

    /**
     * 通过请假id删除所有的审核信息
     * @param leaveID
     * @return
     */
    int deleteCheckLeavebyLeaveId(String leaveID);
}
