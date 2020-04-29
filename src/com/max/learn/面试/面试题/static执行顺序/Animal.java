package com.max.learn.面试.面试题.static执行顺序;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName Cat.java
 * @Description TODO
 * @createTime 2020年03月15日 10:22:00
 */
public class Animal {

    static {
        System.out.println("This is Animal Static area Code... ");
    }
    {
        System.out.println("This is Animal General area Code...");
    }
    public Animal()
    {
        System.out.println("This is Animal Construct Method...");
    }

    public void running()
    {
        System.out.println("I'm  Running");
    }
}
