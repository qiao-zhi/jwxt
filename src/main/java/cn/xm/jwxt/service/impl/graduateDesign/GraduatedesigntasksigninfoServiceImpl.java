/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GraduatedesigntasksigninfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/5 19:25
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Graduatedesigntasksigninfo;
import cn.xm.jwxt.bean.graduateDesign.GraduatedesigntasksigninfoExample;
import cn.xm.jwxt.mapper.graduateDesign.GraduatedesigntasksigninfoMapper;
import cn.xm.jwxt.service.graduateDesign.GraduatedesigntasksigninfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraduatedesigntasksigninfoServiceImpl implements GraduatedesigntasksigninfoService {

    @Autowired
    private GraduatedesigntasksigninfoMapper graduatedesigntasksigninfoMapper;

    @Override
    public int countByExample(GraduatedesigntasksigninfoExample example) {
        return graduatedesigntasksigninfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(GraduatedesigntasksigninfoExample example) {
        return graduatedesigntasksigninfoMapper.deleteByExample(example)==1?true:false;
    }

    @Override
    public boolean deleteByPrimaryKey(String gratasksignid) {
        return graduatedesigntasksigninfoMapper.deleteByPrimaryKey(gratasksignid)==1?true:false;
    }

    @Override
    public boolean insert(Graduatedesigntasksigninfo record) {
        return graduatedesigntasksigninfoMapper.insert(record)==1?true:false;
    }

    @Override
    public boolean insertSelective(Graduatedesigntasksigninfo record) {
        return graduatedesigntasksigninfoMapper.insertSelective(record)==1?true:false;
    }

    @Override
    public List<Graduatedesigntasksigninfo> selectByExample(GraduatedesigntasksigninfoExample example) {
        return graduatedesigntasksigninfoMapper.selectByExample(example);
    }

    @Override
    public Graduatedesigntasksigninfo selectByPrimaryKey(String gratasksignid) {
        return graduatedesigntasksigninfoMapper.selectByPrimaryKey(gratasksignid);
    }

    @Override
    public boolean updateByExampleSelective(Graduatedesigntasksigninfo record, GraduatedesigntasksigninfoExample example) {
        return graduatedesigntasksigninfoMapper.updateByExampleSelective(record, example)==1?true:false;
    }

    @Override
    public boolean updateByExample(Graduatedesigntasksigninfo record, GraduatedesigntasksigninfoExample example) {
        return graduatedesigntasksigninfoMapper.updateByExample(record, example)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Graduatedesigntasksigninfo record) {
        return graduatedesigntasksigninfoMapper.updateByPrimaryKeySelective(record)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKey(Graduatedesigntasksigninfo record) {
        return graduatedesigntasksigninfoMapper.updateByPrimaryKey(record)==1?true:false;
    }
}