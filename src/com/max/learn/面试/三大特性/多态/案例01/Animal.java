package com.max.learn.面试.三大特性.多态.案例01;

/**
 * @ClassName Animal
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/19 0:04
 * @Version 1.0
 **/
public class Animal {


    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void enjoy(){
        System.out.println("动物的叫声...");
    }
}
