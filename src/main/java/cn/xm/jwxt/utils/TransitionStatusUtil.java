package cn.xm.jwxt.utils;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

public class TransitionStatusUtil {
    public static Map<String,String> checkTransition(String status) {
        Map<String, String> resultMap = new HashMap<String, String>();
        resultMap.put("status1", "null");
        resultMap.put("result1", "null");
        //将字符类型转换为数字
        int num = Integer.parseInt(status);
        switch (num) {
            case 00:
                break;
            case 01:
                resultMap.put("status1", "待审核");
                resultMap.put("result1", "null");
                break;
            case 10:
                resultMap.put("status1", "指导教师已审核");
                resultMap.put("result1", "不通过");
                break;
            case 11:
                resultMap.put("status1", "指导教师已审核，下级辅导员");
                resultMap.put("result1", "通过");
                break;
            case 20:
                resultMap.put("status1", "辅导员已审核");
                resultMap.put("result1", "不通过");
                break;
            case 21:
                resultMap.put("status1", "辅导员已审核，下级教研室主任");
                resultMap.put("result1", "通过");
                break;
            case 30:
                resultMap.put("status1", "教研室主任已审核");
                resultMap.put("result1", "不通过");
                break;
            case 31:
                resultMap.put("status1", "教研室主任已审核，下级系主任");
                resultMap.put("result1", "通过");
                break;
            case 40:
                resultMap.put("status1", "系主任已审核");
                resultMap.put("result1", "不通过");
                break;
            case 41:
                resultMap.put("status1", "系主任已审核，下级学生工作副书记");
                resultMap.put("result1", "通过");
                break;
            case 50:
                resultMap.put("status1", "学生工作副书记已审核");
                resultMap.put("result1", "不通过");
                break;
            case 51:
                resultMap.put("status1", "学生工作副书记已审核，下级副院长");
                resultMap.put("result1", "通过");
                break;
            case 60:
                resultMap.put("status1", "副院长已审核");
                resultMap.put("result1", "不通过");
                break;
            case 61:
                resultMap.put("status1", "副院长已审核，下级主管院长");
                resultMap.put("result1", "通过");
                break;
            case 70:
                resultMap.put("status1", "主管院长已审核");
                resultMap.put("result1", "不通过");
                break;
            case 71:
                resultMap.put("status1", "主管院长已审核，下级主管书记");
                resultMap.put("result1", "通过");
                break;
            case 80:
                resultMap.put("status1", "主管书记已审核");
                resultMap.put("result1", "不通过");
                break;
            case 81:
                resultMap.put("status1", "主管书记已审核，审核完成");
                resultMap.put("result1", "通过");
                break;

        }
        return resultMap;
    }


}
