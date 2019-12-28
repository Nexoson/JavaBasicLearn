package com.max.learn.Java8新特性.lesson01;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * lambda03测试
 */
public class TestLambda03 {

    List<Employee> emps = Arrays.asList(
            new Employee("张三",9999.99f,18),
            new Employee("李四",19999.99f,59),
            new Employee("王五",12999.99f,28),
            new Employee("赵六",999.99f,8),
            new Employee("田七",19999.99f,38),
            new Employee("孙八",29999.99f,48)
    );

    @Test
    public void test01(){
        Collections.sort(emps,(e1,e2) -> {
            if(e1.getAge() == e2.getAge()){
                return e1.getName().compareTo(e2.getName());
            }else{
                return -Integer.compare(e1.getAge(),e2.getAge());
            }
        });
        for (Employee emp : emps) {
            System.out.println(emp);
        }
    }

    @Test
    public void test02(){
        String s1 = strHandler("\t\t\t\t\t\t 今晚打老虎呀!    ", (str) -> str.trim());
        String s2 = strHandler("abcdefgh", (str) -> str.toUpperCase());
        String s3 = strHandler("abcdefgh", (str) -> str.substring(2,5));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

    @Test
    public void test03(){
        op(55L,45L, (x,y)-> x + y);

        op(55L,45L, (x,y)-> x * y);

    }

    // 需求 用于处理字符串
    public String  strHandler(String str, MyFunction mf){
        return mf.getValue(str);
    }

    // 需求: 对于两个Long型数据进行处理
    public void op(Long l1, Long l2, MyFunction02<Long, Long> mf){
        System.out.println(mf.getValue(l1,l2));
    }
}
