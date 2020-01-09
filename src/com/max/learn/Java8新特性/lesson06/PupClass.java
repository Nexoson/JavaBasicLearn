package com.max.learn.Java8新特性.lesson06;

public class PupClass implements MyFun01, MyFun02 {

    /**
     * 实现两个接口中有相同的方法,则必须要指定一个方法进行实现
     * @return
     */
    @Override
    public String getName() {
        return MyFun01.super.getName();
    }
}
