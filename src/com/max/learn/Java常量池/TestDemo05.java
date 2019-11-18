package com.max.learn.Java常量池;

import com.max.learn.static关键字.案例02.OrderOfObjectsAfterGC;

/**
 * @ClassName TestDemo05
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/18 22:52
 * @Version 1.0
 **/
public class TestDemo05 {
    public static void main(String[] args) {
        Integer i1 = 400;
        Integer i2 = 400;
        Integer i3 = 0;
        Integer i4 = new Integer(400);
        Integer i5 = new Integer(400);
        Integer i6 = new Integer(0);
        Integer i7 = 400;
        Integer i8 = 133;
        OrderOfObjectsAfterGC.printAddresses("Integer",i8);
        int i9 = 133;
        int i10 = 133;
        OrderOfObjectsAfterGC.printAddresses("i1",i1);
        OrderOfObjectsAfterGC.printAddresses("i2",i2);

        System.out.println("i1=i2  " + (i1 == i2));
        System.out.println("i1=i2+i3  " + (i1 == i2 + i3));
        System.out.println("i1=i4  " + (i1 == i4));
        System.out.println("i4=i5  " + (i4 == i5));
        System.out.println("i4=i5+i6  " + (i4 == i5 + i6));
        System.out.println("400=i5+i6  " + (400 == i5 + i6));
        System.out.println("i4=i7  "+ (i4 == i7+0));
        System.out.println("i8 = i9 "+ (i8 == i9));



        /**
         * 小结: 有一边加运算符的会先进行拆箱操作, == 最后比较的是数值大小
         * 两个变量直接进行 == 比较的是内存地址
         **/

    }
}
