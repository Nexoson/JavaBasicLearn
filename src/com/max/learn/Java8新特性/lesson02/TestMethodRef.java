package com.max.learn.Java8新特性.lesson02;

import com.max.learn.Java8新特性.lesson01.Employee;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 方法引用: 若lambda体中的内容有方法已经实现了,我们可以使用"方法引用"(可以理解为方法引用是Lambda表达式的另一种表现形式)
 * <p>
 * 主要有三种语法格式:
 * <p>
 * 对象::实例方法名
 * <p>
 * 类::静态方法名
 * <p>
 * 类::实例方法名
 */
public class TestMethodRef {

    @Test
    public void test01() {

        PrintStream ps1 = System.out;
        Consumer<String> con = (x) -> ps1.println(x);
        PrintStream ps = System.out;
        Consumer<String> con1 = ps::println;
        Consumer<String> con2 = System.out::println;
        con2.accept("abcdefg");
    }

    @Test
    public void test02() {

        Employee emp = new Employee();
        Supplier<String> sup = () -> emp.getName();
        String str = sup.get();
        System.out.println(str);

        Supplier<Integer> sup2 = emp::getAge;
        Integer num = sup2.get();
        System.out.println(num);
    }

    // 类::静态方法名
    @Test
    public void test03() {

        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        Comparator<Integer> com1 = Integer::compare;
    }

    // 类::实例方法名
    @Test
    public void test04() {
        BiPredicate<String, String> bp = (x, y) -> x.equals(y);
        BiPredicate<String, String> bp2 = String::equals;
    }

    @Test
    public void test05() {
        Supplier<Employee> sup = () -> new Employee();

        //构造器引用方式
        Supplier<Employee> sup2 = Employee::new;
        Employee emp = sup2.get();
        System.out.println(emp);
    }

    @Test
    public void test06() {
        Function<Integer, Employee> fun = (x) -> new Employee(x);
        Function<Integer, Employee> fun2 = (x) -> new Employee(x);
        Employee emp = fun2.apply(18);
        System.out.println(emp);
    }

    // 数组引用
    @Test
    public void test07() {
        Function<Integer, String[]> fun = (x) -> new String[x];
        String[] strs = fun.apply(10);
        System.out.println(strs.length);

        Function<Integer, String[]> fun2 = String[]::new;
        String[] strs2 = fun2.apply(20);
        System.out.println(strs2.length);


    }
}
