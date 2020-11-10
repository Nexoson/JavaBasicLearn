package com.max.learn.面试.三大特性.多态.案例06;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName Fu.java
 * @Description 父类
 * @createTime 2020年11月04日 23:09:00
 */
public class Fu {
    public int age;
    public String name;

    Fu(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("父类构造");
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("父类年龄赋值");
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("父类姓名赋值");
        this.name = name;
    }

    public void skill() {
        System.out.println(this.name + "会开车");
    }

    ;
}
