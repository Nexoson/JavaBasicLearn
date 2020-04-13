package com.max.learn.thread.lesson04;

import java.util.HashMap;

/**
 * @ClassName People
 * @Descripition hashcode相关
 * @Auther huangX
 * @Date 2020/3/30 10:47
 * @Version 1.0
 **/
public abstract class People extends Object{
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((People)obj).name) && this.age== ((People)obj).age;
    }

    @Override
    public int hashCode() {
        return name.hashCode()*37+age;
    }

    public static void main(String[] args) {

//        People p1 = new People("Jack", 12);
//        System.out.println(p1.hashCode());
//
//        HashMap<People, Integer> hashMap = new HashMap<People, Integer>();
//        hashMap.put(p1, 1);

//        System.out.println(hashMap.get(new People("Jack", 12)));
    }
}
