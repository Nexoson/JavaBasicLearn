package com.max.learn.面试.三大特性.封装;

/**
 * @ClassName Wife
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/14 22:01
 * @Version 1.0
 **/
public class Wife {

    private String name;
    private int age;
    private String sex;
    private Husband husband;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }
}
