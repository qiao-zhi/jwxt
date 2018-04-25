package cn.xm.jwxt.mapper.graduateDesign.custom;

import cn.xm.jwxt.bean.graduateDesign.Cencheckarrangeinfo;
import cn.xm.jwxt.bean.graduateDesign.CencheckarrangeinfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 中期检查安排表和其他表关系（外联中期和后期毕设答辩检查小组和毕设中期检查结果表和中期检查基本信息表）
 * 先生成中期检查安排表，然后和中期检查基本表连接
 * 进行分配，和中期检查小组表连接
 * 最后和中期检查结果表连接
 *
 * 此表没有外键
 */
public interface CencheckarrangeinfoCustomMapper {

}