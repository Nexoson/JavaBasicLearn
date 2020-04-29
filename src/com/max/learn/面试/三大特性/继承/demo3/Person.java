package com.max.learn.面试.三大特性.继承.demo3;

/**
 * @ClassName Person
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/14 22:41
 * @Version 1.0
 **/
public class Person {

    protected String name;
    protected int age;
    protected String sex;

    public Person(String name) {
        System.out.println("Person Constrctor..."+ name);
    }

    static void display(Person person){
        System.out.println("Play Person...");
    }
}
