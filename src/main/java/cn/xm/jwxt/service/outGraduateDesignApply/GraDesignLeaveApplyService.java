package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Gradesignleaveapply;

/**
 * 通过校外申请编号对毕业生请假表进行操作
 * @author Abner
 */
public interface GraDesignLeaveApplyService {
    public Gradesignleaveapply selectInfo(String outsideApplyID);
    public int updateInfo(Gradesignleaveapply graDesignLeaveApply);
    public int deleteInfo(String outsideApplyID);
    public int insertInfo(Gradesignleaveapply graDesignLeaveApply);
}
