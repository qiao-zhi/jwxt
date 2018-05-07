package cn.xm.jwxt.bean.courseDesign;

import java.util.List;

/**
 * 接收课设安排信息
 */
public class ListVo {

    List<TCourseDesignVo> TCourseDesignVos;

    public List<TCourseDesignVo> getTCourseDesignVos() {
        return TCourseDesignVos;
    }

    public void setTCourseDesignVos(List<TCourseDesignVo> TCourseDesignVos) {
        this.TCourseDesignVos = TCourseDesignVos;
    }
}
