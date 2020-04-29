package com.max.learn.面试.Java常量池;

/**
 * @ClassName TestDemo01
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/18 22:18
 * @Version 1.0
 **/
public class TestDemo01 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hel" + "lo";
        String s4 = "Hel" + new String("lo");
        String s5 = new String("Hello");
        String s6 = s5.intern();
        String s7 = "H";
        String s8 = "ello";
        String s9 = s7 + s8;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s6);
        System.out.println(s1 == s9);
        System.out.println(s4 == s5);
        System.out.println(s1 == s4);

        // true
        // true
        // true
        // false
        // false
        // false

    }
}
