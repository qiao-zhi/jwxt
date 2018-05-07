/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: FinallypleainfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/3 23:23
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Finallypleainfo;
import cn.xm.jwxt.bean.graduateDesign.FinallypleainfoExample;
import cn.xm.jwxt.mapper.graduateDesign.FinallypleainfoMapper;
import cn.xm.jwxt.service.graduateDesign.FinallypleainfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinallypleainfoServiceImpl implements FinallypleainfoService {

    @Autowired
    private FinallypleainfoMapper finallypleainfoMapper;

    @Override
    public int countByExample(FinallypleainfoExample example) {
        return finallypleainfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(FinallypleainfoExample example) {
        return finallypleainfoMapper.deleteByExample(example)==1;
    }

    @Override
    public boolean deleteByPrimaryKey(String pleaid) {
        return finallypleainfoMapper.deleteByPrimaryKey(pleaid)==1;
    }

    @Override
    public boolean insert(Finallypleainfo record) {
        return finallypleainfoMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(Finallypleainfo record) {
        return finallypleainfoMapper.insertSelective(record)==1;
    }

    @Override
    public List<Finallypleainfo> selectByExample(FinallypleainfoExample example) {
        return finallypleainfoMapper.selectByExample(example);
    }

    @Override
    public Finallypleainfo selectByPrimaryKey(String pleaid) {
        return finallypleainfoMapper.selectByPrimaryKey(pleaid);
    }

    @Override
    public boolean updateByExampleSelective(Finallypleainfo record, FinallypleainfoExample example) {
        return finallypleainfoMapper.updateByExampleSelective(record, example)==1;
    }

    @Override
    public boolean updateByExample(Finallypleainfo record, FinallypleainfoExample example) {
        return finallypleainfoMapper.updateByExample(record, example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Finallypleainfo record) {
        return finallypleainfoMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(Finallypleainfo record) {
        return finallypleainfoMapper.updateByPrimaryKey(record)==1;
    }
}