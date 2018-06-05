package cn.xm.jwxt.service.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgraduateassignment;

import java.sql.SQLException;
import java.util.Map;

public interface OutGradesignAssignmentService {
    public Outgraduateassignment selectAssignmentById(String assignmentId)throws SQLException;
    public boolean saveStudentsign(String assignmentId,String signName) throws SQLException;
    public boolean saveAssignmentById(Map<String,Object> map, String status,String isok)throws Exception;
    public boolean commitAssigmengById(Outgraduateassignment outgraduateassignment) throws SQLException;

}
