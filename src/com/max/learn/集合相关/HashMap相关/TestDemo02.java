package com.max.learn.集合相关.HashMap相关;

/**
 * @ClassName TestDemo02
 * @Auther huangX
 * @Date 2020/4/10 10:44
 * @Version 1.0
 * @Descripition TODO
 **/
public class TestDemo02 {

    public static void main(String[] args) {
        // 0010 0000
        int hash = 32;
        // 0001 0000
        int n = 16;
        int i;
        int [] arr ={};
        int k = (i =(n-1) & hash);
        System.out.println(k);


    }
}
