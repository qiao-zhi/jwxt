package cn.xm.jwxt.service.impl.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeBaseInfo;
import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeBaseInfoExample;
import cn.xm.jwxt.bean.arrangeCourse.custom.CommonQueryVo;
import cn.xm.jwxt.mapper.arrangeCourse.ApTaskNoticeBaseInfoMapper;
import cn.xm.jwxt.mapper.arrangeCourse.custom.ApArrangeCourseTaskCustomMapper;
import cn.xm.jwxt.mapper.arrangeCourse.custom.ApTaskNoticeBaseInfoCustomMapper;
import cn.xm.jwxt.service.arrangeCourse.ApTaskNoticeBaseInfoService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.font.TrueTypeFont;

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
    @Resource
    private ApArrangeCourseTaskCustomMapper arrangeCourseTaskCustomMapper;
    /**
     * 添加教学任务通知书基本信息
     *
     * @param noticeBaseInfo
     * @return
     * @throws Exception
     */
    @Override
    public boolean addApTaskNoticeBaseInfo(ApTaskNoticeBaseInfo noticeBaseInfo) throws Exception {
        if(noticeBaseInfo==null){
            throw new IllegalArgumentException("通知书基本信息不能为空!");
        }
        //设置主键
        noticeBaseInfo.setNoticeBookId(UUIDUtil.getUUID2());
        //是否删除字段默认使用
        noticeBaseInfo.setIsDelete(DefaultValue.IS_USE);
        //默认未导入文件
        noticeBaseInfo.setIsInput(DefaultValue.IS_NOT_USE);
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
        if(noticeBaseInfo==null){
            throw new IllegalArgumentException("通知书基本信息不能为空!");
        }
        //设置通知书编号
        noticeBaseInfo.setNoticeBookId(noticeBookId);
        int count = taskNoticeBaseInfoMapper.updateByPrimaryKeySelective(noticeBaseInfo);
        return count>0?true:false;
    }

    /**
     * 根据通知书ID修改是否导入状态为导入状态
     * @param noticeBookId
     * @return
     * @throws Exception
     */
    @Override
    public boolean updateIsInputStatus(String noticeBookId) throws Exception {
        if(ValidateCheck.isNull(noticeBookId)){
            throw new IllegalArgumentException("通知书编号不能为空!");
        }
        int count = taskNoticeBaseInfoCustomMapper.updateIsImportById(noticeBookId, DefaultValue.IS_USE);
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
        //如果有排课任务修改排课任务是否删除字段
        arrangeCourseTaskCustomMapper.updateIsDeleteByNoticeBookId(noticeBookId,DefaultValue.IS_NOT_USE);
        return count>0?true:false;
    }

    /**
     * 根据教学任务通知书ID查询通知书基本信息
     *
     * @param noticeBookId
     * @return
     * @throws Exception
     */
    @Override
    public ApTaskNoticeBaseInfo getApTaskNoticeBaseInfoById(String noticeBookId) throws Exception {
        if(ValidateCheck.isNull(noticeBookId)){
            throw new IllegalArgumentException("通知书编号不能为空!");
        }
        ApTaskNoticeBaseInfo taskNoticeBaseInfo = taskNoticeBaseInfoMapper.selectByPrimaryKey(noticeBookId);
        return taskNoticeBaseInfo;
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
    public PageInfo<ApTaskNoticeBaseInfo> findApTaskNoticeBaseInfoByCondition(CommonQueryVo condition, Integer currentPage, Integer pageSize) throws Exception {
        if(currentPage==null||pageSize==null){
            throw new IllegalArgumentException("分页参数传递错误！");
        }
        if(condition==null){
            throw new IllegalArgumentException("查询条件参数传递错误!");
        }
        //采用PageHelper插件进行分页
        PageHelper.startPage(currentPage,pageSize,"create_time DESC");
        List<ApTaskNoticeBaseInfo> listInfo = taskNoticeBaseInfoCustomMapper.findTaskNoticeInfoListByCondition(condition);
        PageInfo<ApTaskNoticeBaseInfo> pageInfo = new PageInfo<ApTaskNoticeBaseInfo>(listInfo);
        return pageInfo;
    }

    /**
     * 查询教学任务通知书的名称和ID
     * @return
     * @throws Exception
     */
    @Override
    public List<Map<String, Object>> findNoticeNameAndId() throws Exception {
        return taskNoticeBaseInfoCustomMapper.findNoticeNameAndId();
    }

    /**
     * 查询学院的名称、ID和编号
     * @return
     * @throws Exception
     */
    @Override
    public List<Map<String, Object>> findAllCollegeInfo() throws Exception {
        return taskNoticeBaseInfoCustomMapper.findAllCollegeInfo();
    }
}
