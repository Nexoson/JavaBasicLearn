package com.max.learn.final关键字;

/**
 * @ClassName Test
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/27 21:57
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        String temp = "hello";
        String a = "hello" +2;
        String b = temp + 2;
        String c = "hello2";

        System.out.println( (a == b));
        System.out.println( (a == c));
        System.out.println( (c == b));



        /*        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;

        System.out.println( a == c);
        System.out.println( a == e);*/


/*        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = c.intern();*/

    }
}
