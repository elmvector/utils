package com.ev.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeFormatUtil {
    /**
     * @param Long       java.lang.System#currentTimeMillis()
     *
     * @param Date       "Sun Apr 15 12:00:32 CST 2018"
     *                 ("EEE MMM dd HH:mm:ss zzz yyyy")
     *
     * @param String     "2018-4-15 12:00:32"
     *                  ("yyyy-MM-dd HH:mm:ss")
     *
     *
     * @param StringCST  "Sun Apr 15 12:00:32 CST 2018"
     *                  ("EEE MMM dd HH:mm:ss zzz yyyy")
     */


    /**
     * Date -> Long
     *
     * @param date Date
     * @return Long
     **/
    public Long dateToLong(Date date) throws ParseException {
        return date.getTime();
    }

    /**
     * Long -> Date
     *
     * @param time Long
     * @return Date
     **/
    public Date longToDate(Long time) throws ParseException {
        return new Date(time);
        /*
         *Date date = new Date(time);
         *return date;
         */
    }

    /**
     * Long -> String
     *
     * @param time Long
     * @return String
     */
    public String longToString(Long time) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(time);
        return simpleDateFormat.format(date);
        /*
         *String stringTime = simpleDateFormat.format(date);
         *return stringTime;
         */
    }

    /**
     * String -> Date
     *
     * @param stringTime String
     * @return Date
     */
    public Date stringToDate(String stringTime) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return (Date) sdf.parse(stringTime);
        /*
         *Date date = (Date) sdf.parse(stringTime);
         *return date;
         */
    }

    /**
     * StringCST -> Date
     *
     * @param stringTime StringCST
     * @return Date
     */
    public Date cstToDate(String stringTime) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.CHINA);
        return (Date) sdf.parse(stringTime);
        /*
         *Date date = (Date) sdf.parse(stringTime);
         *return date;
         */
    }


}