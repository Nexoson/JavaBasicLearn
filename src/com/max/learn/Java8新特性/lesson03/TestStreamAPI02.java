package com.max.learn.Java8新特性.lesson03;

import com.max.learn.Java8新特性.lesson01.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Stream的筛选与切片
 */
public class TestStreamAPI02 {

    public static List<Employee> employees  = Arrays.asList(
            new Employee("张三",18888.88f,28),
            new Employee("李四",17777.77f,27),
            new Employee("王五",16666.66f,26),
            new Employee("赵六",15555.55f,25),
            new Employee("田七",14444.44f,24),
            new Employee("王八",13333.33f,23),
            new Employee("黄九",10222.22f,22),
            new Employee("黄九",11222.22f,24),
            new Employee("黄九",12222.22f,26),
            new Employee("黄九",13222.22f,18),
            new Employee("陈十",11111.11f,21)
    );

    // 中间操作
    /**
     * 筛选与切片
     * filter-接收Lambda,从流中排除某些元素
     * limit-截断流
     * skip(n) -跳过元素,返回一个扔掉了前n个元素的流,若流中元素不足n个,则返回一个空流. 与limit(n)互补
     * distinct-筛选,通过流所生成元素的hashcode() 和 equals()方法去除重复元素
     */

    // 内部迭代: 迭代操作由Stream API完成
    @Test
    public void test01(){

        // 中间操作:不会执行任何操作
        Stream<Employee> employeeStream = employees.stream()
                .filter((e) -> e.getAge() > 22);

        // 种植操作: 一次性执行全部内容,即"惰性求值"
        employeeStream.forEach(System.out::println);
    }

    // 外部迭代
    @Test
    public void test02(){
        Iterator<Employee> it = employees.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Test
    public void test03(){
        employees.stream()
                .filter((e) -> e.getSalary() > 12223.0)
                .limit(5)
                .forEach(System.out::println);
    }

    @Test
    public void test04(){
        employees.stream()
                .filter((e)->{
//                    System.out.println("短路");
                    return e.getSalary() > 12222.0;
                })
                .skip(0)
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void test05(){
        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");

        list.stream()
                .map((str) -> str.toUpperCase())
                .forEach(System.out::println);

        System.out.println("--------------------------------");
        employees.stream()
                .map(Employee::getName)
                .forEach(System.out::println);

        System.out.println("--------------------------------");
        Stream<Stream<Character>> stream = list.stream()
                .map(TestStreamAPI02::filterCharacter);
        stream.forEach((sm) -> {
//            sm.forEach(System.out::println);
        });

        System.out.println("--------------------------------");
        Stream<Character> stream1 = list.stream()
                .flatMap(TestStreamAPI02::filterCharacter);

        stream1.forEach(System.out::println);
    }

    @Test
    public void test06(){

        List<String> list = Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee");

        List list2 = new ArrayList();
        list2.add(11);
        list2.add(22);
        list2.add(list);

        System.out.println(list2);
    }


    /**
     * 排序
     * sorted() -- 自然排序
     * sorted(Comparator com) -- 定制排序(Comparator)
     */
    @Test
    public void test07(){
        List<String> list = Arrays.asList("ddd", "eee", "aaa", "bbb", "ccc");

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-------------------------------------");

        employees.stream()
                .sorted((e1,e2) -> {
                    if(e1.getName().equals(e2.getName())){
                        return e1.getAge()-e2.getAge();
                    }else{
                        return e1.getName().compareTo(e2.getName());
                    }
                }).forEach(System.out::println);
    }


    public static Stream<Character> filterCharacter(String str){
        List<Character> list = new ArrayList<>();

        for(Character ch : str.toCharArray()){
            list.add(ch);
        }
        return list.stream();
    }


}
