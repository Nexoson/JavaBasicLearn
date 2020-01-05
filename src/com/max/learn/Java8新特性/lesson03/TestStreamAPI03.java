package com.max.learn.Java8新特性.lesson03;

import com.max.learn.Java8新特性.lesson01.Employee;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 终止操作
 */
public class TestStreamAPI03 {
    /**
     * 查找与匹配
     * allMatch -- 检查是否匹配所有元素
     * anyMatch -- 检查是否至少匹配一个元素
     * noneMatch -- 检查是否没有匹配所有元素
     * finaFirst -- 返回当前流中的任意元素
     * count -- 返回流中元素的总个数
     * max -- 返回流中最大值
     * min -- 返回流中最小值
     */

    public static List<Employee> employees  = Arrays.asList(
            new Employee("张三",18888.88f,28, Employee.Status.FREE),
            new Employee("黄九",13222.22f,18, Employee.Status.FREE),
            new Employee("李四",17777.77f,27, Employee.Status.BUSY),
            new Employee("田七",14444.44f,24, Employee.Status.BUSY),
            new Employee("王八",13333.33f,23, Employee.Status.VOCATION),
            new Employee("赵六",15555.55f,25, Employee.Status.FREE),
            new Employee("王五",16666.66f,26, Employee.Status.FREE),
            new Employee("陈十",11111.11f,21, Employee.Status.VOCATION)
    );

    @Test
    public void test01(){

        boolean b1 = employees.stream()
                .allMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b1);

        boolean b2 = employees.stream()
                .anyMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b2);

        boolean b3 = employees.stream()
                .noneMatch((e) -> e.getStatus().equals(Employee.Status.BUSY));
        System.out.println(b3);

        // Optional 是Java8中避免空指针异常的容器类
        Optional<Employee> op1 = employees.stream()
                .sorted((e1,e2) -> Double.compare(e1.getSalary(),e2.getSalary()))
                .findFirst();
        System.out.println(op1.get());

        Optional<Employee> op2 = employees.stream()
                .filter((e) -> e.getStatus().equals(Employee.Status.FREE))
                .findAny();
//        System.out.println(op2.get());

        // parallelStream 支持多线程
        Optional<Employee> op3 = employees.parallelStream()
                .filter((e) -> e.getStatus().equals(Employee.Status.FREE))
                .findAny();
        System.out.println(op3.get());

    }

    @Test
    public void test02(){
        Long count = employees.stream()
                .count();
        System.out.println(count);

        Optional<Employee> op1 = employees.stream()
                .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        System.out.println(op1.get());

        Optional<Float> op2 = employees.stream()
                .map(Employee::getSalary)
                .min(Double::compare);
        System.out.println(op2.get());

    }

}
