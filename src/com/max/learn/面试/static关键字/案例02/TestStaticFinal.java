package com.max.learn.面试.static关键字.案例02;

import java.util.ArrayList;

/**
 * @ClassName TestStaticFinal
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/17 10:06
 * @Version 1.0
 **/
public class TestStaticFinal {
    private static final String strStaticFinalVar = "aaa";
    private static String strStaticVar = null;
    private final String strFinalVar = null;
    private static final int intStaticFinalVar = 0;
    private static final Integer integerStaticFinalVar = new Integer(8);
    private static final ArrayList<String> alStaticFinalVar = new ArrayList<String>();

    private void test(){
        System.out.println("-------------值处理前----------\r\n");
        System.out.println("strStaticFinalVar=" +strStaticFinalVar + "\r\n");
        System.out.println("strStaticVar=" +strStaticVar + "\r\n");
        System.out.println("strFinalVar=" +strFinalVar + "\r\n");
        System.out.println("intStaticFinalVar=" +intStaticFinalVar + "\r\n");
        System.out.println("integerStaticFinalVar=" +integerStaticFinalVar + "\r\n");
        System.out.println("alStaticFinalVar=" +alStaticFinalVar + "\r\n");
        //strStaticFinalVar="哈哈哈哈";        //错误，final表示终态,不可以改变变量本身.
        strStaticVar = "哈哈哈哈";               //正确，static表示类变量,值可以改变.
        //strFinalVar="呵呵呵呵";                    //错误, final表示终态，在定义的时候就要初值（哪怕给个null），一旦给定后就不可再更改。
        //intStaticFinalVar=2;                        //错误, final表示终态，在定义的时候就要初值（哪怕给个null），一旦给定后就不可再更改。
        //integerStaticFinalVar=new Integer(8);            //错误, final表示终态，在定义的时候就要初值（哪怕给个null），一旦给定后就不可再更改。
        alStaticFinalVar.add("aaa");       //正确，容器变量本身没有变化，但存放内容发生了变化。这个规则是非常常用的，有很多用途。
        alStaticFinalVar.add("bbb");       //正确，容器变量本身没有变化，但存放内容发生了变化。这个规则是非常常用的，有很多用途。
        System.out.println("-------------值处理后----------\r\n");
        System.out.println("strStaticFinalVar=" +strStaticFinalVar + "\r\n");
        System.out.println("strStaticVar=" +strStaticVar + "\r\n");
        System.out.println("strFinalVar=" +strFinalVar + "\r\n");
        System.out.println("intStaticFinalVar=" +intStaticFinalVar + "\r\n");
        System.out.println("integerStaticFinalVar=" +integerStaticFinalVar + "\r\n");
        System.out.println("alStaticFinalVar=" +alStaticFinalVar + "\r\n");
    }
    // aaa 0 8 []  aaa 哈哈哈哈 0 8 ['aaa','bbb']

    public static void main(String[] args) {
        new TestStaticFinal().test();
    }


}
