package cn.xm.jwxt.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 转换日期的工具类
 * 
 * @author QiaoLiQiang
 * @time 2017年9月18日上午9:07:48
 */
public class DateHandler {

	/**
	 * 改变日期为String类型：格式为yyyy-MM-dd
	 * 
	 * @param date
	 *            日期
	 * @return String类型的转换结果
	 */
	public static String dateToString(Date date) {
		String sdate = "";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		if (date != null) {
			sdate = formatter.format(date);
		}
		return sdate;
	}

	/**
	 * 改变日期为String类型：格式为yyyy-MM-dd HH:mm
	 * 
	 * @param date
	 *            日期
	 * @return String类型的转换结果
	 */
	public static String dateToStringHourMinute(Date date) {
		String sdate = "";
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		if (sdate != null) {
			sdate = formatter.format(date);
		}
		return sdate;
	}

	/**
	 * 改变日期为String类型：格式自定义
	 * 
	 * @param date
	 *            日期
	 * @param format
	 *            格式
	 * @return String类型的转换结果
	 */
	public static String dateToString(Date date, String format) {
		String sdate = "";
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		if (sdate != null) {
			sdate = formatter.format(date);
		}
		return sdate;
	}

	/**
	 * 改变String记录的日期为java.util.Date类型
	 * 
	 * @param date
	 *            String类型日期
	 * @return Date类型转换结果
	 * @throws ParseException
	 */
	public static Date changeStringToDate(String date) throws ParseException {
		Date t = null;
		if ((date != null) && (!date.trim().equals(""))) {
			try {
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				t = formatter.parse(date);
			} catch (ParseException ex) {
				ex.printStackTrace();
				throw new RuntimeException(ex);
			}
		}
		return t;
	}

	/**
	 * 改变String记录的日期为java.util.Date类型，格式自定义
	 * 
	 * @param date
	 *            String类型日期
	 * @param format
	 *            自定义格式模板
	 * @return Date类型日期转换结果
	 * @throws ParseException
	 */
	public static Date changeStringToDate(String date, String format) throws ParseException {
		Date t = null;
		if ((date != null) && (!date.trim().equals(""))) {
			try {
				SimpleDateFormat formatter = new SimpleDateFormat(format);
				t = formatter.parse(date);
			} catch (ParseException ex) {
				ex.printStackTrace();
				throw new RuntimeException(ex);
			}
		}
		return t;
	}

	/**
	 * 为日期类型添加时分秒
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static Date addHourMinuteSecToDate(Date date) throws ParseException{
		Date t = null;
		if (date != null) {
			String dateToString = dateToString(date);
			//获取当前的时分秒
			Date nowDate = new Date();
			String hourMinuteSec = dateToString(nowDate, "HH:mm:ss");
			dateToString = dateToString+" "+hourMinuteSec;
			t = changeStringToDate(dateToString, "yyyy-MM-dd HH:mm:ss");
		}
		return t;
	}
}
