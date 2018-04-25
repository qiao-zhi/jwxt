/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GradesigncheckgroupServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/5 18:59
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Gradesigncheckgroup;
import cn.xm.jwxt.bean.graduateDesign.GradesigncheckgroupExample;
import cn.xm.jwxt.mapper.graduateDesign.GradesigncheckgroupMapper;
import cn.xm.jwxt.service.graduateDesign.GradesigncheckgroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradesigncheckgroupServiceImpl implements GradesigncheckgroupService {

    @Autowired
    private GradesigncheckgroupMapper gradesigncheckgroupMapper;

    @Override
    public int countByExample(GradesigncheckgroupExample example) {
        return gradesigncheckgroupMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(GradesigncheckgroupExample example) {
        return gradesigncheckgroupMapper.deleteByExample(example)==1;
    }

    @Override
    public boolean deleteByPrimaryKey(String groupid) {
        return gradesigncheckgroupMapper.deleteByPrimaryKey(groupid)==1;
    }

    @Override
    public boolean insert(Gradesigncheckgroup record) {
        return gradesigncheckgroupMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(Gradesigncheckgroup record) {
        return gradesigncheckgroupMapper.insertSelective(record)==1;
    }

    @Override
    public List<Gradesigncheckgroup> selectByExample(GradesigncheckgroupExample example) {
        return gradesigncheckgroupMapper.selectByExample(example);
    }

    @Override
    public Gradesigncheckgroup selectByPrimaryKey(String groupid) {
        return gradesigncheckgroupMapper.selectByPrimaryKey(groupid);
    }

    @Override
    public boolean updateByExampleSelective(Gradesigncheckgroup record, GradesigncheckgroupExample example) {
        return gradesigncheckgroupMapper.updateByExampleSelective(record, example)==1;
    }

    @Override
    public boolean updateByExample(Gradesigncheckgroup record, GradesigncheckgroupExample example) {
        return gradesigncheckgroupMapper.updateByExample(record, example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Gradesigncheckgroup record) {
        return gradesigncheckgroupMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(Gradesigncheckgroup record) {
        return gradesigncheckgroupMapper.updateByPrimaryKey(record)==1;
    }
}