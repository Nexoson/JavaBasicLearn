package com.max.learn.测试;

import org.junit.Test;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName TestDemo05.java
 * @Description TODO
 * @createTime 2021年05月26日 22:39:00
 */
public class TestDemo05 {
    public static void main(String[] args) {

//        test01();
//        test02();
        test03();
    }

    @Test
    public static void test01(){
        int a = 0;
        for (int i = 0; i < 99; i++) {
            a = a ++;
        }
        System.out.println(a);
    }

    @Test
    public static void test02(){
        int b = 0;
        for (int i = 0; i < 99; i++) {
            b = ++ b;
        }
        System.out.println(b);
    }

    @Test
    public static void test03(){
        Integer a = 0;
        int b = 0;
        for (int i = 0; i < 99; i++) {
            a = a ++;
            b = a ++;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
