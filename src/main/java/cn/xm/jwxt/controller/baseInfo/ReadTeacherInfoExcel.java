package cn.xm.jwxt.controller.baseInfo;

import cn.xm.jwxt.bean.baseInfo.custom.StudentClassInfo;
import cn.xm.jwxt.bean.baseInfo.custom.TeacherMajorInfo;
import cn.xm.jwxt.utils.ValidateCheck;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class ReadTeacherInfoExcel {


    //文件读取开始行
    public static final int START_ROW = 5;
    //每一行需要读取的单元格总数
    public static final int CELL_SUM = 20;
    /**
     * 读取Excel文件返回通知书明细集合
     * @param fileName
     * @return
     */
    public static List<TeacherMajorInfo> readTeacherData(String fileName){
        //工作簿
        Workbook book = null;
        //工作表
        Sheet sheet;
        //单元格
        Cell cell;
        //单元格中的值
        String value;
        //枚举类型
        TeacherEnum teacherType;
        //教师信息集合
        List<TeacherMajorInfo> listInfo = new ArrayList<TeacherMajorInfo>();
        //声明实体类
        TeacherMajorInfo detailInfo;
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
            detailInfo = new TeacherMajorInfo();
            for(int j=0; j < CELL_SUM; j++){
                //获取每一行的单元格
                cell = sheet.getCell(j, i);//（列，行）
                value = cell.getContents();
                //如果为空进行下一次循环
                if(ValidateCheck.isNull(value)){
                    continue;
                }
                teacherType = TeacherEnum.fromIndex(j);
                switch (teacherType){
                    case TEACHER_NUM:
                        detailInfo.setTeachernum(value);
                        break;
                    case TEACHER_NAEM:
                        detailInfo.setTeachername(value);
                        break;
                    case TEACHER_SEX:
                        detailInfo.setTeachersex(value);
                        break;
                    case TEACHER_TEL:
                        detailInfo.setTeachertel(value);
                        break;
                    case POSITIONALTITLE:
                        detailInfo.setPositionaltitle(value);
                        break;
                    case TEACHERPOSITION:
                        detailInfo.setTeacherposition(value);
                        break;
                    case MAJOR_NAME:
                        detailInfo.setMajorname(value);
                        break;
                    case COLLEGE_NAME:
                        detailInfo.setCollegename(value);
                        break;
                    case GRADUATE_SCHOOL:
                        detailInfo.setGraduateschool(value);
                        break;
                    case GRADUATE_MAJOR:
                        detailInfo.setGraduatemajor(value);
                        break;
                    case COLLEGE_ID:
                        detailInfo.setCollegeid(value);
                        break;
                    case MAJOR_ID:
                        detailInfo.setMajorid(value);
                        break;

                    case JOINSCHOOLTIME:
                        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
                        try {
                            detailInfo.setJoinschooltime(format1.parse(value));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case TEACHERBIRTH:
                        SimpleDateFormat format2= new SimpleDateFormat("yyyy-MM-dd");
                        try {
                            detailInfo.setTeacherbirth(format2.parse(value));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        break;
                    case IN_POSITION:
                        detailInfo.setInposition(value);
                        break;
                }
            }
            listInfo.add(detailInfo);
        }
        return listInfo;
    }
}
