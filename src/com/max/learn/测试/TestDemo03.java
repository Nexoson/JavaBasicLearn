package com.max.learn.测试;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ClassName TestDemo03
 * @Auther huangX
 * @Date 2020/5/7 13:26
 * @Version 1.0
 * @Descripition JDK1.8 LocalDateTime 转化为时分秒
 **/
public class TestDemo03 {
    public static void main(String[] args) {
        final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime.now().format(DATETIME_FORMATTER);
    }
}
