package cn.xm.jwxt.service.impl.outGraduateDesignApply;

import cn.xm.jwxt.bean.outGraduateDesignApply.Outattachmentcontent;
import cn.xm.jwxt.bean.outGraduateDesignApply.Outsidegradesignattachment;
import cn.xm.jwxt.mapper.outGraduateDesignApply.OutattachmentcontentMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.OutsidegradesignattachmentMapper;
import cn.xm.jwxt.mapper.outGraduateDesignApply.custom.RelationOGDAttCustomMapper;
import cn.xm.jwxt.service.outGraduateDesignApply.OutsideGraDesignAttachmentService;
import cn.xm.jwxt.utils.FileHandleUtil;
import cn.xm.jwxt.utils.UUIDUtil;
import com.sun.xml.internal.messaging.saaj.soap.ver1_1.FaultElement1_1Impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@Service
@SuppressWarnings("ALL")
public class OutGraDesignAttServiceImpl implements OutsideGraDesignAttachmentService {
    @Autowired
    private RelationOGDAttCustomMapper rOGDAttachmentCustomMapper;
    @Autowired
    private OutattachmentcontentMapper oAttachmentContentMapper;
    @Autowired
    private OutsidegradesignattachmentMapper oGDAttachmenntMapper;

    @Override
    public Outsidegradesignattachment selectAttachmentByAttID(String attachmentID) throws SQLException {
        Outsidegradesignattachment  oGDAttachment = rOGDAttachmentCustomMapper.selectByAttachmentID(attachmentID);
        //读取附件得访问基本路径
        String path = FileHandleUtil.getValue("path","attachmentRequestPath");
        List<Outattachmentcontent> contents = oGDAttachment.getoGDAttachmentContent();
        for(Outattachmentcontent content:contents){
            content.setContenturl(path + content.getContenturl());
        }
        return oGDAttachment;
    }

    @Override
    public boolean commitAttachment(String attachmentID, String type) throws SQLException {
        Outsidegradesignattachment oGDAttachment = new Outsidegradesignattachment();
        oGDAttachment.setAttachmentid(attachmentID);
        oGDAttachment.setAttachmenttype(type);
        oGDAttachment.setIscommit("01");
        int num = oGDAttachmenntMapper.updateByPrimaryKeySelective(oGDAttachment);
        if(num==1){
            return true;
        }
        return false;
    }

    @Override
    public boolean updateAttachment(String attachmentID,String type) throws SQLException {
        Outsidegradesignattachment oGDAttachment = new Outsidegradesignattachment();
        oGDAttachment.setAttachmentid(attachmentID);
        oGDAttachment.setAttachmenttype(type);
        int num = oGDAttachmenntMapper.updateByPrimaryKeySelective(oGDAttachment);
        if(num==1){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteAttachmentContentbyID(String contentID) throws SQLException {
        /**
         * 根据id查询得到文件的名字，然后把文件从那个文件中删除，再清除数据库
         */
        //获取文件，名称
        String fileName = oAttachmentContentMapper.selectByPrimaryKey(contentID).getContenturl();
        /**
         * 调用工具类FileHandleUtil.deletePlainFile()删除文件中内容
         */
        FileHandleUtil.deletePlainFile("path","attachmentFile",fileName);
        //删除文件中的内容
        int num = oAttachmentContentMapper.deleteByPrimaryKey(contentID);
        if(num==1){
            return true;
        }
        else
            return false;
    }

    @Override
    public boolean addAttachmentContent(String attachmentID, String fileName) throws SQLException {
        /**
         * 封装数据存入数据库中
         */
        Outattachmentcontent oAttachmentContent = new Outattachmentcontent();
        oAttachmentContent.setContentid(UUIDUtil.getUUID2());
        oAttachmentContent.setAttachmentid(attachmentID);
        oAttachmentContent.setContentnum(new Date().toString());
        oAttachmentContent.setContenturl(fileName);
        int num = oAttachmentContentMapper.insertSelective(oAttachmentContent);
        if(num==1){
            return true;
        }
        return false;
    }
}
