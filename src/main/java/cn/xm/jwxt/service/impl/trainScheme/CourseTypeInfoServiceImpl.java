package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.Coursetypeinfo;
import cn.xm.jwxt.bean.trainScheme.CoursetypeinfoExample;
import cn.xm.jwxt.mapper.trainScheme.CoursetypeinfoMapper;
import cn.xm.jwxt.mapper.trainScheme.custom.CoursetypeinfoCustomMapper;
import cn.xm.jwxt.service.trainScheme.CourseTypeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:39 2018/4/24
 */
@Service
public class CourseTypeInfoServiceImpl implements CourseTypeInfoService {
    @Autowired
    private CoursetypeinfoMapper coursetypeinfoMapper;
    @Autowired
    private CoursetypeinfoCustomMapper coursetypeinfoCustomMapper;

    @Override
    public String getNextTypeNumByUpNum(String upTypNum,String trainSchemeId) throws SQLException {
        String maxTypeId = coursetypeinfoCustomMapper.getMaxTypeNumByUpNum(upTypNum,trainSchemeId);
        String typeId = null;
        if("0".equals(maxTypeId)){//不存在的话是当前字典编号+000
            typeId = upTypNum.toString()+"000";
        }else{
            typeId = String.valueOf(Integer.valueOf(maxTypeId)+1);//存在的话最大编号加1
        }
        return typeId;
    }

    @Override
    public boolean addcourseTypeInfo(Coursetypeinfo coursetypeinfo) throws SQLException {
        //1.获取应该插入的num
        String nextTypeNumByUpNum = this.getNextTypeNumByUpNum(coursetypeinfo.getUptypenum(), coursetypeinfo.getTrainingschemeid());
        coursetypeinfo.setTypenum(nextTypeNumByUpNum);
        //调用mapper保存数据库
        return coursetypeinfoMapper.insert(coursetypeinfo)>0?true:false;
    }

    @Override
    public boolean deleteCourseTypeInfoById(int courseId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCourseTypeInfoById(Coursetypeinfo coursetypeinfo) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCurseTypeNameByTypeNumAndTrainSchemeId(String trainSchemeId, String typeNum, String typeName) throws SQLException {
        return coursetypeinfoCustomMapper.updateCurseTypeNameByTypeNumAndTrainSchemeId(trainSchemeId,typeNum,typeName)>0?true:false;
    }

    @Override
    public List<Map<String, Object>> getCourseInfosByCourseTypeId(String coursetypeinfoID) throws SQLException {
        return null;
    }

    @Override
    public List<Coursetypeinfo> getTypeTreeByTrainSchemeId(String trainSchemeId) throws SQLException {
        CoursetypeinfoExample example = new CoursetypeinfoExample();
        CoursetypeinfoExample.Criteria criteria = example.createCriteria();
        criteria.andTrainingschemeidEqualTo(trainSchemeId);
        List<Coursetypeinfo> coursetypeinfos = coursetypeinfoMapper.selectByExample(example);
        return coursetypeinfos;
    }
}
