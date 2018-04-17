/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CencheckbaseinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/3 22:24
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Cencheckbaseinfo;
import cn.xm.jwxt.bean.graduateDesign.CencheckbaseinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.CencheckbaseinfoMapper;
import cn.xm.jwxt.service.graduateDesign.CencheckbaseinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CencheckbaseinfoServiceImpl implements CencheckbaseinfoService {

    @Autowired
    private CencheckbaseinfoMapper cencheckbaseinfoMapper;

    @Override
    public int countByExample(CencheckbaseinfoExample example) {
        return cencheckbaseinfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(CencheckbaseinfoExample example) {
        return cencheckbaseinfoMapper.deleteByExample(example)==1?true:false;
    }

    @Override
    public boolean deleteByPrimaryKey(String cencheckinfoid) {
        return cencheckbaseinfoMapper.deleteByPrimaryKey(cencheckinfoid)==1?true:false;
    }

    @Override
    public boolean insert(Cencheckbaseinfo record) {
        return cencheckbaseinfoMapper.insert(record)==1?true:false;
    }

    @Override
    public boolean insertSelective(Cencheckbaseinfo record) {
        return cencheckbaseinfoMapper.insertSelective(record)==1?true:false;
    }

    @Override
    public List<Cencheckbaseinfo> selectByExample(CencheckbaseinfoExample example) {
        return cencheckbaseinfoMapper.selectByExample(example);
    }

    @Override
    public Cencheckbaseinfo selectByPrimaryKey(String cencheckinfoid) {
        return cencheckbaseinfoMapper.selectByPrimaryKey(cencheckinfoid);
    }

    @Override
    public boolean updateByExampleSelective(Cencheckbaseinfo record, CencheckbaseinfoExample example) {
        return cencheckbaseinfoMapper.updateByExampleSelective(record,example)==1?true:false;
    }

    @Override
    public boolean updateByExample(Cencheckbaseinfo record, CencheckbaseinfoExample example) {
        return cencheckbaseinfoMapper.updateByExample(record,example)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Cencheckbaseinfo record) {
        return cencheckbaseinfoMapper.updateByPrimaryKeySelective(record)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKey(Cencheckbaseinfo record) {
        return cencheckbaseinfoMapper.updateByPrimaryKey(record)==1?true:false;
    }
}