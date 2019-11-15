package com.max.learn.多态.案例01;

/**
 * @ClassName Dog
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/19 0:09
 * @Version 1.0
 **/
public class Dog extends Animal{

    private String furColor;


    public Dog(String name, String c) {
        super(name);
        furColor = c;
    }


    public void enjoy() {

        System.out.println("我养的狗高兴的叫了一声...");
    }
}
