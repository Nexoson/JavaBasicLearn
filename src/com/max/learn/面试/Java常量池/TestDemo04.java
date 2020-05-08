package com.max.learn.面试.Java常量池;

/**
 * @ClassName IteratorDemo01
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/18 22:48
 * @Version 1.0
 **/
public class TestDemo04 {
    public static void main(String[] args) {
        Integer i1 = 40;
        Integer i2 = 40;
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);

        System.out.println("i1=i2   " + (i1 == i2));
        System.out.println("i1=i2+i3   " + (i1 == i2 + i3));
        System.out.println("i1=i4   " + (i1 == i4));
        System.out.println("i4=i5   " + (i4 == i5));
        System.out.println("i4=i5+i6   " + (i4 == i5 + i6));
        System.out.println("40=i5+i6   " + (40 == i5 + i6));

        // true
        // true
        // false
        // false
        // false  结果为true 因为== 两边会拆箱成数值相加再进行比较
        // true
    }
}
