package com.max.learn.面试.三大特性.多态.案例02;

/**
 * @ClassName JNC
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/15 19:42
 * @Version 1.0
 **/
public class JNC extends Wine{


    public void fun1(String a) {
        System.out.println("JNC 的fun1...");
        fun2();
    }


    /**
     * 子类重写父类方法
     * 指向子类的父类引用调用fun2时，必定是调用该方法
     **/
    @Override
    public void fun2() {
        System.out.println("JNC 的fun2...");
    }
}
