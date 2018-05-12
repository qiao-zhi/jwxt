/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TeachertitlecheckinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/6 13:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.TeachertitleFirstcheckinfo;
import cn.xm.jwxt.bean.graduateDesign.TeachertitlecheckinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.TeachertitlecheckinfoMapper;
import cn.xm.jwxt.service.graduateDesign.TeachertitlecheckinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachertitlecheckinfoServiceImpl implements TeachertitlecheckinfoService {

    @Autowired
    private TeachertitlecheckinfoMapper teachertitlecheckinfoMapper;

    @Override
    public int countByExample(TeachertitlecheckinfoExample example) {
        return teachertitlecheckinfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(TeachertitlecheckinfoExample example) {
        return teachertitlecheckinfoMapper.deleteByExample(example)==1;
    }

    @Override
    public boolean deleteByPrimaryKey(String checkid) {
        return teachertitlecheckinfoMapper.deleteByPrimaryKey(checkid)==1;
    }

    @Override
    public boolean insert(TeachertitleFirstcheckinfo record) {
        return teachertitlecheckinfoMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(TeachertitleFirstcheckinfo record) {
        return teachertitlecheckinfoMapper.insertSelective(record)==1;
    }

    @Override
    public List<TeachertitleFirstcheckinfo> selectByExample(TeachertitlecheckinfoExample example) {
        return teachertitlecheckinfoMapper.selectByExample(example);
    }

    @Override
    public TeachertitleFirstcheckinfo selectByPrimaryKey(String checkid) {
        return teachertitlecheckinfoMapper.selectByPrimaryKey(checkid);
    }

    @Override
    public boolean updateByExampleSelective(TeachertitleFirstcheckinfo record, TeachertitlecheckinfoExample example) {
        return teachertitlecheckinfoMapper.updateByExampleSelective(record, example)==1;
    }

    @Override
    public boolean updateByExample(TeachertitleFirstcheckinfo record, TeachertitlecheckinfoExample example) {
        return teachertitlecheckinfoMapper.updateByExample(record, example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(TeachertitleFirstcheckinfo record) {
        return teachertitlecheckinfoMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(TeachertitleFirstcheckinfo record) {
        return teachertitlecheckinfoMapper.updateByPrimaryKey(record)==1;
    }
}