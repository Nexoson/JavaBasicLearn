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
/*        // 0010 0000
        int hash = 32;
        // 0001 0000
        int n = 16;
        int i;
        int [] arr ={};
        int k = (i =(n-1) & hash);
        System.out.println(k);*/

//        System.out.println(1>>>1);
        int i = TestDemo02.tableSizeFor(13);
        System.out.println(i);

    }

    static final int tableSizeFor(int cap) {
        // 4  0000 0100
        int n = cap - 1;
        // 0000 0100 | 0000 0010  = 0000 0110  6
        n |= n >>> 1;
        // 0000 0110 | 0000 0001 = 0000 0111  7
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        System.out.println(n);
        return (n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1;
    }

    static final int tableSizeFor2(int cap) {
        int n = cap - 1;
        System.out.println("n= "+n);
        int temp = n >>> 1;
        n |= temp;
        System.out.println("n >>> 1 = " + temp);
        temp = temp >>> 2;
        System.out.println("n >>> 2 = " +temp);
        n |= temp;
        temp = temp >>> 4;
        System.out.println("n >>> 4 = " +temp);
        n |= n >>> 4;
        temp = temp >>> 8;
        System.out.println("n >>> 8 = " +temp);
        n |= n >>> 8;
        temp = temp >>> 16;
        System.out.println("n >>> 16 = " +temp);
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= 1 << 30) ? 1 << 30 : n + 1;
    }
}
