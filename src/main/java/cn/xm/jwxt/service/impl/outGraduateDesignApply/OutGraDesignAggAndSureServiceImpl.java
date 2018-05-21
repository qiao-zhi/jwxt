package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outgradesignsurebook;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outsidegradesignagreemen;
import cn.xm.jwxt.mapper.outGraduateDesignApply.OutgradesignsurebookMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.OutsidegradesignagreemenMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.RelationOGDAggCustomMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.OutGraDesignAggAndSureService;
import cn.xm.jwxt.utils.FileHandleUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
@SuppressWarnings("all")
public class OutGraDesignAggAndSureServiceImpl implements OutGraDesignAggAndSureService {
    @Autowired
    private RelationOGDAggCustomMapper oGDAgrCustomMapper;
    @Autowired
    private OutsidegradesignagreemenMapper oAggMapper;
    @Autowired
    private OutgradesignsurebookMapper oGDSureBookMapper;

    @Override
    public Boolean updateSureBySureID(Outgradesignsurebook outgradesignsurebook) throws SQLException {
        int num = oGDSureBookMapper.updateByPrimaryKeySelective(outgradesignsurebook);
        if(num == 1){
            return true;
        }
        return false;
    }

    @Override
    public Outgradesignsurebook selectBySureID(String sureID) throws SQLException {
        Outgradesignsurebook oGDSureBook = oGDSureBookMapper.selectByPrimaryKey(sureID);
        /*对保证书中的签名凭借访问路径*/
        String path = FileHandleUtil.getValue("path","signPicturePath");
        if(oGDSureBook.getStudentsignurl()!=null&&!oGDSureBook.getStudentsignurl().equals("")){
            oGDSureBook.setStudentsignurl(path+oGDSureBook.getStudentsignurl());
        }
        return oGDSureBook;
    }

    @Override
    public Outsidegradesignagreemen selectByID(String agreementID) throws SQLException {
        Outsidegradesignagreemen oGDAgreement = oGDAgrCustomMapper.selectAllAggreementByAID(agreementID);
        /*对学生学校签字路径进行封装*/
        String path = FileHandleUtil.getValue("path","signPicturePath");
        if(oGDAgreement.getStudentsign()!=null&&!oGDAgreement.getStudentsign().equals("")){
            oGDAgreement.setStudentsign(path+oGDAgreement.getStudentsign());
        }
        if(oGDAgreement.getSchoolsign()!=null&&!oGDAgreement.getSchoolsign().equals("")){
            oGDAgreement.setSchoolsign(path+oGDAgreement.getSchoolsign());
        }
        return oGDAgreement;
    }

    @Override
    public boolean updateOGDAgreementById(Outsidegradesignagreemen oGDAgreement) throws SQLException {
        //初始化学校签名
        oGDAgreement.setSchoolsign("");
        int num = oAggMapper.updateByPrimaryKeySelective(oGDAgreement);
        if(num == 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteOGDAgreement(String outsideApplyID) throws SQLException {
        return false;
    }
}
