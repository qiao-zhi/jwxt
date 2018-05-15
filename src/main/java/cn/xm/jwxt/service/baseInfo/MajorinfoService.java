package cn.xm.jwxt.service.baseInfo;

import cn.xm.jwxt.bean.baseInfo.TMajorBaseInfo;
import cn.xm.jwxt.bean.baseInfo.custom.CommonQuery;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface MajorinfoService {

    /**
     * 添加专业信息
     * @param majorBaseInfo
     * @return
     * @throws Exception
     */

    boolean addMajorInfo(TMajorBaseInfo majorBaseInfo) throws Exception;

    /*
     * 根据专业ID批量修改专业信息
     */
    boolean updateMajorById(String majorid,TMajorBaseInfo majorBaseInfo) throws Exception;
    /**
     * 根据专业ID删除对应的专业信息
     * @return
     * @throws Exception
     */
    boolean deleteMajorInfoById(String majorid) throws Exception;

    /**
     * 根据专业ID查询专业的所有信息
     * @param majorid
     * @return
     * @throws Exception
     */
    TMajorBaseInfo getMajorInfoById(String majorid) throws Exception;

    PageInfo<TMajorBaseInfo> findMajorInfoByCondition(CommonQuery condition, Integer currentPage, Integer pageSize) throws Exception;

    List<Map<String,Object>> findMajorNameAndId() throws Exception;
}
