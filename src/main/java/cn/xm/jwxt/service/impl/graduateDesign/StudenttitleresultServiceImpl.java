/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: StudenttitleresultServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/6 13:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Studenttitleresult;
import cn.xm.jwxt.bean.graduateDesign.StudenttitleresultExample;
import cn.xm.jwxt.mapper.graduateDesign.StudenttitleresultMapper;
import cn.xm.jwxt.service.graduateDesign.StudenttitleresultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudenttitleresultServiceImpl implements StudenttitleresultService {

    @Autowired
    private StudenttitleresultMapper studenttitleresultMapper;

    @Override
    public int countByExample(StudenttitleresultExample example) {
        return studenttitleresultMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(StudenttitleresultExample example) {
        return studenttitleresultMapper.deleteByExample(example)==1?true:false;
    }

    @Override
    public boolean deleteByPrimaryKey(String studenttitleresultid) {
        return studenttitleresultMapper.deleteByPrimaryKey(studenttitleresultid)==1?true:false;
    }

    @Override
    public boolean insert(Studenttitleresult record) {
        return studenttitleresultMapper.insert(record)==1?true:false;
    }

    @Override
    public boolean insertSelective(Studenttitleresult record) {
        return studenttitleresultMapper.insertSelective(record)==1?true:false;
    }

    @Override
    public List<Studenttitleresult> selectByExample(StudenttitleresultExample example) {
        return studenttitleresultMapper.selectByExample(example);
    }

    @Override
    public Studenttitleresult selectByPrimaryKey(String studenttitleresultid) {
        return studenttitleresultMapper.selectByPrimaryKey(studenttitleresultid);
    }

    @Override
    public boolean updateByExampleSelective(Studenttitleresult record, StudenttitleresultExample example) {
        return studenttitleresultMapper.updateByExampleSelective(record, example)==1?true:false;
    }

    @Override
    public boolean updateByExample(Studenttitleresult record, StudenttitleresultExample example) {
        return studenttitleresultMapper.updateByExample(record, example)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Studenttitleresult record) {
        return studenttitleresultMapper.updateByPrimaryKeySelective(record)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKey(Studenttitleresult record) {
        return studenttitleresultMapper.updateByPrimaryKey(record)==1?true:false;
    }
}