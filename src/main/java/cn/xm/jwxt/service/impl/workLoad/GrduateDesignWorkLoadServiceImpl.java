package cn.xm.jwxt.service.impl.workLoad;

import cn.xm.jwxt.mapper.workLoad.GrduateDesignWorkLoadMapper;
import cn.xm.jwxt.service.workLoad.GrduateDesignWorkLoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
