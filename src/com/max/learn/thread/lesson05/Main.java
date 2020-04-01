package com.max.learn.thread.lesson05;

public class Main {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        int num = 0;
        for (int i = 0; i <= 100000000; i++) {
                    if (i == 100000000){
                        num = i;
                    }
        }
        long endTime = System.currentTimeMillis();
        System.out.println(num);
        //输出程序运行时间
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
    }
}
