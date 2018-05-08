package cn.xm.jwxt.queryVo;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskArrangeCourse;
import cn.xm.jwxt.bean.trainScheme.Trainningcapacitybaseinfo;

import java.util.List;

/**
 * @Author: qlq
 * @Description 接收list参数的vo
 * @Date: 17:56 2018/5/2
 */
public class ListVo {
    /**
     * 接收培养方案能力集合
     */
    private List<Trainningcapacitybaseinfo> trainningcapacitybaseinfos;

    public List<Trainningcapacitybaseinfo> getTrainningcapacitybaseinfos() {
        return trainningcapacitybaseinfos;
    }

    public void setTrainningcapacitybaseinfos(List<Trainningcapacitybaseinfo> trainningcapacitybaseinfos) {
        this.trainningcapacitybaseinfos = trainningcapacitybaseinfos;
    }

    /**
     * 排课任务分配课程集合
     */
    private List<ApTaskArrangeCourse> taskArrangeCourses;

    public List<ApTaskArrangeCourse> getTaskArrangeCourses() {
        return taskArrangeCourses;
    }

    public void setTaskArrangeCourses(List<ApTaskArrangeCourse> taskArrangeCourses) {
        this.taskArrangeCourses = taskArrangeCourses;
    }
}
