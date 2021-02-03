package com.max.learn.Java8新特性.lesson01;


import java.util.Objects;

/**
 * @ClassName Employee
 * @Descripition 雇员
 * @Auther huangX
 * @Date 2019/12/19 22:46
 * @Version 1.0
 **/
public class Employee {

    /**
     * 姓名
     */
    private String name;
    /**
     * 薪水
     */
    private float salary;
    /**
     * 年龄
     */
    private int age;
    /**
     * 状态(枚举)
     */
    private Status status;

    public Employee() {
    }

    public enum Status{
        FREE,
        BUSY,
        VOCATION;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Float.compare(employee.salary, salary) == 0 &&
                age == employee.age &&
                Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, age);
    }

    public Employee(String name, float salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String name, float salary, int age, Status status) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.status = status;
    }

    public Employee(Integer x) {
        this.age = x;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", status=" + status +
                '}';
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
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
