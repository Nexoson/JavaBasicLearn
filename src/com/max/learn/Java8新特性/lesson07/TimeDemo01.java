package com.max.learn.Java8新特性.lesson07;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;
import java.util.Set;

/**
 * @ClassName TimeDemo01
 * @Descripition Java8 时间api学习
 * @Auther huangX
 * @Date 2020/4/2 11:01
 * @Version 1.0
 **/
public class TimeDemo01 {

    /**
     * @return
     * @Author huangX
     * @Date 11:07 2020/4/2
     * @Param
     * @Description Instant ofEpochSecond 方法的第一个参数为秒，第二个参数为纳秒，
     * 上面的代码表示从1970-01-01 00:00:00开始后两分钟的10万纳秒的时刻
     **/
    @Test
    public void test01() {
        Instant instant = Instant.ofEpochSecond(120, 100000);
        System.out.println(instant);
    }


    /**
     * @return
     * @Author huangX
     * @Date 11:10 2020/4/2
     * @Param
     * @Description Duration : 计算两个“时间”的间隔
     **/
    @Test
    public void test02() {
        LocalDateTime from = LocalDateTime.of(2020, Month.MARCH, 24, 07, 05, 59);
        LocalDateTime to = LocalDateTime.of(2020, Month.APRIL, 02, 11, 13, 59);
        to = LocalDateTime.now();
        Duration duration = Duration.between(from, to);
        /**
         * 这段时间总天数
         **/
        long days = duration.toDays();

        /**
         * 这段时间的小时数
         **/
        long hours = duration.toHours();

        /**
         * 这段时间的分钟数
         **/
        long minutes = duration.toMinutes();

        /**
         * 这段时间的秒数
         **/
        long seconds = duration.getSeconds();

        /**
         * 这段时间的毫秒数
         **/
        long millis = duration.toMillis();

        /**
         * 这段时间的纳秒数
         **/
        long nanos = duration.toNanos();

        System.out.println(days);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        System.out.println(millis);
        System.out.println(nanos);


        // Duration对象还可以通过of()方法创建，该方法接受一个时间段长度，和一个时间单位作为参数
        // 5天
        Duration duration1 = Duration.of(5, ChronoUnit.DAYS);
        // 1000毫秒
        Duration duration2 = Duration.of(1000, ChronoUnit.MILLIS);
        System.out.println(duration1.toDays());
        System.out.println(duration2.toMillis());
    }


    /**
     * @return
     * @Author huangX
     * @Date 11:22 2020/4/2
     * @Param
     * @Description Period : 用于计算两个“日期”的间隔
     **/
    @Test
    public void test03() {

        // 2019-01-21 到 2019-02-21 这段时间
        Period period = Period.between(LocalDate.of(2019, 3, 12),
                LocalDate.of(2020, 4, 2));
        System.out.println(period.getYears());
    }


    /**
     * @return
     * @Author huangX
     * @Date 11:25 2020/4/2
     * @Param
     * @Description ZoneId : 时区
     **/
    @Test
    public void test04() {

        // 获取所有合法的"区域/城市"字符串
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
/*        for (String str : zoneIds) {
            System.out.println(str);
        }*/

        // 获取系统默认时区
        ZoneId systemZoneId = ZoneId.systemDefault();
        System.out.println(systemZoneId);

        // 创建时区
        ZoneId banguiZoneId = ZoneId.of("Africa/Bangui");
        System.out.println(banguiZoneId);

    }


    /**
     * @return
     * @Author huangX
     * @Date 11:36 2020/4/2
     * @Param
     * @Description LocalDateTime：包含日期和时间，比如：2016-10-20 23:14:21
     **/
    @Test
    public void test05() {
        //
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // 创建特定日期(多种自定义)
        LocalDateTime localDateTime1 = LocalDateTime.of(2019, 01, 21, 16, 22, 34);
        System.out.println(localDateTime1);

        // 获取年月日的信息
        System.out.println(LocalDateTime.now().getYear());
        System.out.println(LocalDateTime.now().getMonth());
        System.out.println(LocalDateTime.now().getDayOfYear());
        System.out.println(LocalDateTime.now().getDayOfMonth());
        System.out.println(LocalDateTime.now().getDayOfWeek());
        System.out.println(LocalDateTime.now().getHour());

    }


    /**
     * @return
     * @Author huangX
     * @Date 12:08 2020/4/2
     * @Param
     * @Description LocalDateTime 自定义时间
     **/
    @Test
    public void test06() {

        LocalDateTime time = LocalDateTime.of(2020, 1, 1, 1, 1, 1);
        System.out.println(time);

        // 使用plus方法增加年份
        // 改变时间后会返回一个新的实例
        LocalDateTime nextYearTime = time.plusYears(2);
        System.out.println(nextYearTime);

        // 使用minus方法减年份
        LocalDateTime lastYearTime = time.minusYears(1);
        System.out.println(lastYearTime);

        // 使用with方法设置月份
        LocalDateTime changeTime = time.withMonth(12);
        System.out.println(changeTime);

        // 判断当前年份是否闰年
//        System.out.println("isLeapYear :" + time.isLeapYear());

        // 判断当前日期属于星期几
        LocalDateTime time1 = LocalDateTime.now();
        DayOfWeek dayOfWeek = time1.getDayOfWeek();
        System.out.println(dayOfWeek);


        // 获取当前月的第一天和最后一天
        LocalDate today = LocalDate.now();
        LocalDate firstDay = LocalDate.of(today.getYear(), today.getMonth(), 01);
        // 本月最后一天
        LocalDate lastDay = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("本月第一天"+firstDay);
        System.out.println("本月最后一天"+lastDay);
    }


