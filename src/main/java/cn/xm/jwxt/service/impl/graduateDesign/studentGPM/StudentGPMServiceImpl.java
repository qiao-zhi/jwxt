/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CencheckarrangeinfoServiceImpl
 * Author:   xuexiaolei
 * Date:     2018/4/3 20:50
 * Description: 毕设中期检查实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.xm.jwxt.service.impl.graduateDesign.studentGPM;

import cn.xm.jwxt.bean.graduateDesign.*;
import cn.xm.jwxt.mapper.graduateDesign.studentGPM.StudentGPMMapper;
import cn.xm.jwxt.service.graduateDesign.studentGPM.StudentGPMService;
import cn.xm.jwxt.utils.DateHandler;
import cn.xm.jwxt.utils.UUIDUtil;
import cn.xm.jwxt.utils.ValidateCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
@SuppressWarnings("all")
public class StudentGPMServiceImpl implements StudentGPMService {
    @Autowired
    private StudentGPMMapper studentGPMMapper;

    //任务书对象
    private Taskbookinfo taskbookinfo = null;
    //计划进程表对象
    private Graduatetaskprogressinfo graduatetaskprogressinfo = null;

    @Override
    public StudentPDVo getPDInfo(String studentID) throws Exception {
        //根据学生id，查询StudentPDVo
        return studentGPMMapper.selectPDInfo(studentID);
    }

    @Override
    public ProgramTableVo getProgramTable(String studentID) throws Exception {
        //根据学生id，查询进度表信息ProgramTableVo
        return studentGPMMapper.selectProgramTable(studentID);
    }

    @Override
    public boolean saveProgramTable(Graduatetaskprogressinfo progressinfo, String studentID) throws Exception {
        int res = 0;

        //判断是否有进度表，若没有，执行插入
        if (progressinfo.getBookid() != null) {
            //根据学生id，查询结果表，根据结果表，查询任务书id
            String bookid = studentGPMMapper.selectBookIDByStudentID(studentID);
            progressinfo.setBookid(bookid);
            progressinfo.setBookid(UUIDUtil.getUUID2());
            res = studentGPMMapper.insertProgramTable(progressinfo);
        } else { //若有，执行更新，
            res = studentGPMMapper.updateProgramTable(progressinfo);
        }

        return res == 1 ? true : false;
    }

    @Override
    public boolean saveStudentSign(String studentID, String studentName) throws Exception {
        int res = 0;
        /**
         * 获取学生姓名，与签名比较。若相同，签名成功。
         */
        String studentRealName = studentGPMMapper.selectStudentNameByStudentID(studentID);

        if (studentName.trim().equals(studentRealName)) {
            res = studentGPMMapper.updateStudentSign(studentID, 1);
        } else {
            return false;
        }


        return res == 1 ? true : false;
    }

    @Override
    public Teachergredesigntitle getProjectDetailInfo(String studentID) throws Exception {
        return studentGPMMapper.selectProjectDetailInfo(studentID);
    }

    @Override
    public String getProjectChooseState(String studentID) throws Exception {
        //查询毕设学生选题表是否提交
        String isSubmit = isSubmitFromProjectChoose(studentID);
        if(isSubmit == null || isSubmit.equals("")) {
            //查找是否有审核通过的课题(审核状态，学年==今年)
            String yearNum = DateHandler.getCurrentYearNum();

            // 查询课题申请表。
            int nums = studentGPMMapper.selectIsCheckSuccessProject(yearNum);

            if(nums == 0) {
                return "等待教师发布课题";
            }
        } else if (isSubmit.equals("0")){ //保存
            return "请尽快选择课题！";
        } else if (isSubmit.equals("1")) {
            return "";
        }

        return "";
    }

    @Override
    public String getTaskbookSignState(String studentID) throws Exception {
        //查询毕设学生选题表是否提交
        String isSubmit = isSubmitFromProjectChoose(studentID);
        if(!isSubmit.equals("1")) { //判断是否有选择课题的通知
            return "";
        } else {
            //先查询结果表中是否有数据
            Studenttitleresult studenttitleresult = studentGPMMapper.selectTitleResult(studentID);
            if(studenttitleresult == null) {
                return "课题已经选择，等待教师确认";
            } else {
                //判断是否有任务书
                taskbookinfo = studentGPMMapper.selectTaskBook(studenttitleresult.getStudenttitleresultid());
                if (taskbookinfo == null) {
                    String teacherName = studentGPMMapper.selectTeacherName(studenttitleresult.getTeachertitleid());//查询教师课题申请表，获取教师名字
                    return teacherName + "老师已确认，正在填写任务书...";
                } else {
                    if(taskbookinfo.getIsStudentSign().equals("0")) { //学生未签字
                        return "任务书已下发，请尽快查看并签字";
                    }
                }
            }
        }
        return "";
    }

    @Override
    public String getGraduateCheckState(String studentID) throws Exception {
        if (taskbookinfo == null ) {
            return "";
        } else if (taskbookinfo.getIsStudentSign().equals("1")) { //任务书已经签字
            //查询计划进程表
            graduatetaskprogressinfo = studentGPMMapper.selectTaskProgramTable(studentID);
            if(graduatetaskprogressinfo == null) {
                return  "请尽快填写计划进程表";
            } else {
                if (graduatetaskprogressinfo.getFillStatus().equals("0")) {
                    return "请尽快填写计划进程表";
                }
            }
        }
        return "";
    }

