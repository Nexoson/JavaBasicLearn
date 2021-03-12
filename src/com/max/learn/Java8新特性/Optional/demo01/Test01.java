package com.max.learn.Java8新特性.Optional.demo01;

import java.util.Objects;
import java.util.Optional;

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
        Optional<Integer> age = getAge(stu);
        Integer integer = age.get();
        System.out.println(integer);
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

    /**ifPresent*/
    public static void printName(Student student){
        Optional.ofNullable(student).ifPresent(u ->  System.out.println("The student name is : " + u.getName()));
    }

    /**filter()*/
    public static void filter(Student student){
        Optional.ofNullable(student).filter(e -> e.getAge()> 19).ifPresent( u -> System.out.println("The student name is: "+ u.getName()));
    }

    /**map()*/
    public static Optional<Integer> getAge(Student stu){
        return Optional.ofNullable(stu).map(u -> u.getAge());
    }


}
