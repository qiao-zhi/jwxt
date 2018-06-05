package cn.xm.jwxt.service.impl.workLoad;

import cn.xm.jwxt.mapper.workLoad.GrduateDesignWorkLoadMapper;
import cn.xm.jwxt.service.workLoad.GrduateDesignWorkLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.*;

@Service
@SuppressWarnings("all")
public class GrduateDesignWorkLoadServiceImpl implements GrduateDesignWorkLoadService {

    @Autowired
    private GrduateDesignWorkLoadMapper grduateMapper;

    /**
     * 查询毕设工作量
     * @param condition
     * @return
     * @throws SQLException
     */
    @Override
    public List<Map<String, Object>> findGrduateDesignWorkLoad(Map<String, Object> condition) throws SQLException {
        List<Map<String,Object>> list = grduateMapper.findGraduateDesignWork(condition);
        // 获取人数
        for(int i=0;i<list.size();i++){
            String teacherTitleID = (String) list.get(i).get("teacherTitleID");
            String stuNum = grduateMapper.findGraStuNum(teacherTitleID);
            list.get(i).put("stuNum",stuNum);
        }
        Collections.sort(list, new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
                String bxn1 = ((String)o1.get("yearNum")).substring(0,4);
                int intBxn1 = Integer.parseInt(bxn1);
                String bxn2 = ((String)o2.get("yearNum")).substring(0,4);
                int intBxn2 = Integer.parseInt(bxn2);
                int i = intBxn2 - intBxn1;
                if(i==0){
                    String xq1 = (String) o1.get("semesterNum");
                    int intXq1 = Integer.parseInt(xq1);
                    String xq2 = (String) o1.get("semesterNum");
                    int intXq2 = Integer.parseInt(xq2);
                    i = intXq1 - intXq2;
                }
                return i;
            }
        });
        return list;
    }

    /**
     * 查询教师毕设详细信息
     * @param teacherTitleID
     * @return
     * @throws SQLException
     */
    @Override
    public Map<String, Object> findGraDesignDetail(String teacherTitleID) throws SQLException {
        Map<String,Object> map = grduateMapper.findGraDesignDetail(teacherTitleID);
        List<Map<String,Object>> stuList = grduateMapper.findGraStu(teacherTitleID);
        map.put("stuList",stuList);
        return map;
    }
}
