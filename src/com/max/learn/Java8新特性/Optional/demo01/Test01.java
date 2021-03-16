package com.max.learn.Java8新特性.Optional.demo01;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className Test01
 * @date 2021/3/9 17:18
 * @desc
 **/
public class Test01 {

    public static void main(String[] args) {
        // 对象判空, 返回其中一个字段
        Student stu = new Student("周星星", 18, "男");
//        System.out.println(getGender(null));
//        System.out.println(getGenderByOptional(null));
//        printName(stu);
//        filter(stu);

//        Optional<Integer> age = getAgeByMap(stu);

        Optional<Integer> age = getAgeByFaltMap(stu);
        System.out.println(age.get().toString());

    }

    public static String getGender(Student student) {
        if (Objects.isNull(student)) {
            return "unKnow";
        }
        return student.getGender();
    }

    public static String getGenderByOptional(Student student) {
        return Optional.ofNullable(student).map(u -> u.getGender()).orElse("unKnow");
    }

    /**
     * ifPresent()方法用于判断包装对象的值是否非空
     */
    public static void printName(Student student) {
        Optional.ofNullable(student).ifPresent(u -> System.out.println("The student name is : " + u.getName()));
    }

    /**
     * filter() 方法接受参数为Predicate对象，用于对Optional对象进行过滤，如果符合Predicate的条件，返回Optional对象本身，否则返回一个空的Optional对象
     */
    public static void filter(Student student) {
        Optional.ofNullable(student).filter(e -> e.getAge() > 19).ifPresent(u -> System.out.println("The student name is: " + u.getName()));
    }

    /**
     * map()方法的参数为Function（函数式接口）对象，map()方法将Optional中的包装对象用Function函数进行运算，并包装成新的Optional对象（包装对象的类型可能改变）
     */
    public static Optional<Integer> getAgeByMap(Student stu) {
        return Optional.ofNullable(stu).map(u -> u.getAge());
    }

    /**
     * flatMap()跟map()方法不同的是，入参Function函数的返回值类型为Optional<U>类型，而不是U类型，这样flatMap()能将一个二维的Optional对象映射成一个一维的对象
     */
    public static Optional<Integer> getAgeByFaltMap(Student stu) {
        return Optional.ofNullable(stu).flatMap(u -> Optional.ofNullable(u.getAge()));
    }


    /**
     * orElse()方法功能比较简单，即如果包装对象值非空，返回包装对象值，否则返回入参other的值（默认值）
     **/
    public static String getGenderByElse(Student stu) {
        return Optional.ofNullable(stu).map(u -> u.getGender()).orElse("unknow");
    }

    /**
     * orElseGet()方法与orElse()方法类似，区别在于orElseGet()方法的入参为一个Supplier对象，用Supplier对象的get()方法的返回值作为默认值
     **/
    public static String getGenderByElseGet(Student student) {
        return Optional.ofNullable(student).map(u -> u.getGender()).orElseGet(() -> "unknow");
    }

    /**
     * orElseThrow()方法其实与orElseGet()方法非常相似了，入参都是Supplier对象，只不过orElseThrow()的Supplier对象必须返回一个Throwable异常，并在orElseThrow()中将异常抛出
     **/
    public static String getGenderByElseThrow(Student student)
    {
        return Optional.ofNullable(student).map(u -> u.getGender()).orElseThrow(() -> new RuntimeException("unknow"));
    }


    @Test
    public void testFaltMap() {
        // 将集合中的字符串中单词提取出来，不考虑特殊字符
        List<String> words = Arrays.asList("hello C", "hello C++", "hello Java", "hello PHP", "hello Python", "hello JavaScript,", "hello Objective-C", "hello Swift");
        List<String> collect = words.stream()
                // 将单词按空格分开,返回Stream<String[]>类型的数据结构
                .map(word -> word.split(" "))
                // 将Stream<String[]> 转换成Stream<String>
                .flatMap(Arrays::stream)
                // 去重
//                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

    }


}
