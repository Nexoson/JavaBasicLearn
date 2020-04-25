package com.max.learn.其它.面试题.位运算;

/**
 * @ClassName TestDemo01
 * @Descripition >>和>>>操作符
 * @Auther huangX
 * @Date 2019/8/18 21:36
 * @Version 1.0
 **/
public class TestDemo01 {

    public static void main(String[] args) {
        // >> 是带符号位移 无论正负  >> 1 相当于 /2  << 1 相当于 *2
        int a = -16;
        a = a >> 1;
        System.out.println(a);
        a = a << 2;
        System.out.println(a);

        int b = 16;
        b = b >> 1;
        System.out.println(b);
        b = b << 2;
        System.out.println(b);

        //  >>>：无符号右移。无论是正数还是负数，高位通通补0。s
        // >>>负数 会变接近最大的正整数

        // 1.^(亦或运算) ，针对二进制，相同的为0，不同的为1
        // 2.&（与运算） 针对二进制，只要有一个为0，就为0
        int c = 0 & 1; // 0000 0000 与 0000 0001 => 0000 0000 => 0
        int d = 10 & 2; // 0000 1010 与 0000 0010 => 0000 0010 => 1

        System.out.println(c);
        System.out.println(d);
        int e = 0 ^ 1; // 0000 0000 与 0000 0001 => 0000 0001 => 1
        int f = 8 ^ 2; // 0000 1000 与 0000 0010 => 0000 1010 => 10
        int g = 10 ^ 2; // 0000 1010 与 0000 0010 => 0000 1000 => 8
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }


}
