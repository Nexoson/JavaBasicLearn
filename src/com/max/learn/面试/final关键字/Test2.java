package com.max.learn.面试.final关键字;

/**
 * @ClassName Test2
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/27 23:41
 * @Version 1.0
 **/
public class Test2 {


    /**
     * static 与 final 理解 与区分
     **/
    public static void main(String[] args) {

        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println(myClass1.i);
        System.out.println(myClass1.j);
        System.out.println(myClass2.i);
        System.out.println(myClass2.j);

    }
}

class MyClass {
    public final double i = Math.random();
    public static double j = Math.random();
}
