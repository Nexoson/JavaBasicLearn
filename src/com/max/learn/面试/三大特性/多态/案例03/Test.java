package com.max.learn.面试.三大特性.多态.案例03;

/**
 * @ClassName Test
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/15 20:16
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        Wine wine1 = new BYB("白云边");
        Wine wine2 = new JNC("剑南春");
        wine1.drink();
        wine2.drink();
    }
}
