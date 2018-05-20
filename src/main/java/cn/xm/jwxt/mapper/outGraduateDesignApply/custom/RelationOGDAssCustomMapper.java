package cn.xm.jwxt.mapper.outGraduateDesignApply.custom;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgraduateassignment;

public interface RelationOGDAssCustomMapper {
    public Outgraduateassignment selectAssInfo(String assignmentId);
    public int deleteCheckInfo(String assignmentId);
}
