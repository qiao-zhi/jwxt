package cn.xm.jwxt.controller.outGraduateDesignApply;

import cn.xm.jwxt.bean.baseInfo.Signinfo;
import cn.xm.jwxt.service.outGraduateDesignApply.PublicMethod;
import cn.xm.jwxt.service.outGraduateDesignApply.SignService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/sign")
@SuppressWarnings("all")
public class TeacherSign {
    private Logger logger = Logger.getLogger(TeacherSign.class);
    @Autowired
    private PublicMethod publicMethod;
    @Autowired
    private SignService signService;

    @RequestMapping("/fudaoyuanSign.do")
    @ResponseBody
    public Map<String,Object> fudaoyuanSign(@RequestParam Map map){
        Map<String,Object> resultMap = new HashMap<>();
        /*获取前台传出来的数据*/
        String userId = (String)map.get("userId");
        String signPassword = (String)map.get("signPassword");
        try {
            if(userId!=null&&!userId.equals("")){
                /*判断用户输入的密码是否正确*/
                Map<String,Object> sureSign = publicMethod.sureStudentSign(userId,signPassword);
                String isTrue = (String) sureSign.get("status");
                if("1".equals(isTrue)){
                    //密码正确，向数据库审核表中添加信息
                    //添加确认密码后返回的签字信息
                    Signinfo signinfo = (Signinfo)sureSign.get("signInfo");
                    map.put("signUrl",signinfo.getNowname());
                    Boolean b = signService.addfudaoyuanSign(map);
                    if(b){
                        resultMap.put("status",1);
                        resultMap.put("info","签名成功");
                    }else{
                        resultMap.put("status",4);
                        resultMap.put("info","签名失败");
                    }
                }if("0".equals(isTrue)){
                    resultMap.put("status",0);
                    resultMap.put("info","签名秘密错误，请重新输入。");
                }if("2".equals(isTrue)){
                    resultMap.put("status",2);
                    resultMap.put("info","未上传签名，请到...上传签名。");
                }
            }else {
                resultMap.put("status",3);
                resultMap.put("info","请重新登录");
            }
        } catch (SQLException e) {
            logger.error("签字出错，数据库异常",e);
        }
        return resultMap;
    }
}
