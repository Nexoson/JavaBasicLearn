package com.max.learn.测试;

/**
 * @ClassName TestDemo04
 * @Auther huangX
 * @Date 2020/5/30 23:00
 * @Version 1.0
 * @Descripition Java只有值传递
 **/
public class TestDemo04 {

    public static int temp = 66;

    public static void main(String[] args) {

        test01(temp);
//        test02();
        System.out.println(temp);
    }

    public static void test01(int abc) {
        abc = 88;
        System.out.println(abc);
    }

    public static void test02() {
        temp = 88;
        System.out.println(temp);
    }

}
