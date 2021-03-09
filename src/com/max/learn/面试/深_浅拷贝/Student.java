package com.max.learn.面试.深_浅拷贝;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className Student
 * @date 2021/3/9 15:29
 * @desc
 **/
public class Student implements Cloneable {


    /**
     * 引用数据类型
     **/
    private Subject subject;

    /**
     * 基础数据类型
     **/
    private String name;

    private int age;

    public Student(Subject subject, String name, int age) {
        this.subject = subject;
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
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
    protected Object clone(){
        // 深拷贝
        try {
            // 直接调用父类的clone()方法
            Student student = (Student) super.clone();
            student.subject = (Subject) subject.clone();
            return student;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "subject=" + subject +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
