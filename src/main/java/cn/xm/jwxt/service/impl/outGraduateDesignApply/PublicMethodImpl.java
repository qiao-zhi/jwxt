package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.bean.baseInfo.Signinfo;
import cn.xm.jwxt.mapper.baseInfo.SigninfoMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.PublicMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Service
@SuppressWarnings("all")
@Transactional
public class PublicMethodImpl implements PublicMethod{
    @Autowired
    private SigninfoMapper signinfoMapper;


    @Override
    public Map<String,Object> sureStudentSign(String userID, String signPassword) throws SQLException {
        Map<String,Object> map = new HashMap<String,Object>();
        Signinfo signInfo = signinfoMapper.selectByPrimaryKey(userID);
        if(signInfo!=null){
            String password = signInfo.getSignpassword();
            if(signPassword.equals(password)){
                map.put("status","1");
                map.put("signInfo",signInfo);
                return map;
            } else {
                map.put("status","0");
                return map;
            }
        }
        map.put("status",2);
        return map;
    }
}
