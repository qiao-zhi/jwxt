package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;

/**
 * 对学生校外申请基本信息表操作
 * @author Abner
 */
public interface Outgradesigninfoservice {
    public Outgradesigninfo selectInfo(String outsideApplyID);
    public int updateInfo(Outgradesigninfo outgraDesignInfo);
    public int deleteInfo(String outsideApplyID);
    public int insertInfo(Outgradesigninfo outgraDesignInfo);
}
