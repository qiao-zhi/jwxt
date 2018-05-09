package cn.xm.jwxt.service.outGraduateDesignApply;

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
}
