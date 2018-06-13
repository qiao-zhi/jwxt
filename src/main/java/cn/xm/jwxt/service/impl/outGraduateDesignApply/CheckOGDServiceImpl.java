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
                                                                    String checkStatus,String identity,String name) throws SQLException {
        List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
        Map<String,Object> map = new HashMap<String,Object>();
        String collageName = null;
        map.put("stadyYear",stadyYear);
        map.put("major",major);
        map.put("studentNum",studentNum);
        if(identity!=null){
            if(identity.equals("辅导员")){
                if(checkStatus!=null&&checkStatus.equals("未审核")){
                    map.put("identity2","01");
                } else if(checkStatus!=null&&checkStatus.equals("已审核")){
                    map.put("identity3","10");
                } else {
                    map.put("identity1","01");
                }

            } else if(identity.equals("副书记")){
                if(checkStatus!=null&&checkStatus.equals("未审核")){
                    map.put("identity2","11");
                } else if(checkStatus!=null&&checkStatus.equals("已审核")){
                    map.put("identity3","20");
                } else {
                    map.put("identity1","11");
                }
            } else if(identity.equals("指导教师")){
                if(checkStatus!=null&&checkStatus.equals("未审核")){
                    map.put("identity2","21");
                } else if(checkStatus!=null&&checkStatus.equals("已审核")){
                    map.put("identity3","30");
                } else {
                    map.put("identity1","21");
                }
                map.put("name",name);
            } else if(identity.equals("教研室主任")){
                if(checkStatus!=null&&checkStatus.equals("未审核")){
                    map.put("identity2","31");
                } else if(checkStatus!=null&&checkStatus.equals("已审核")){
                    map.put("identity3","40");
                } else {
                    map.put("identity1","30");
                }
            } else if(identity.equals("系主任")){
                if(checkStatus!=null&&checkStatus.equals("未审核")){
                    map.put("identity2","41");
                } else if(checkStatus!=null&&checkStatus.equals("已审核")){
                    map.put("identity3","50");
                } else {
                    map.put("identity1","40");
                }
            } else if(identity.equals("主管院长")){
                if(checkStatus!=null&&checkStatus.equals("未审核")){
                    map.put("identity2","51");
                } else if(checkStatus!=null&&checkStatus.equals("已审核")){
                    map.put("identity3","60");
                } else {
                    map.put("identity1","51");
                }
            }
        }
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
