package com.max.learn.Java8新特性.lesson04;

import com.max.learn.Java8新特性.lesson01.Employee;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TestStreamAPI04 {

    public static List<Employee> employees  = Arrays.asList(
            new Employee("张三",18888.88f,28, Employee.Status.FREE),
            new Employee("黄九",13222.22f,18, Employee.Status.FREE),
            new Employee("黄九",15222.22f,18, Employee.Status.BUSY),
            new Employee("黄九",18222.22f,18, Employee.Status.FREE),
            new Employee("李四",17777.77f,27, Employee.Status.BUSY),
            new Employee("田七",14444.44f,24, Employee.Status.BUSY),
            new Employee("王八",13333.33f,23, Employee.Status.VOCATION),
            new Employee("赵六",15555.55f,25, Employee.Status.FREE),
            new Employee("王五",16666.66f,26, Employee.Status.FREE),
            new Employee("陈十",11111.11f,21, Employee.Status.VOCATION)
    );

    /**
     * 给出1,2,3,4,5 求出其平方根数组
     */
    @Test
    public void test01(){
        Integer[] nums = new Integer[]{1,2,3,4,5,6,7,8,9};
        Stream<Integer> stream = Arrays.stream(nums);
        stream.map((e) -> e * e)
                .forEach(System.out::println);
    }

    @Test
    public void test02(){
        // 求总人数
        Optional<Integer> count = employees.stream()
                .map((e)->e.getName())
                .distinct()
                .map(e -> 1)
                .reduce(Integer::sum);

        System.out.println(count.get());
    }

    /**
     * 并行流
     */
    @Test
    public void test03(){
        Instant start = Instant.now();

        long result = LongStream.rangeClosed(0, 9000000000L)
                .parallel()      // 并行流(JDK1.7写法较复杂, JDK1.8之后简化写法)
                .reduce(0, Long::sum);

        System.out.println(result);

        Instant end = Instant.now();
        System.out.println("耗费时间为:" + Duration.between(start,end).toMillis()); // 单线程 3214  多线程(并行流) 653




    }
}
