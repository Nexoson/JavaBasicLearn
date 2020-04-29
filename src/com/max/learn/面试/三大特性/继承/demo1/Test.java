package com.max.learn.面试.三大特性.继承.demo1;

/**
 * @ClassName Test
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/20 21:02
 * @Version 1.0
 **/
public class Test {



    public static void main(String[] args) {
        /**
         * 在类的加载过程中，类的static成员变量会被初始化，
         * 另外，如果类中有static语句块，则会执行static语句块。
         * static成员变量和static语句块的执行顺序同代码中的顺序一致。
         * 记住，在Java中，类是按需加载，只有当需要用到这个类的时候，
         * 才会加载这个类，并且只会加载一次
         **/
        Bread bread1 = new Bread();
        Bread bread2 = new Bread();


        /**
         * 在生成对象的过程中，会先初始化对象的成员变量，
         * 然后再执行构造器。也就是说类中的变量会在任何方法（包括构造器）调用之前得到初始化，
         * 即使变量散布于方法定义之间
         **/
        new Meal();

    }
}
