package com.max.learn.面试.static关键字.面试题;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName StaticTest.java
 * @Description TODO
 * @createTime 2020年03月15日 16:40:00
 */
public class StaticTest {

    //静态变量
    private static int staticInt = 2;
    //实例变量
    private int random = 2;

    public StaticTest() {
        staticInt++;
        random++;
        System.out.println("staticInt = "+staticInt+"  random = "+random);
    }

    public static void main(String[] args) {
//        StaticTest test = new StaticTest();
//        StaticTest test2 = new StaticTest();
        // 3 3
        // 4 3
        int a = 1;
        int b = 10;

        int c = a++;
        int d = ++b;
        System.out.println(c);
        System.out.println(d);
    }
}
