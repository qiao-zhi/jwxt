/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TeachergredesigntitleServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/6 13:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Teachergredesigntitle;
import cn.xm.jwxt.bean.graduateDesign.TeachergredesigntitleExample;
import cn.xm.jwxt.mapper.graduateDesign.TeachergredesigntitleMapper;
import cn.xm.jwxt.service.graduateDesign.TeachergredesigntitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachergredesigntitleServiceImpl implements TeachergredesigntitleService {

    @Autowired
    private TeachergredesigntitleMapper teachergredesigntitleMapper;

    @Override
    public int countByExample(TeachergredesigntitleExample example) {
        return teachergredesigntitleMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(TeachergredesigntitleExample example) {
        return teachergredesigntitleMapper.deleteByExample(example)==1;
    }

    @Override
    public boolean deleteByPrimaryKey(String teachertitleid) {
        return teachergredesigntitleMapper.deleteByPrimaryKey(teachertitleid)==1;
    }

    @Override
    public boolean insert(Teachergredesigntitle record) {
        return teachergredesigntitleMapper.insert(record)==1;
    }

    @Override
    public boolean insertSelective(Teachergredesigntitle record) {
        return teachergredesigntitleMapper.insertSelective(record)==1;
    }

    @Override
    public List<Teachergredesigntitle> selectByExample(TeachergredesigntitleExample example) {
        return teachergredesigntitleMapper.selectByExample(example);
    }

    @Override
    public Teachergredesigntitle selectByPrimaryKey(String teachertitleid) {
        return teachergredesigntitleMapper.selectByPrimaryKey(teachertitleid);
    }

    @Override
    public boolean updateByExampleSelective(Teachergredesigntitle record, TeachergredesigntitleExample example) {
        return teachergredesigntitleMapper.updateByExampleSelective(record, example)==1;
    }

    @Override
    public boolean updateByExample(Teachergredesigntitle record, TeachergredesigntitleExample example) {
        return teachergredesigntitleMapper.updateByExample(record, example)==1;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Teachergredesigntitle record) {
        return teachergredesigntitleMapper.updateByPrimaryKeySelective(record)==1;
    }

    @Override
    public boolean updateByPrimaryKey(Teachergredesigntitle record) {
        return teachergredesigntitleMapper.updateByPrimaryKey(record)==1;
    }
}