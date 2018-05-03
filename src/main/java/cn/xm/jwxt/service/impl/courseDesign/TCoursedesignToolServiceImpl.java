package cn.xm.jwxt.service.impl.courseDesign;

import cn.xm.jwxt.mapper.courseDesign.custom.TCoursedesignToolMapper;
import cn.xm.jwxt.service.courseDesign.TCoursedesignToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TCoursedesignToolServiceImpl implements TCoursedesignToolService {

    @Autowired
    @SuppressWarnings("all")
    private TCoursedesignToolMapper cdToolMapper;

    /**
     * 从数据库获取当前 年
     *
     * @return
     */
    @Override
    public String getNowYear() {
        String nowYear = cdToolMapper.getNowYear();
        return nowYear;
    }

}
