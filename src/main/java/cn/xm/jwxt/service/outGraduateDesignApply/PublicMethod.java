package cn.xm.jwxt.service.outGraduateDesignApply;

import org.apache.ibatis.jdbc.SQL;

import java.sql.SQLException;
import java.util.Map;

public interface PublicMethod {
    /**
     * 判断用户输入的密码是否正确
     * @param userID
     * @param signPassword
     * @return status  1:表示密码正确，0：表示密码错误，2：未查询到密码信息
     * @throws SQLException
     */
    public Map<String,Object> sureStudentSign(String userID, String signPassword) throws SQLException;

    /**
     * 对学生申请信息中的所有表中提交字段初始化为初始状态
     * @return
     * @throws SQLException
     */
    public Boolean initializationApplyInfo(Map<String,Object> map) throws SQLException;

    /**
     * 修改学生校外申请表中的状态字段
     * @param id
     * @param status
     * @return
     * @throws SQLException
     */
    public Boolean updateStatusInInfoApply(String id,String status)throws SQLException;

    public Boolean updateStatusInInfoApply(String id,String status,String commit)throws SQLException;

    public Boolean updateStatusIntitleApply(String id,String status)throws SQLException;

    public Boolean updateStatusInleaveApply(String id,String status)throws SQLException;

    public Boolean updateStatusInAggreementApply(String id,String status)throws SQLException;

    public Boolean updateStatusInAssignmentApply(String id,String status)throws SQLException;

}
