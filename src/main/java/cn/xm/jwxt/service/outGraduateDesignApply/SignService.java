package cn.xm.jwxt.service.outGraduateDesignApply;

import java.sql.SQLException;
import java.util.Map;

public interface SignService {
    /**
     * 增加辅导员签字审核
     * @param map（包括所需要的ID，审核结果，审核意见等）
     * @return
     * @throws SQLException
     */
    Boolean addfudaoyuanSign(Map<String,Object> map) throws SQLException;
}