    /**
     * @return
     * @Author huangX
     * @Date 13:53 2020/4/2
     * @Param
     * @Description 其他使用场景
     **/
    @Test
    public void test07() {
        // 判断两个日期是否相等
        LocalDate date1 = LocalDate.of(2020, 04, 02);
        if (date1.equals(LocalDate.now())) {
            System.out.printf("Today %s and date1 %s are same date %n", LocalDate.now(), date1);
        }

        // 检查像身体这种周期性时间
        /**
         *  类似每月账单、结婚纪念日、保险缴费日这些周期性事件。
         *  使用MonthDay类。这个类组合了月份和日，去掉 了年，
         *  这意味着你可以用它判断每年都会发生事件。
         **/
        LocalDate dateOfBirthday = LocalDate.of(1994, 05, 05);
        MonthDay birthday = MonthDay.of(dateOfBirthday.getMonth(), dateOfBirthday.getDayOfMonth());
        MonthDay curMonthDay = MonthDay.from(LocalDate.now());
        if (curMonthDay.equals(birthday)) {
            System.out.println("Many Many happy returns of the day !!");
        } else {
            System.out.println("Sorry, today is not your birthday");
        }


        // 判断日期是早于还是晚于另一个日期
        LocalDate tomorrow = LocalDate.of(2020, 04, 03);
        if (tomorrow.isAfter(LocalDate.now())) {
            System.out.println("Tomorrow comes after today");
        }
    }


    /**
     * @return
     * @Author huangX
     * @Date 14:18 2020/4/2
     * @Param
     * @Description Java8 时间类与Date类的相互转化
     **/
    @Test
    public void test08() {
        // Date与Instant的互相转化
        Instant instant = Instant.now();
        Date date = Date.from(instant);
        Instant instant2 = date.toInstant();

        //Date转为LocalDateTime
        Date date2 = new Date();
        LocalDateTime localDateTime2 = LocalDateTime.ofInstant(date2.toInstant(), ZoneId.systemDefault());

        //LocalDateTime转Date
        LocalDateTime localDateTime3 = LocalDateTime.now();
        Instant instant3 = localDateTime3.atZone(ZoneId.systemDefault()).toInstant();
        Date date3 = Date.from(instant);

        //LocalDate转Date
        //因为LocalDate不包含时间，所以转Date时，会默认转为当天的起始时间，00:00:00
        LocalDate localDate4 = LocalDate.now();
        Instant instant4 = localDate4.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
        Date date4 = Date.from(instant);
    }



    /**
     * @Author huangX
     * @Date 14:29 2020/4/2
     * @Param
     * @return
     * @Description 日期的格式化和解析DateTimeFormatter
     **/
    @Test
    public void test09() {

        /**
         * Java8的DateTimeFormatter也是线程安全的，
         * 而SimpleDateFormat并不是线程安全。
         * DateTimeFormatter和SimpleDateFormat对比
         **/
        //使用Date和SimpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("G yyyy年MM月dd号 E a hh时mm分ss秒");
        String format = simpleDateFormat.format(new Date());
        System.out.println(format);
        //打印: 公元 2020年04月02号 星期四 下午 02时31分05秒

        //使用jdk1.8 LocalDateTime和DateTimeFormatter
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("G yyyy年MM月dd号 E a hh时mm分ss秒");
        String format1 = now.format(pattern);
        System.out.println(format1);
        //打印: 公元 2020年04月02号 星期四 下午 02时31分05秒
    }


    
    /**
     * @Author huangX
     * @Date 14:31 2020/4/2
     * @Param 
     * @return 
     * @Description String转Date
     **/
    @Test
    public void test10() throws ParseException {
        //使用Date和SimpleDateFormat
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = simpleDateFormat.parse("2020-04-03 10:15:30");
        System.out.println(simpleDateFormat.format(date));

        //使用jdk1.8 LocalDateTime和DateTimeFormatter
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //严格按照ISO yyyy-MM-dd验证，03写成3都不行
        LocalDateTime dt = LocalDateTime.parse("2020-04-03 10:15:30",pattern);
        System.out.println(dt.format(pattern));
    }


    /**
     * @Author huangX
     * @Date 14:33 2020/4/2
     * @Param 
     * @return 
     * @Description 使用SimpleDateFormat的正确姿势01
     **/
    public static String test11(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }


    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    /**
     * @Author huangX
     * @Date 14:35 2020/4/2
     * @Param
     * @return
     * @Description 使用SimpleDateFormat的正确姿势02
     **/
    public static String test12(Date date){

        /**
         * 为了避免创建大量的SimpleDateFormat实例，
         * 往往会考虑把SimpleDateFormat实例设为静态成员变量,
         * 共享SimpleDateFormat对象。这种情况下就得对SimpleDateFormat添加同步。
         */

        synchronized(sdf){
            return sdf.format(date);
        }

        // 这种方法的缺点也很明显，就是在高并发的环境下会导致解析被阻塞。
    }


    /**
     * @Author huangX
     * @Date 14:35 2020/4/2
     * @Param
     * @return
     * @Description 使用SimpleDateFormat的正确姿势03（推荐）
     **/
    private static ThreadLocal<DateFormat> threadLocal = new ThreadLocal<DateFormat>() {
        @Override
        protected DateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    public static String format(Date date) {
        return threadLocal.get().format(date);
    }

    public static void main(String[] args) {
        System.out.println(format(new Date()));
    }

}
