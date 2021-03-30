package com.max.learn.面试.final关键字.lesson03;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className Demo01
 * @date 2021/3/26 20:23
 * @desc
 **/
public class Demo01 {

    public void test01() {
        MyClass myClass = new MyClass();
        StringBuffer buffer = new StringBuffer("hello");
        myClass.changeValue(buffer);
        System.out.println(buffer.toString());
    }

    class MyClass {
        void changeValue(final StringBuffer buffer) {
            buffer.append("world");
        }
    }

    public static void main(String[] args) {
        final StringBuffer buffer = new StringBuffer("666");
        System.out.println(System.identityHashCode(buffer));
        StringBuffer abc = buffer.append("abc");
        System.out.println(System.identityHashCode(abc));
//        System.out.println(buffer);
    }
}
