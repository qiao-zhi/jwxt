/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GraduatetaskprogressinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/5 19:35
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Graduatetaskprogressinfo;
import cn.xm.jwxt.bean.graduateDesign.GraduatetaskprogressinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.GraduatetaskprogressinfoMapper;
import cn.xm.jwxt.service.graduateDesign.GraduatetaskprogressinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GraduatetaskprogressinfoServiceImpl implements GraduatetaskprogressinfoService {

    @Autowired
    private GraduatetaskprogressinfoMapper graduatetaskprogressinfoMapper;

    @Override
    public int countByExample(GraduatetaskprogressinfoExample example) {
        return graduatetaskprogressinfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(GraduatetaskprogressinfoExample example) {
        return graduatetaskprogressinfoMapper.deleteByExample(example)==1;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer progressid) {
        return graduatetaskprogressinfoMapper.deleteByPrimaryKey(progressid)==1;
    }

    @Override
    public boolean insert(Graduatetaskprogressinfo record) {
        return graduatetaskprogressinfoMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(Graduatetaskprogressinfo record) {
        return graduatetaskprogressinfoMapper.insertSelective(record)==1;
    }

    @Override
    public List<Graduatetaskprogressinfo> selectByExample(GraduatetaskprogressinfoExample example) {
        return graduatetaskprogressinfoMapper.selectByExample(example);
    }

    @Override
    public Graduatetaskprogressinfo selectByPrimaryKey(Integer progressid) {
        return graduatetaskprogressinfoMapper.selectByPrimaryKey(progressid);
    }

    @Override
    public boolean updateByExampleSelective(Graduatetaskprogressinfo record, GraduatetaskprogressinfoExample example) {
        return graduatetaskprogressinfoMapper.updateByExampleSelective(record, example)==1;
    }

    @Override
    public boolean updateByExample(Graduatetaskprogressinfo record, GraduatetaskprogressinfoExample example) {
        return graduatetaskprogressinfoMapper.updateByExample(record, example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Graduatetaskprogressinfo record) {
        return graduatetaskprogressinfoMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(Graduatetaskprogressinfo record) {
        return graduatetaskprogressinfoMapper.updateByPrimaryKey(record)==1;
    }
}