package com.max.learn.Java8新特性.Optional.demo01;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className Entity
 * @date 2021/3/9 17:17
 * @desc
 **/
public class Student {

    /**
     * 姓名
     **/
    private String name;
    /**
     * 年龄
     **/
    private Integer age;
    /**
     * 性别
     **/
    private String gender;

    public Student() {
    }

    public Student(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
