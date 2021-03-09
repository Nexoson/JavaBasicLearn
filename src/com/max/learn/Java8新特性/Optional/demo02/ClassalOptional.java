package com.max.learn.Java8新特性.Optional.demo02;

import java.util.Optional;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className ClassalOptional
 * @date 2021/3/9 20:54
 * @desc
 **/
public class ClassalOptional {
    public static void main(String[] args) {
        // 1、创建一个包装对象值为空的Optional对象
        Optional<Object> empty = Optional.empty();
        // 2、创建包装对象值非空的Optional对象
        Optional<String> optStr1 = Optional.of("optional");
        // 3、创建包装对象值允许为空的Optional对象
        Optional<String> optStr2 = Optional.ofNullable(null);
    }
}
