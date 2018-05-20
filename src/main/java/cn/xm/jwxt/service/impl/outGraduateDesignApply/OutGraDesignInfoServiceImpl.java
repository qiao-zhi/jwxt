package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.bean.graduateDesign.Studenttitleresult;
import cn.xm.jwxt.bean.graduateDesign.StudenttitleresultExample;
import cn.xm.jwxt.bean.outGraduateDesignApply.Checkoutgradesigninfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesigninfo;
import cn.xm.jwxt.bean.outGraduateDesignApply.OutgradesigninfoExample;
import cn.xm.jwxt.mapper.graduateDesign.StudenttitleresultMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.OutgradesigninfoMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.RelationOGDInfoCustomMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.Outgradesigninfoservice;
import cn.xm.jwxt.utils.DateHandler;
import cn.xm.jwxt.utils.FileHandleUtil;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@SuppressWarnings("all")
@Transactional
public class OutGraDesignInfoServiceImpl implements Outgradesigninfoservice {
    @Autowired
    private RelationOGDInfoCustomMapper rOGDInfoMapper;
    @Autowired
    private OutgradesigninfoMapper oGDInfoMapper;


    @Override
    public boolean selectIsOutByStudentID(String studentID) throws SQLException {
        return false;
    }

    @Override
    public Outgradesigninfo selectInfoByOutsideApplyID(String outsideApplyID) throws SQLException {
        Outgradesigninfo oGDInfo = rOGDInfoMapper.selectInfoByOutsideApplyID(outsideApplyID);
        /*对数据进行转换：日期，签字图片路径封装*/
        //获取签名图片的访问路径
        String path = FileHandleUtil.getValue("path","signPicturePath");
        String name = oGDInfo.getStusignurl();
        if(name!= null&&!name.equals("")){
            oGDInfo.setStusignurl(path+name);
        }
        List<Checkoutgradesigninfo> checkinfos = oGDInfo.getCheckOGDInfo();
        for(Checkoutgradesigninfo checkinfo:checkinfos){
            if(checkinfo.getTeachersign()!=null&&!checkinfo.getTeachersign().equals("")){
                checkinfo.setTeachersign(path+checkinfo.getTeachersign());
            }
        }
        return oGDInfo;
    }

    @Override
    public boolean updateInfo(Outgradesigninfo outgraDesignInfo) throws SQLException {
        int resultNum = oGDInfoMapper.updateByPrimaryKeySelective(outgraDesignInfo);
        if(resultNum==1){
            //删除基本信息中的审核信息
            rOGDInfoMapper.deleteCheckInfoByOutsideApplyID(outgraDesignInfo.getOutsideapplyid());
            return true;
        }
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

    /**
     * 从签字表中查出签字名称保存到申请基本信息表中
     * @param outsideAppplyInfoID
     * @param fileurl
     * @return
     * @throws SQLException
     */
    @Override
    public boolean saveStudentSign(String outsideAppplyInfoID,String fileurl) throws SQLException {
        Outgradesigninfo baseInfo = new Outgradesigninfo();
        baseInfo.setOutsideapplyid(outsideAppplyInfoID);
        baseInfo.setStusignurl(fileurl);
        //获取当前系统时间，并保存
        Date date = new Date();
        baseInfo.setApplydate(date);
        int num = oGDInfoMapper.updateByPrimaryKeySelective(baseInfo);
        if(num == 1){
            return true;
        }
        return false;
    }
}
