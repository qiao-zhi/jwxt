package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.bean.graduateDesign.Studenttitleresult;
import cn.xm.jwxt.bean.graduateDesign.StudenttitleresultExample;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.OutgradesigninfoExample;
import cn.xm.jwxt.mapper.graduateDesign.StudenttitleresultMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.OutgradesigninfoMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.RelationOGDInfoCustomMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.Outgradesigninfoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

@Service
@SuppressWarnings("all")
@Transactional
public class OutGraDesignInfoServiceImpl implements Outgradesigninfoservice {
    @Autowired
    private RelationOGDInfoCustomMapper rOGDInfoMapper;

    @Override
    public boolean selectIsOutByStudentID(String studentID) throws SQLException {
        return false;
    }

    @Override
    public Outgradesigninfo selectInfoByOutsideApplyID(String outsideApplyID) throws SQLException {
        Outgradesigninfo oGDInfo = rOGDInfoMapper.selectInfoByOutsideApplyID(outsideApplyID);
        /*对数据进行转换：日期，签字图片路径封装*/
        return oGDInfo;
    }

    @Override
    public boolean updateInfo(Outgradesigninfo outgraDesignInfo) throws SQLException {
        return false;
    }

    @Override
    public boolean deleteInfo(String outsideApplyID) throws SQLException {
        return false;
    }

    @Override
    public boolean insertInfo(Outgradesigninfo outgraDesignInfo) throws SQLException {
        return false;
    }
}
