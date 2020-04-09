package com.max.learn.集合相关.面试.题一;

/**
 * @ClassName User
 * @Auther huangX
 * @Date 2020/4/7 22:33
 * @Version 1.0
 * @Descripition TODO
 **/
public class User implements Comparable<User>{

    public String name;
    public int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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
    public int compareTo(User o) {
        if(this.age >= o.age)
            return 1;
        return -1;
    }
}
