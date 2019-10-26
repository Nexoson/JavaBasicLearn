package com.max.learn.String相关.面试题;

import org.junit.Test;

/**
 * @ClassName TestDemo
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/7/23 23:27
 * @Version 1.0
 **/
public class TestDemo {

    public static void main(String[] args) {
    }

    private static String getHello() {
        return "hello";
    }

    @Test
    public void test01(){
        String a = "hello2";
        String b = "hello" + 2;
        System.out.println((a == b)); // true
    }

    @Test
    public void test02(){
        String a = "hello2";
        String b = "hello";
        String c = b + 2;
        System.out.println((a == c)); // false
    }

    @Test
    public void test03(){
        String a = "hello2";
        final String b = "hello";
        String c = b + 2;
        System.out.println((a == c)); // true
    }

    @Test
    public void test04(){
        String a = "hello2";
        final String b = getHello();
        String c = b + 2;
        System.out.println((a == c)); // false
    }

    @Test
    public void test05(){
        String a = "hello";
        String b =  new String("hello");
        String c =  new String("hello");
        // 一个字符串，内容与此字符串相同，但一定取自具有唯一字符串的池。
        String d = b.intern();

        System.out.println(a==b); // false
        System.out.println(b==c); // false
        System.out.println(b==d); // false
        System.out.println(a==d); // true
    }

    @Test
    public void test06(){
        // 创建了多少个对象？ 1个
        String str = new String("abc");
        // http://rednaxelafx.iteye.com/blog/774673/
    }

    public void test07(){
        // 下面这段代码1）和2）的区别是什么？
        String str1 = "I";
        //str1 += "love"+"java";        1)
        str1 = str1+"love"+"java";      //2)

        // 1)效率更高 1）中的"love"+"java"在编译期间会被优化成"lovejava"，而2）中的不会被优化
    }
}
