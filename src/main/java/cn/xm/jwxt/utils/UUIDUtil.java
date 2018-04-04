package cn.xm.jwxt.utils;

import java.util.UUID;

/**
 * UUID工具类
 * 
 * @author QiaoLiQiang
 * @time 2017年9月18日上午9:09:25
 */
public class UUIDUtil {
	/**
	 * 带-的UUID
	 * 
	 * @return 36位的字符串
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 去掉-的UUID
	 * 
	 * @return 32位的字符串
	 */
	public static String getUUID2() {
		return UUID.randomUUID().toString().replace("-", "");
	}

}
