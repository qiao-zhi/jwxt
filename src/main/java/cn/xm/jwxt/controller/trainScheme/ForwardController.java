package cn.xm.jwxt.controller.trainScheme;

import cn.xm.jwxt.utils.DefaultValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: qlq
 * @Description 用于转发页面的Controller(隐藏地址)
 * @Date: 11:08 2018/5/4
 */
@Controller
@RequestMapping("/forward")
public class ForwardController {

    /**
     * 带着培养方案编号转发到查看培养方案详情的页面
     * @return
     */
    @RequestMapping("/2TrainSchemeDatail")
    public String forward2TrainSchemeDetail(@RequestParam(defaultValue = "1") String trainSchemeId, Model model){
        //1.将数据塞进去
        model.addAttribute("trainSchemeId",trainSchemeId);
        //2.跳转到查看详情页面
        return "pages/trainingScheme/trainingScheme-view";
    }

}
