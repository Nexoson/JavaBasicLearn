package com.max.learn.Java8新特性.lesson01;

import org.junit.Test;

import java.util.*;

/**
 * @ClassName TestLambda
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/12/19 22:43
 * @Version 1.0
 **/
public class TestLambda {

    // 原来的匿名内部类
    @Test
    public void test1(){
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        TreeSet<Integer> ts = new TreeSet<>(com);
        ts.add(8);
        ts.add(5);
        ts.add(9);
        ts.add(12);
        ts.add(18);
        ts.add(-12);
        for (Integer num : ts) {
            System.out.println(num);
        }
    }

    // Lambda 表达式
    @Test
    public void test2(){
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
        TreeSet<Integer> ts = new TreeSet<>(com);
    }

    @Test
    public void test3(){
        List<Employee> list = filterEmployees(employees);

        for(Employee employee : list){
            System.out.println(employee);
        }
    }
    //  优化方式一
    @Test
    public void test4(){
        List<Employee> list = filterEmployees(employees,new FilterEmployeByAge(27));

        for(Employee employee : list){
            System.out.println(employee);
        }
    }

    //  优化方式二: 匿名内部类
    @Test
    public void test5(){
        List<Employee> list = filterEmployees(employees, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge() > 26;
            }
        });

        for(Employee employee : list){
            System.out.println(employee);
        }
    }

    // 优化方式三: Lambda 表达式
    @Test
    public void test6(){
        List<Employee> list = filterEmployees(employees, (e) -> e.getSalary() <= 15000.0f);
        list.forEach(System.out::println);
    }

    // 优化方式四
    @Test
    public void test7(){
        employees.stream()
                .filter((e) -> e.getSalary() >= 15555.00f)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("---------------------------------------");

        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    @Test
    public void testX(){
        Employee employee = new Employee("张三",8888.88f,28);
    }

    public static List<Employee> employees  = Arrays.asList(
            new Employee("张三",18888.88f,28),
            new Employee("李四",17777.77f,27),
            new Employee("王五",16666.66f,26),
            new Employee("赵六",15555.55f,25),
            new Employee("田七",14444.44f,24),
            new Employee("王八",13333.33f,23),
            new Employee("黄九",12222.22f,22),
            new Employee("陈十",11111.11f,21)
    );

    // 需求: 获取当前公司中员工年龄大于35的员工信息
    public List<Employee> filterEmployees(List<Employee> list){
        List<Employee> emps = new ArrayList<>();

        for(Employee emp : list){
            if (emp.getAge() >= 25){
                emps.add(emp);
            }
        }
        return emps;
    }


    public List<Employee> filterEmployees(List<Employee> list, MyPredicate<Employee> mp){
        List<Employee> emps = new ArrayList<>();

        for(Employee emp : list){
            if (mp.test(emp)){
                emps.add(emp);
            }
        }
        return emps;
    }

}
