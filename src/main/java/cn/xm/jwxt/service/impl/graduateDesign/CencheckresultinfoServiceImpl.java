/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CencheckresultinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/3 22:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckresultinfo;
import cn.xm.jwxt.bean.graduateDesign.CencheckresultinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.CencheckresultinfoMapper;
import cn.xm.jwxt.service.graduateDesign.CencheckresultinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CencheckresultinfoServiceImpl implements CencheckresultinfoService {

    @Autowired
    private CencheckresultinfoMapper cencheckresultinfoMapper;

    @Override
    public int countByExample(CencheckresultinfoExample example) {
        return cencheckresultinfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(CencheckresultinfoExample example) {
        return cencheckresultinfoMapper.deleteByExample(example)==1;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer centerresultid) {
        return cencheckresultinfoMapper.deleteByPrimaryKey(centerresultid)==1;
    }

    @Override
    public boolean insert(Cencheckresultinfo record) {
        return cencheckresultinfoMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(Cencheckresultinfo record) {
        return cencheckresultinfoMapper.insertSelective(record)==1;
    }

    @Override
    public List<Cencheckresultinfo> selectByExample(CencheckresultinfoExample example) {
        return cencheckresultinfoMapper.selectByExample(example);
    }

    @Override
    public Cencheckresultinfo selectByPrimaryKey(Integer centerresultid) {
        return cencheckresultinfoMapper.selectByPrimaryKey(centerresultid);
    }

    @Override
    public boolean updateByExampleSelective(Cencheckresultinfo record, CencheckresultinfoExample example) {
        return cencheckresultinfoMapper.updateByExampleSelective(record,example)==1;
    }

    @Override
    public boolean updateByExample(Cencheckresultinfo record, CencheckresultinfoExample example) {
        return cencheckresultinfoMapper.updateByExample(record,example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Cencheckresultinfo record) {
        return cencheckresultinfoMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(Cencheckresultinfo record) {
        return cencheckresultinfoMapper.updateByPrimaryKey(record)==1;
    }
}