/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GradeuatebaseinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/5 19:17
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Gradeuatebaseinfo;
import cn.xm.jwxt.bean.graduateDesign.GradeuatebaseinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.GradeuatebaseinfoMapper;
import cn.xm.jwxt.service.graduateDesign.GradeuatebaseinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeuatebaseinfoServiceImpl implements GradeuatebaseinfoService {

    @Autowired
    private GradeuatebaseinfoMapper gradeuatebaseinfoMapper;

    @Override
    public int countByExample(GradeuatebaseinfoExample example) {
        return gradeuatebaseinfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(GradeuatebaseinfoExample example) {
        return gradeuatebaseinfoMapper.deleteByExample(example)==1;
    }

    @Override
    public boolean deleteByPrimaryKey(String gradesignid) {
        return gradeuatebaseinfoMapper.deleteByPrimaryKey(gradesignid)==1;
    }

    @Override
    public boolean insert(Gradeuatebaseinfo record) {
        return gradeuatebaseinfoMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(Gradeuatebaseinfo record) {
        return gradeuatebaseinfoMapper.insertSelective(record)==1;
    }

    @Override
    public List<Gradeuatebaseinfo> selectByExample(GradeuatebaseinfoExample example) {
        return gradeuatebaseinfoMapper.selectByExample(example);
    }

    @Override
    public Gradeuatebaseinfo selectByPrimaryKey(String gradesignid) {
        return gradeuatebaseinfoMapper.selectByPrimaryKey(gradesignid);
    }

    @Override
    public boolean updateByExampleSelective(Gradeuatebaseinfo record, GradeuatebaseinfoExample example) {
        return gradeuatebaseinfoMapper.updateByExampleSelective(record, example)==1;
    }

    @Override
    public boolean updateByExample(Gradeuatebaseinfo record, GradeuatebaseinfoExample example) {
        return gradeuatebaseinfoMapper.updateByExample(record, example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Gradeuatebaseinfo record) {
        return gradeuatebaseinfoMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(Gradeuatebaseinfo record) {
        return gradeuatebaseinfoMapper.updateByPrimaryKey(record)==1;
    }
}