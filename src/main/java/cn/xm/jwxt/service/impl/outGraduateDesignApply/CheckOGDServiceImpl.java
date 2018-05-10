package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.bean.baseInfo.TCollegeBaseInfo;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.CheckStuApplyBaseInfoMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.CheckOGDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings("ALL")
public class CheckOGDServiceImpl implements CheckOGDService {

    @Autowired
    private CheckStuApplyBaseInfoMapper checkStuApplyInfoMapper;

    @Override
    public List<Map<String, Object>> selectOGDApplyStuBySelective(String userID,String stadyYear,
                                                                    String major,String studentNum,
                                                                    String checkStatus) throws SQLException {
        List<Map<String,Object>> resultList= new ArrayList<Map<String,Object>>();
        Map<String,Object> map = new HashMap<String,Object>();
        String collageName = null;
        map.put("stadyYear",stadyYear);
        map.put("major",major);
        map.put("studentNum",studentNum);
        map.put("checkStatus",checkStatus);
        //根据用户信息获取该用户所属的学院名称
//        TCollegeBaseInfo collegeBaseInfo = checkStuApplyInfoMapper.selectCollegeInfoByUserID(userID);
//        if(collegeBaseInfo!=null){
//            collageName = collegeBaseInfo.getCollegename();
//        }
        map.put("userId",userID);
        map.put("collageName",collageName);
        //查询校外毕设学生的信息
        resultList = checkStuApplyInfoMapper.selectCollageODGApplyStuInfo(map);
        return resultList;
    }
}
