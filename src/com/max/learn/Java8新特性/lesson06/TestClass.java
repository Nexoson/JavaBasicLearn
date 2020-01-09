package com.max.learn.Java8新特性.lesson06;

import org.junit.Test;

public class TestClass {

    @Test
    public void test01(){
        SubClass sb = new SubClass();
        System.out.println(sb.getName());

        MyFun01.show();

    }

    @Test
    public void test02(){
        PupClass pup = new PupClass();
        System.out.println(pup.getName());

    }
}
