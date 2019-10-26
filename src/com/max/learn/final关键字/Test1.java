package com.max.learn.final关键字;

/**
 * @ClassName Test1
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/27 22:27
 * @Version 1.0
 **/
public class Test1 {

    public static void main(String[] args) {

        String a = "hello2";
        final String b = getHello();
        String c = b +2;
        System.out.println((a == c));

    }

    private static String getHello() {
        return "hello";
    }
}
