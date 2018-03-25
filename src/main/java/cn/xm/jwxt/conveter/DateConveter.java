package cn.xm.jwxt.conveter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 转换日期类型的数据
 * S : 页面传递过来的类型
 * T ： 转换后的类型
 * @author lx
 *
 */
public class DateConveter implements Converter<String, Date>{

    public Date convert(String source) {
        try {
            if(null != source){//2016:11-05 11_43-50
                DateFormat df = new SimpleDateFormat("yyyy:MM-dd HH_mm-ss");
                return df.parse(source);
            }
        } catch (Exception e) {
        }
        return null;
    }

}