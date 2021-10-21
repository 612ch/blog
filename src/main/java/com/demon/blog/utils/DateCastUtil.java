package com.demon.blog.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Demon
 * @className DataCastUtil
 * @descriotion 日期转换工具类
 * @date 2021/1/27 15:29
 **/
public class DateCastUtil {
    /**
     * 日期转换String
     *
     * @param date 日期
     * @return {@link String}
     */
    public static String dateToStr(Date date) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(date);
    }

    /**
     * 日期转换String 附带格式
     *
     * @param date   日期
     * @param format 格式
     * @return {@link String}
     */
    public static String dateToStr(Date date, String format) {
        if (date == null) {
            return "";
        }
        SimpleDateFormat df = new SimpleDateFormat(format);
        return df.format(date);
    }

    /**
     * String转换日期
     *
     * @param dateStr str日期
     * @return {@link Date}
     */
    public static Date strToDate(String dateStr) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        try {
            date = df.parse(dateStr);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date;
    }

    /**
     * String转换日期 附带格式
     *
     * @param dateStr str日期
     * @param format  格式
     * @return {@link Date}
     */
    public static Date strToDate(String dateStr, String format) {
        SimpleDateFormat df = new SimpleDateFormat(format);
        Date date = new Date();
        try {
            date = df.parse(dateStr);

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 比较时间差
     *
     * @param date1 date1
     * @param date2 date2
     * @return {@link Integer}
     */
    @Deprecated
    public static Integer compareTimeOnly(Date date1, Date date2) {
        Integer time1 = date1.getSeconds() + date1.getMinutes() * 60 + date1.getHours() * 60 * 60;
        Integer time2 = date2.getSeconds() + date2.getMinutes() * 60 + date2.getHours() * 60 * 60;
        if (time1 > time2) {
            return 1;
        }
        if (time1 < time2) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(DateCastUtil.dateToStr(new Date(), "yyyy-MM-dd HH:mm:ss"));
        System.out.println(DateCastUtil.dateToStr(new Date()));
        System.out.println(DateCastUtil.dateToStr(new Date(), "HH:mm:ss"));
        System.out.println(DateCastUtil.strToDate("2020-10-01 08:44:33"));

    }
}
