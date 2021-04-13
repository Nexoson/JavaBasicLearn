package com.max.learn.集合相关.面试.题一;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className Test02
 * @date 2021/4/13 10:24
 * @desc
 **/
public class Test02 {

    public static void main(String[] args) throws ParseException {

        String dateStr = "2020-09-27 11:27:01";
        //
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(dateStr);
        System.out.println(date);
    }
}
