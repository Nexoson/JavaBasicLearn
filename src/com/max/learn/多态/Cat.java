package com.max.learn.多态;

/**
 * @ClassName Cat
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/19 0:05
 * @Version 1.0
 **/
public class Cat extends Animal{

    private String eyesColor;

    public Cat(String n, String c) {

        /**
         * 在构造方法的实现里面首先使用super调用父类Animal的构造方法Animal(String name)。
         * 把子类对象里面的父类对象先造出来。
         **/
        super(n);
        eyesColor = c;
    }

    public void enjoy() {
        System.out.println("我养的猫高兴的叫了一声...");
    }
}
