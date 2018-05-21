package cn.xm.jwxt.service.baseInfo;


import cn.xm.jwxt.bean.baseInfo.Signinfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：教师老师签名图片信息的Service接口
 * 创建人：bqq
 * 创建时间：2018/5/4
 */

public interface SigninfoService {

    /**
     * 添加教师老师签名图片信息
     *
     * @throws Exception
     */
    boolean addSignInfo(Signinfo signinfo) throws Exception;

    /**
     * 根据任务通知书ID修改教师老师签名图片信息
     *
     * @return
     * @throws Exception
     */
    boolean updateSignInfoById(String signId, Signinfo signinfo) throws Exception;

    /**
     * 根据签名ID删除签名图片
     *
     * @return
     * @throws Exception
     */
    boolean deleteSignInfoById(String signId) throws Exception;

    /**
     * 根据教签名ID查询教师老师签名图片信息
     *
     * @return
     * @throws Exception
     */
    Signinfo getSignInfoById(String signId) throws Exception;

    /**
     * 组合条件查询教师老师签名图片信息分页显示
     *
     * @param condition
     * @param currentPage
     * @param pageSize
     * @return
     * @throws Exception
     */
    PageInfo<Signinfo> findSignInfoByCondition(CommonQuery condition, Integer currentPage, Integer pageSize) throws Exception;


}