package cn.xm.jwxt.mapper.trainScheme.custom;

import cn.xm.jwxt.bean.trainScheme.Coursetypeinfo;
import cn.xm.jwxt.bean.trainScheme.CoursetypeinfoExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.sql.SQLException;
import java.util.List;

public interface CoursetypeinfoCustomMapper {

    /**
     * 根据培养方案编号和上级类别编号查询下次插入的编号
     * @param upTypNum  上级编号
     * @param trainSchemeId 培养方案编号
     * @return  最大的编号
     * @throws SQLException
     */
    @Select("SELECT  IFNULL(MAX(typeNum),'0') FROM coursetypeinfo WHERE upTypeNum = #{upTypNum} and trainingSchemeID=#{trainSchemeId}")
    public String getMaxTypeNumByUpNum(@Param("upTypNum")String upTypNum,@Param("trainSchemeId") String trainSchemeId)throws SQLException;

    /**
     * 根据类别编号与培养方案编号修改类别名称
     * @param typeNum   类别编号
     * @param typeName  类别名称
     * @return  影响的行数
     * @throws SQLException
     */
    @Update("UPDATE coursetypeinfo SET typeName=#{typeName} WHERE typeNum=#{typeNum} AND trainingSchemeID=#{trainSchemeId}")
    public int updateCurseTypeNameByTypeNumAndTrainSchemeId(@Param("trainSchemeId") String trainSchemeId,@Param("typeNum")String typeNum,@Param("typeName") String typeName)throws  SQLException;

}