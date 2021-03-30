package com.max.learn.面试.final关键字.lesson02;

import com.max.learn.Java8新特性.lesson06.MyClass;
import org.junit.Test;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className Demo01
 * @date 2021/3/26 19:50
 * @desc
 **/
public class Demo01 {

    @Test
    public void test01() {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println("myClass1.i = " + myClass1.i);
        System.out.println("MyClass.j = " + MyClass.j);
        System.out.println("myClass2.i = " + myClass2.i);
        System.out.println("MyClass.j = " + MyClass.j);

        /**
         * final和static  static作用于成员变量用来表示只保存一份副本，而final的作用是用来保证变量不可变
         **/
    }


    static class MyClass {
        public final double i = Math.random();
        public static double j = Math.random();
    }
}
