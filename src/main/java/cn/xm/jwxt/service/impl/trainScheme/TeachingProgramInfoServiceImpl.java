package cn.xm.jwxt.service.impl.trainScheme;

import cn.xm.jwxt.bean.trainScheme.TTeachingprogramInfo;
import cn.xm.jwxt.bean.trainScheme.TTeachingprogramInfoExample;
import cn.xm.jwxt.mapper.trainScheme.TTeachingprogramInfoMapper;
import cn.xm.jwxt.service.trainScheme.TeachingProgramInfoService;
import cn.xm.jwxt.utils.FileHandleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: qlq
 * @Description
 * @Date: 10:39 2018/4/24
 */
@Service
public class TeachingProgramInfoServiceImpl implements TeachingProgramInfoService {
    @Autowired
    private TTeachingprogramInfoMapper tTeachingprogramInfoMapper;

    @Override
    public boolean addTeachingProgramInfo(TTeachingprogramInfo teachingprogramInfo) throws SQLException {
        return tTeachingprogramInfoMapper.insert(teachingprogramInfo)>0?true:false;
    }

    @Override
    public boolean deleteTeachingProgramInfoById(int teachingprogramInfoId) throws SQLException {

        //1.删除数据库信息(由于删除磁盘需要用到文件的名字所以需要首先查出来记录文件名称)
        TTeachingprogramInfo tTeachingprogramInfo = tTeachingprogramInfoMapper.selectByPrimaryKey(teachingprogramInfoId);
        boolean result = tTeachingprogramInfoMapper.deleteByPrimaryKey(teachingprogramInfoId)>0?true:false;
        //2.删除磁盘文件
        FileHandleUtil.deleteWordOrPdfFile("teachingFile",tTeachingprogramInfo.getFilenowname());
        return result;
    }

    @Override
    public boolean deleteTeachingProgramInfoByCourseId(String courseId) throws SQLException {
        return false;
    }

    @Override
    public boolean updateTeachingProgramInfo(int teachingprogramInfoId, TTeachingprogramInfo teachingprogramInfo) throws SQLException {
        return false;
    }

    @Override
    public List<TTeachingprogramInfo> getTeachingProgramInfoByCourseId(String courseId) throws SQLException {
        TTeachingprogramInfoExample teachingprogramInfoExample = new TTeachingprogramInfoExample();
        TTeachingprogramInfoExample.Criteria criteria = teachingprogramInfoExample.createCriteria();
        criteria.andCourseidEqualTo(courseId);
        return tTeachingprogramInfoMapper.selectByExample(teachingprogramInfoExample);//根据课程编号查询课程教学资料
    }
}
