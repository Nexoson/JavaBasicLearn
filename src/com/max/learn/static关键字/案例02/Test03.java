package com.max.learn.static关键字.案例02;

/**
 * @ClassName Test03
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/17 15:33
 * @Version 1.0
 **/
public class Test03 {

    public static void main(String[] args) {

        Integer num1 = 129;
        Integer num2 = new Integer(129);
        int num3 = 129;

        Integer num4 = 127;
        Integer num5 = 127;
        Integer num6 = 128;
        Integer num7 = 128;

        System.out.println(num1 == num2);
        System.out.println(num1 == num3);
        System.out.println();
        System.out.println(num4 == num5);
        System.out.println(num6 == num7);
    }
}
