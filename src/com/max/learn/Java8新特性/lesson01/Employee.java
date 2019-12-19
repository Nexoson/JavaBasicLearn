package com.max.learn.Java8新特性.lesson01;

/**
 * @ClassName Employee
 * @Descripition 雇员
 * @Auther huangX
 * @Date 2019/12/19 22:46
 * @Version 1.0
 **/
public class Employee {

    // 姓名
    private String name;
    // 薪水
    private float salary;
    // 年龄
    private int age;

    public Employee(String name, float salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
