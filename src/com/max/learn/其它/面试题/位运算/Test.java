package com.max.learn.其它.面试题.位运算;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020年03月15日 13:45:00
 */
public class Test {


    public static void main(String[] args) {

        /**
         * ＆	如果相对应位都是1，则结果为1，否则为0	（A＆B），得到12，即0000 1100
         * |	如果相对应位都是 0，则结果为 0，否则为 1	（A | B）得到61，即 0011 1101
         * ^	如果相对应位值相同，则结果为0，否则为1	（A ^ B）得到49，即 0011 0001
         * 〜	按位取反运算符翻转操作数的每一位，即0变成1，1变成0。	（〜A）得到-61，即1100 0011
         * << 	按位左移运算符。左操作数按位左移右操作数指定的位数。	A << 2得到240，即 1111 0000
         * >> 	按位右移运算符。左操作数按位右移右操作数指定的位数。	A >> 2得到15即 1111
         * >>> 	按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。
         */

        /* 60 = 0011 1100 */
        int a = 60;
        /* 13 = 0000 1101 */
        int b = 13;
        int c = 0;
        /* 12 = 0000 1100 */
        c = a & b;
        System.out.println("a & b = " + c );
        /* 61 = 0011 1101 */
        c = a | b;
        System.out.println("a | b = " + c );
        /* 49 = 0011 0001 */
        c = a ^ b;
        System.out.println("a ^ b = " + c );
        /*-61 = 1100 0011 */
        c = ~a;
        System.out.println("~a = " + c );
        /* 240 = 1111 0000 */
        c = a << 2;
        System.out.println("a << 2 = " + c );
        /* 15 = 1111 */
        c = a >> 2;
        System.out.println("a >> 2  = " + c );
        /* 15 = 0000 1111 */
        c = a >>> 2;
        System.out.println("a >>> 2 = " + c );

    }

}
