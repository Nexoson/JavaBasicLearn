package com.max.learn.面试.面试题.不可变对象;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName MainTest02
 * @Auther huangX
 * @Date 2020/5/20 14:27
 * @Version 1.0
 * @Descripition 演示容器丢失元素
 **/
public class MainTest02 {

    public static void main(String[] args) {

        Person jack = new Person();
        jack.setAge(10);
        jack.setIdentityCardID("42118220090315234X");

        Set<Person> personSet = new HashSet<>();
        personSet.add(jack);

        jack.setAge(11);
        System.out.println(personSet.contains(jack));

        // person重写了hashcode()方法,
        // HashSet 底层是 hashMap, 需要通过hash(obj)来查找元素,因为hashcode的发生改变,所以匹配不到原来的元素
    }

}
