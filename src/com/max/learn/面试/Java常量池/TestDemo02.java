package com.max.learn.面试.Java常量池;

/**
 * @ClassName TestDemo02
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/18 22:29
 * @Version 1.0
 **/
public class TestDemo02 {

    public static final String a = "123";
    public static final String b = "456";

    public static void main(String[] args) {

        String c = "123456";
        String d = a+b;
        System.out.println(c == d);

    }
}
