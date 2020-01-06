package com.max.learn.Java8新特性.lesson03;

import com.max.learn.Java8新特性.lesson01.Employee;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

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

    /**
     * 归约
     * reduce(T identity, BinaryOperator) / reduce(BinaryOperator) -- 可以将流中的元素反复结合起来,得到一个值
     */
    @Test
    public void test03(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer sum = list.stream()
                .reduce(0, (x, y) -> x + y);
        System.out.println(sum);
        System.out.println("----------------------------------------");

        Optional<Float> op = employees.stream()
                .map(Employee::getSalary)
                .reduce(Float::sum);
        System.out.println(op.get());
    }

    /**
     * 收集
     * collect--将流转化为其它形式,接收一个Collector接口的实现,用于给Stream中元素做汇总的方法
     */
    @Test
    public void test04(){
        List<String> list = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
        System.out.println("----------------------------------------");
        Set<String> set = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
        System.out.println("----------------------------------------");
        HashSet<String> hs = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.toCollection(HashSet::new));
        hs.forEach(System.out::println);
    }

    @Test
    public void test05(){
        // 总数
        Long count = employees.stream()
                .collect(Collectors.counting());
        System.out.println(count);
        System.out.println("----------------------------------------");

        // 平均值
        Double avg = employees.stream()
                .collect(Collectors.averagingDouble(Employee::getSalary));
        System.out.println(avg);

        System.out.println("----------------------------------------");

        // 总和
        Double sum = employees.stream()
                .collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(sum);

        System.out.println("----------------------------------------");
        // 最大值
        Optional<Employee> max = employees.stream()
                .collect(Collectors.maxBy((e1, e2) -> Float.compare(e1.getSalary(), e2.getSalary())));
        System.out.println(max.get());
        System.out.println("----------------------------------------");

        Optional<Float> min = employees.stream()
                .map(Employee::getSalary)
                .collect(Collectors.minBy(Float::compare));
        System.out.println(min.get());
        System.out.println("----------------------------------------");
    }

    // 分组
    @Test
    public void test06(){
        Map<Employee.Status, List<Employee>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getStatus));
        map.keySet().forEach(System.out::println);
        System.out.println(map);
    }

    // 多级分组
    @Test
    public void test07(){
        Map<Employee.Status, Map<String, List<Employee>>> map = employees.stream()
                .collect(Collectors.groupingBy(Employee::getStatus, Collectors.groupingBy((e) -> {
                    if (e.getAge() <= 35) {
                        return "青年";
                    } else if (e.getAge() <= 50) {
                        return "中年";
                    } else {
                        return "老年";
                    }
                })));

        System.out.println(map);
    }

    // 分区
    @Test
    public void test08(){
        Map<Boolean, List<Employee>> map = employees.stream()
                .collect(Collectors.partitioningBy((e) -> e.getSalary() > 12222.0));
        System.out.println(map);
    }

    @Test
    public void test09(){
        DoubleSummaryStatistics dss = employees.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(dss.getCount());
        System.out.println(dss.getAverage());
        System.out.println(dss.getSum());
        System.out.println(dss.getMax());
        System.out.println(dss.getMin());
    }

    @Test
    public void test10(){
        // 首尾非必要参数
        String str = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(",", "首 ", " 尾"));
        System.out.println(str);

    }
}
