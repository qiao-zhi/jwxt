package cn.xm.jwxt.controller.system;

import cn.xm.jwxt.bean.system.Logtable;
import cn.xm.jwxt.service.system.LogService;
import cn.xm.jwxt.utils.DefaultValue;
import cn.xm.jwxt.utils.ValidateCheck;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * @Author: qlq
 * @Description
 * @Date: 12:27 2018/5/14
 */
@RestController
@RequestMapping("/log")
public class logtableController {

    private Logger logger = Logger.getLogger(logtableController.class);
    @Autowired
    private LogService logService;

    /**
     * 分页查询日志信息
     * @param condition
     * @return
     */
    @RequestMapping("/getLogsFY")
    public PageInfo<Logtable> getLogsFY(@RequestParam Map condition){
        int pageNum = 1;
        if(ValidateCheck.isNotNull((String) condition.get("pageNum"))){ //如果不为空的话改变当前页号
            pageNum = Integer.parseInt((String) condition.get("pageNum"));
        }
        int pageSize = DefaultValue.PAGE_SIZE;
        if(ValidateCheck.isNotNull((String) condition.get("pageSize"))){ //如果不为空的话改变当前页大小
            pageSize = Integer.parseInt((String) condition.get("pageSize"));
        }
        //开始分页
        PageHelper.startPage(pageNum,pageSize,"operateDate desc");//日期降序排列
        List<Logtable> logs = null;
        try {
            logs =  logService.getLogtableFY(condition);
        } catch (SQLException e) {
            logger.error("分页查询日志出错");
            return null;
        }
        PageInfo<Logtable> pageInfo = new PageInfo<Logtable>(logs);
        return pageInfo;
    }

}
