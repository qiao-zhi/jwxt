package cn.xm.jwxt.service.outGraduateDesignApply;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CheckOGDService {

    /**
     * 根据用户id查询该用户所属得院，然后查询该院校外毕设申请学生的信息
     * @param userID
     * @return
     * @throws SQLException
     */
    public List<Map<String,Object>> selectOGDApplyStuBySelective(String userID,String stadyYear,
                                                                   String major,String studentNum,
                                                                   String checkStatus,String identity,String name)throws SQLException;
}
