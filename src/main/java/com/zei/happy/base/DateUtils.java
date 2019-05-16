package com.zei.happy.base;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 */
public class DateUtils {

    //年-月-日 时:分:秒
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    //年-月-日
    public static final String DAY_FORMAT = "yyyy-MM-dd";
    //年月日时分秒
    public static final String DATE_TIME_FORMAT = "yyyyMMddHHmmss";
    //年月日时分秒毫秒
    public static final String DATE_S_FORMAT = "yyyyMMddHHmmssS";


    /**
     * 日期转字符串 自定义格式化
     * @param date
     * @param format
     * @return
     */
    public static String dateToStr(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }

    /**
     * 日期转字符串 DATE_FORMAT格式
     * @param date
     * @return
     */
    public static String dateToStr(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
        return sdf.format(date);
    }

    /**
     * 日期转字符串 DAY_FORMAT格式
     * @param date
     * @return
     */
    public static String dayToStr(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(DAY_FORMAT);
        return sdf.format(date);
    }

    /**
     * 日期转字符串 DATE_TIME_FORMAT格式
     * @param date
     * @return
     */
    public static String dateTimeToStr(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_TIME_FORMAT);
        return sdf.format(date);
    }

    /**
     * 日期转字符串 DATE_S_FORMAT格式
     * @param date
     * @return
     */
    public static String dateSToStr(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat(DATE_S_FORMAT);
        return sdf.format(date);
    }

    /**
     * 若时分秒为00:00:00 则过滤
     * @param date
     * @return
     */
    public static String dateFilterToStr(Date date){
        String dateStr = dateToStr(date);
        if(dateStr.endsWith("00:00:00")){
            return dateStr.substring(0,10);
        }else{
            return dateStr;
        }
    }

    /**
     * 字符串转日期
     * @param str
     * @param format
     * @return
     */
    public static Date strToDate(String str, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(str);
    }

    /**
     * 比较两个日期，若early更早则返回1 反之返回-1 相同则返回0
     * @param early
     * @param late
     * @return
     */
    public static int isEarlyDate(Date early, Date late){
        if(early.getTime()<late.getTime()){
            return 1;
        }else if(early.getTime()>late.getTime()){
            return -1;
        }else{
            return 0;
        }
    }

    /**
     * 比较两个日期格式（DATE_TIME_FORMAT）字符串，若early更早则返回1 反之返回-1 相同则返回0
     * @param earlyStr
     * @param lateStr
     * @return
     */
    public static int isEarlyDate(String earlyStr, String lateStr) throws ParseException {
        Date early = strToDate(earlyStr,DATE_TIME_FORMAT);
        Date late = strToDate(earlyStr,DATE_TIME_FORMAT);
        return isEarlyDate(early,late);
    }
}
