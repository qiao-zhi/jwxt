/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TaskbookinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/6 13:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign;

import cn.xm.jwxt.bean.graduateDesign.Taskbookinfo;
import cn.xm.jwxt.bean.graduateDesign.TaskbookinfoExample;
import cn.xm.jwxt.mapper.graduateDesign.TaskbookinfoMapper;
import cn.xm.jwxt.service.graduateDesign.TaskbookinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskbookinfoServiceImpl implements TaskbookinfoService {

    @Autowired
    private TaskbookinfoMapper taskbookinfoMapper;

    @Override
    public int countByExample(TaskbookinfoExample example) {
        return taskbookinfoMapper.countByExample(example);
    }

    @Override
    public boolean deleteByExample(TaskbookinfoExample example) {
        return taskbookinfoMapper.deleteByExample(example)==1?true:false;
    }

    @Override
    public boolean deleteByPrimaryKey(Integer bookid) {
        return taskbookinfoMapper.deleteByPrimaryKey(bookid)==1?true:false;
    }

    @Override
    public boolean insert(Taskbookinfo record) {
        return taskbookinfoMapper.insert(record)==1?true:false;
    }

    @Override
    public boolean insertSelective(Taskbookinfo record) {
        return taskbookinfoMapper.insertSelective(record)==1?true:false;
    }

    @Override
    public List<Taskbookinfo> selectByExample(TaskbookinfoExample example) {
        return taskbookinfoMapper.selectByExample(example);
    }

    @Override
    public Taskbookinfo selectByPrimaryKey(Integer bookid) {
        return taskbookinfoMapper.selectByPrimaryKey(bookid);
    }

    @Override
    public boolean updateByExampleSelective(Taskbookinfo record, TaskbookinfoExample example) {
        return taskbookinfoMapper.updateByExampleSelective(record, example)==1?true:false;
    }

    @Override
    public boolean updateByExample(Taskbookinfo record, TaskbookinfoExample example) {
        return taskbookinfoMapper.updateByExample(record, example)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKeySelective(Taskbookinfo record) {
        return taskbookinfoMapper.updateByPrimaryKeySelective(record)==1?true:false;
    }

    @Override
    public boolean updateByPrimaryKey(Taskbookinfo record) {
        return taskbookinfoMapper.updateByPrimaryKey(record)==1?true:false;
    }
}