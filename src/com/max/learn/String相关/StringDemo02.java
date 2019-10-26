package com.max.learn.String相关;

import org.junit.Test;

/**
 * @ClassName StringDemo02
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/7/23 23:14
 * @Version 1.0
 **/
public class StringDemo02 {

    public static void main(String[] args) {
        String string = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            string += "hello";
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    @Test
    public void testStringBuffer(){
        StringBuffer str = new StringBuffer();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            str.append("hello");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }


    @Test
    public void testStringBuilder(){
        StringBuilder str = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            str.append("hello");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}
