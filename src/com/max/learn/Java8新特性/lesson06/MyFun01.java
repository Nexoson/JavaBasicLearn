package com.max.learn.Java8新特性.lesson06;

public interface MyFun01 {

    default String getName(){
        return "雷布斯";
    }

    static void show(){
        System.out.println("MyFun01接口中的静态方法");
    }
}
