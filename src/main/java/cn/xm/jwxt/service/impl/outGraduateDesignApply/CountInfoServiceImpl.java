package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.CheckStuApplyBaseInfoMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.OGDApplyResultCustomMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.CountInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings("all")
@Transactional
public class CountInfoServiceImpl  implements CountInfoService{
    @Autowired
    private CheckStuApplyBaseInfoMapper checkStuApplyBaseInfoMapper;
    @Autowired
    private OGDApplyResultCustomMapper ogdApplyResultCustomMapper;


    /**
     * 获取学院中本学年的班级信息
     * @param userID
     * @return
     * @throws SQLException
     */
    @Override
    public List<Map<String,Object>> countMajorClass(Map<String,Object> map) throws SQLException {
        List<Map<String, Object>> classInfos = checkStuApplyBaseInfoMapper.selectClassInfoByUserID(map);
        return classInfos;
    }

    /**
     * 获取一个班级中校外申请的人数信息
     * @param classID
     * @return
     * @throws SQLException
     */
    @Override
    public List<Map<String, Object>> countMajorClassOGDStudentInfo(String classID) throws SQLException {
        List<Map<String, Object>> list = ogdApplyResultCustomMapper.countOGDStudentNumInClass(classID);
        return list;
    }
}
