package com.max.learn.static关键字.案例02;

/**
 * @ClassName Test02
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/17 10:29
 * @Version 1.0
 **/
public class Test02 {

    public static void main(String[] args) {
 /*       Integer num = new Integer(8);
        OrderOfObjectsAfterGC.printAddresses("1",num);
        num = 9;
        OrderOfObjectsAfterGC.printAddresses("2",num);
        num = new Integer(8);
        OrderOfObjectsAfterGC.printAddresses("3",num);
        num = 8;
        OrderOfObjectsAfterGC.printAddresses("4",num);*/

        Integer i1 = new Integer(97);
        OrderOfObjectsAfterGC.printAddresses("1", i1);
        Integer i2 = new Integer(97);
        OrderOfObjectsAfterGC.printAddresses("2", i2);

        System.out.println(i1 == i2); //false
        System.out.println("********^^^^^*******");


        Integer i3 = new Integer(197);
        OrderOfObjectsAfterGC.printAddresses("i3", i3);
        Integer i4 = new Integer(197);
        OrderOfObjectsAfterGC.printAddresses("i4", i4);
        System.out.println(i3 == i4); // false
        System.out.println("********^^^^^*******");

        Integer i5 = 97;
        Integer i6 = 97;
        OrderOfObjectsAfterGC.printAddresses("i5", i5);
        OrderOfObjectsAfterGC.printAddresses("i6", i6);
        System.out.println(i5 == i6);
        System.out.println("********^^^^^*******");


        Integer i7 = 197;
        int i9 =197;
        Integer i8 = 197;
        OrderOfObjectsAfterGC.printAddresses("i9", i9);
        OrderOfObjectsAfterGC.printAddresses("i7", i7);
        OrderOfObjectsAfterGC.printAddresses("i8", i8);
        System.out.println(i7 == i8); // false
        System.out.println(i7 == i9);
        System.out.println("********^^^^^*******");
    }
}
