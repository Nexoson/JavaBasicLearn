package com.max.learn.Java8新特性.lesson01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Consumer<T> : 消费型接口
 * void accept(T t);
 *
 * Supplier<T> : 供给型接口
 * T get();
 *
 * Function<T,R> : 函数型接口
 * R apply(T t);
 *
 * Predicate<T> : 断言型接口
 * boolean  test(T t);
 *
 */
public class TestLambda04 {

    // Consumer<T> : 消费型接口
    @Test
    public void test01(){
        happy(10000.0, (m) -> System.out.println(m-50.0));
    }

    public void happy(double money, Consumer<Double> con){
           con.accept(money);
    }

    // Supplier<T> 供给型接口:
    @Test
    public void test02(){
        List<Integer> numList = getNumList(10, () -> (int) (Math.random() * 100));
        for (Integer num : numList) {
            System.out.println(num);
        }
    }

    // 需求: 产生指定个数的整数，并放入集合中
    public List<Integer> getNumList(int num, Supplier<Integer> sup){
        List<Integer> list = new ArrayList<>();
        for (int i=0; i < num; i++){
            Integer n = sup.get();
            list.add(n);
        }
        return list;
    }


    // Function<T,R> 函数型接口:
    @Test
    public void test03(){
        String s1 = strHandler("      今晚再打老虎        ", (x) -> x.trim());
        String s2 = strHandler("abc", (x) -> x.toUpperCase());
        System.out.println(s1);
        System.out.println(s2);
    }

    // 需求: 用于处理字符串
    public  String strHandler(String str, Function<String,String> fun){
        return fun.apply(str);
    }

    //Predicate<T> 断言型接口
    @Test
    public void N(){
        List<String> list = Arrays.asList("hello", "max", "lambda", "www", "ok", "show");
        List<String> strList = filterStr(list, (s) -> s.length() > 3);
        for (String str : strList){
            System.out.println(str);
        }
    }

    // 需求: 将满足条件的字符串，放入集合中
    public List<String> filterStr(List<String> list, Predicate<String> pre){
        ArrayList<String> strList = new ArrayList<>();
        for(String str : list){
            if (pre.test(str)){
                strList.add(str);
            }
        }
        return strList;
    }


}
