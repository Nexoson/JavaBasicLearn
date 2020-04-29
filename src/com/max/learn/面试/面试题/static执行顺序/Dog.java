package com.max.learn.面试.面试题.static执行顺序;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName Dog.java
 * @Description TODO
 * @createTime 2020年03月15日 10:23:00
 */
public class Dog extends Animal{
    static {
        System.out.println("This is Dog Static area Code...");
    }
    {
        System.out.println("This is Dog General area Code...");
    }
    public Dog(){
        System.out.println("This is Dog Construct Method...");
    }

    @Override
    public void running() {
        System.out.println("dog is running!");
    }
}
