package com.max.learn.Java8新特性.lesson01;

import org.junit.Test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.function.Consumer;

/**
 * lambda02测试
 */
public class TestLambda02 {

    @Test
    public void test01(){
        // jdk1.7前， 必须是final
        int num = 0;

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world !" + num);
            }
        };
    }

    @Test
    public void test02(){
        Consumer<String> con = (x) -> System.out.println(x);
        con.accept("show time");
    }

    @Test
    public void test03(){
        Comparator<Integer> com = (x,y) -> {
            System.out.println("函数式接口");
            return Integer.compare(x,y);
        };
    }

    @Test
    public void test04(){
        Comparator<Integer> com = (x,y) -> Integer.compare(x,y);
    }

    @Test
    public void test05(){
       String[] strs = {"aaa","bbb","ccc"};
       show(new HashMap<>());
    }
    public void show(HashMap<Object, Object> objectObjectHashMap) {
    }

    @Test
    public void test06(){
        Integer num = operation(100, (x) -> x * x);
        System.out.println(num);
    }

    public Integer operation(Integer num, MyFun mf){
        return mf.getValue(num);
    }
}