    @Override
    public String getMiddleCheckState(String studentID) throws Exception {
        if (graduatetaskprogressinfo == null) {
            return "";
        } else if (graduatetaskprogressinfo.getFillStatus().equals("1")){ //进程表已提交
            //根据任务书id查询中期检查安排表
            Cencheckarrangeinfo cencheckarrangeinfo = studentGPMMapper.selectCencheckarrangeinfoByTaskBookID(taskbookinfo.getBookid());
            if (cencheckarrangeinfo == null) {
                return "毕业设计中旬，将进行中期检查，等待通知！";
            } else {
                //查询中期检查基本信息表，根据他的id
                Cencheckbaseinfo cencheckbaseinfo = studentGPMMapper.selectCencheckbaseinfo(cencheckarrangeinfo.getCencheckinfoid());

                Date starttime = cencheckbaseinfo.getStarttime();
                Date endtime = cencheckbaseinfo.getEndtime();
                Date today = new Date();

                if (today.before(starttime)) {
                    return "毕业设计中旬，将进行中期检查，等待通知！";
                } else if (starttime.before(today) && endtime.after(today)) {
                    //获取答辩地点。
                    String replyAddress = studentGPMMapper.selectReplyAddressByGroupidByGraDesignCheckGroup(cencheckarrangeinfo.getGroupid());
                    return "中期检查时间：" + starttime + "到" + endtime + "，答辩地点：" + replyAddress + "。请做好准备！";
                }
            }
        }
        return "";
    }

    @Override
    public String getProgramTableState(String studentID) throws Exception {
        if (graduatetaskprogressinfo == null) {
            return "";
        } else if (graduatetaskprogressinfo.getFillStatus().equals("1")){ //进程表已提交
            //指导教师id查询毕业答辩安排表
            Pleaarrangeinfo pleaarrangeinfo = studentGPMMapper.selectPleaArrangeInfoByTaskBookID(taskbookinfo.getBookid());
            if (pleaarrangeinfo == null) {
                return "毕业答辩时间地点，请等待通知！";
            } else {
                //查询毕业答辩基本信息表
                Finallypleainfo finallypleainfo = studentGPMMapper.selectFinallyPleaInfo(pleaarrangeinfo.getPleaid());

                Date starttime = finallypleainfo.getStarttime();
                Date endtime = finallypleainfo.getEndtime();
                Date today = new Date();

                if (today.before(starttime)) {
                    return "毕业答辩时间地点，请等待通知！";
                } else if (starttime.before(today) && endtime.after(today)) {
                    //获取答辩地点。
                    String replyAddress = studentGPMMapper.selectReplyAddressByGroupidByGraDesignCheckGroupNew(pleaarrangeinfo.getGroupid());
                    return "毕业答辩时间：" + starttime + "到" + endtime + "，答辩地点：" + replyAddress + "。请做好准备！";
                }
            }
        }
        return "";
    }

    @Override
    public List<FileInfoVo> initFIleInfo(String studentID) throws Exception {
        /**
         * 任务书
         * 计划进程表
         * 中期检查表
         * 论文评审表
         * 考勤表
         * 毕业论文
         */

        List<FileInfoVo> fileInfoVos = new ArrayList<FileInfoVo>();

        FileInfoVo fileInfoVo = new FileInfoVo();

        //任务书
        String bookID = studentGPMMapper.selectTaskbookNum(studentID);
        if (ValidateCheck.isNotNull(bookID)) {
            fileInfoVo.setFileID(bookID);
            fileInfoVo.setFileName("任务书");
            fileInfoVos.add(fileInfoVo);
            //计划进程表
            String progressId = studentGPMMapper.selectProgramtableNum(studentID);
            if (ValidateCheck.isNotNull(progressId)) {
                fileInfoVo.setFileID(progressId);
                fileInfoVo.setFileName("计划进程表");
                fileInfoVos.add(fileInfoVo);
               /* if (ValidateCheck.isNotNull(progressId)) {
                    //中期检查表
                    //xxx调用晓磊的中期检查表
                    String middletable = studentGPMMapper.selectMiddletableNum(studentID);
                    if (ValidateCheck.isNotNull(middletable)) {
                        fileInfoVo.setFileID(middletable);
                        fileInfoVo.setFileName("中期检查表");
                        fileInfoVos.add(fileInfoVo);
                    }
                    //论文评审表
                    //xxx调用晓磊的论文评审表
                    String thesistable = studentGPMMapper.selectThesistableNum(studentID);
                    if (ValidateCheck.isNotNull(thesistable)) {
                        fileInfoVo.setFileID(thesistable);
                        fileInfoVo.setFileName("论文评审表");
                        fileInfoVos.add(fileInfoVo);
                    }
                    //考勤表
                    String attendancetable = studentGPMMapper.selectAttendancetableNum(studentID);
                    if (ValidateCheck.isNotNull(attendancetable)) {
                        fileInfoVo.setFileID(attendancetable);
                        fileInfoVo.setFileName("考勤表");
                        fileInfoVos.add(fileInfoVo);
                    }
                    //毕业论文
                    String thesis = studentGPMMapper.selectThesisNum(studentID);
                    if (ValidateCheck.isNotNull(thesis)) {
                        fileInfoVo.setFileID(thesis);
                        fileInfoVo.setFileName("毕业论文");
                        fileInfoVos.add(fileInfoVo);
                    }
                }*/
            }
        }

        return fileInfoVos;
    }

    @Override
    public String getStudentIDByStudentNum(String studentNum) throws Exception {
        return studentGPMMapper.selectStudentIDByStudentNum(studentNum);
    }


    //查询毕设学生选题表中的是否提交
    public String isSubmitFromProjectChoose(String studentID) throws Exception{
        return studentGPMMapper.selectIsSubmitProjectChoose(studentID);
    }

}