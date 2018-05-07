package cn.xm.jwxt.controller.arrangeCourse;

import cn.xm.jwxt.bean.arrangeCourse.ApTaskNoticeDetailInfo;
import cn.xm.jwxt.utils.ValidateCheck;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 项目名称：jwxt
 * 类描述：读取任务通知书Excel文件中的内容封装到集合中
 * 创建人：LL
 * 创建时间：2018/5/3 9:57
 */
public class ReadNoticeExcelData {
    //文件读取开始行
    public static final int START_ROW = 5;
    //每一行需要读取的单元格总数
    public static final int CELL_SUM = 20;
    /**
     * 读取Excel文件返回通知书明细集合
     * @param fileName
     * @return
     */
    public static List<ApTaskNoticeDetailInfo> readNoticeExcelData(String fileName){
        //工作簿
        Workbook book = null;
        //工作表
        Sheet sheet;
        //单元格
        Cell cell;
        //单元格中的值
        String value;
        //枚举类型
        NoticeDetailEnum detailType;
        //课程信息集合
        List<ApTaskNoticeDetailInfo> listInfo = new ArrayList<ApTaskNoticeDetailInfo>();
        //声明实体类
        ApTaskNoticeDetailInfo detailInfo;
        //班级名称和人数数组
        String[] classNameAndNum;
        //为要读取的excel文件名
        try {
            book = Workbook.getWorkbook(new File(fileName));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
        //获取工作表
        sheet = book.getSheet(0);
        //excel文件从第6行开始读取数据,最后一行不是课程信息
        for (int i = START_ROW,r_length =sheet.getRows()-1 ; i < r_length; i++) {
            //创建实体类
            detailInfo = new ApTaskNoticeDetailInfo();
            for(int j=0; j < CELL_SUM; j++){
                //获取每一行的单元格
                cell = sheet.getCell(j, i);//（列，行）
                value = cell.getContents();
                //如果为空进行下一次循环
                if(ValidateCheck.isNull(value)){
                    continue;
                }
                detailType = NoticeDetailEnum.fromIndex(j);
                switch (detailType){
                    case DATAIL_SORT:
                        detailInfo.setDatailSort(value);
                        break;
                    case COURSE_CODE:
                        detailInfo.setCourseCode(value);
                        break;
                    case COURSE_NAME:
                        detailInfo.setCourseName(value);
                        break;
                    case TEACH_PLAN_NUM:
                        detailInfo.setTeachPlanNum(value);
                        break;
                    case MAJOR_NAME:
                        detailInfo.setMajorName(value);
                        break;
                    case CAMPUS_CODE:
                        detailInfo.setCampusCode(value);
                        break;
                    case CLASS_NAME_SUM:
                        //存储的是班级名称和人数
                        classNameAndNum = value.split(" ");
                        if(classNameAndNum.length == 2){
                            detailInfo.setClassName(classNameAndNum[0]);
                            detailInfo.setClassStudentNum(Integer.valueOf(classNameAndNum[1]));
                        }
                        break;
                    case GRADE:
                        detailInfo.setGrade(value);
                        break;
                    case MAJOR_STUDENTS_NUMBER:
                        detailInfo.setMajorStudentsNumber(Integer.valueOf(value));
                        break;
                    case TEST_METHOD:
                        detailInfo.setTestMethod(value);
                        break;
                    case WEEK_PERIOD:
                        detailInfo.setWeekPeriod(value);
                        break;
                    case TOTAL_PERIOD:
                        detailInfo.setTotalPeriod(value);
                        break;
                    case START_STOP_WEEK:
                        detailInfo.setStartStopWeek(value);
                        break;
                    case CONTACT_TIME:
                        detailInfo.setContactTime(value);
                        break;
                    case EXPERIMENTAL_TIME:
                        detailInfo.setExperimentalTime(value);
                        break;
                    case COURSE_CHARACTER:
                        detailInfo.setCourseCharacter(value);
                        break;
                }
            }
            listInfo.add(detailInfo);
        }
        return listInfo;
    }
}
