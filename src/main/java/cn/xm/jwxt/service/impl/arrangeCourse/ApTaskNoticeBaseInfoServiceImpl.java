package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeBaseInfo;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeBaseInfoExample;
import cn.xm.jwxt.mapper.arrangeCourse.ApTaskNoticeBaseInfoMapper;
import cn.xm.jwxt.mapper.arrangeCourse.custom.ApTaskNoticeBaseInfoCustomMapper;
import cn.xm.jwxt.service.arrangeCourse.ApTaskNoticeBaseInfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.xml.bind.annotation.XmlType;
import java.util.List;
import java.util.Map;

/**
 * 项目名称：jwxt
 * 类描述：教学任务通知书基本信息的Service实现类
 * 创建人：LL
 * 创建时间：2018/4/25 16:20
 */
@Service
@Transactional
public class ApTaskNoticeBaseInfoServiceImpl implements ApTaskNoticeBaseInfoService {

    @Resource
    private ApTaskNoticeBaseInfoMapper taskNoticeBaseInfoMapper;
    @Resource
    private ApTaskNoticeBaseInfoCustomMapper taskNoticeBaseInfoCustomMapper;
    /**
     * 添加教学任务通知书基本信息
     *
     * @param noticeBaseInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean addApTaskNoticeBaseInfo(ApTaskNoticeBaseInfo noticeBaseInfo) throws Exception {
        int count = taskNoticeBaseInfoMapper.insertSelective(noticeBaseInfo);
        return count>0?true:false;
    }

    /**
     * 根据任务通知书ID修改教学任务通知书基本信息
     *
     * @param noticeBookId
     * @param noticeBaseInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean updateApTaskNoticeBaseInfoById(String noticeBookId, ApTaskNoticeBaseInfo noticeBaseInfo) throws Exception {
        if(ValidateCheck.isNull(noticeBookId)){
            throw new IllegalArgumentException("通知书编号不能为空!");
        }
        //设置通知书编号
        noticeBaseInfo.setNoticeBookId(noticeBookId);
        int count = taskNoticeBaseInfoMapper.updateByPrimaryKey(noticeBaseInfo);
        return count>0?true:false;
    }

    /**
     * 根据任务通知书ID删除教学任务通知书
     * 修改是否删除字段 0 表示删除 1 表示未删除
     * 需要修改教学任务通知书和排课任务表的是否删除字段
     *
     * @param noticeBookId
     * @return
     * @throws Exception
     */
    @Override
    public boolean deleteApTaskNoticeBaseInfoById(String noticeBookId) throws Exception {
        if(ValidateCheck.isNull(noticeBookId)){
            throw new IllegalArgumentException("通知书编号不能为空!");
        }
        int count = taskNoticeBaseInfoCustomMapper.updateIsDeleteById(noticeBookId, DefaultValue.IS_NOT_USE);
        return count>0?true:false;
    }

    /**
     * 组合条件查询任务通知书基本信息分页显示
     * 过滤掉删除标记为0的通知书信息
     *
     * @param condition
     * @return
     * @throws Exception
     */
    @Override
    public List<ApTaskNoticeBaseInfo> findApTaskNoticeBaseInfoByCondition(Map condition,Integer currentPage,Integer pageSize) throws Exception {

        return null;
    }
}
