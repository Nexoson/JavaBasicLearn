package com.max.learn.面试.三大特性.多态.案例01;

/**
 * @ClassName Bird
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/19 0:10
 * @Version 1.0
 **/
public class Bird extends Animal{

    public Bird() {
        super("bird");
    }

    @Override
    public void enjoy() {
        System.out.println("我养的鸟高兴地叫了一声...");
    }
}
