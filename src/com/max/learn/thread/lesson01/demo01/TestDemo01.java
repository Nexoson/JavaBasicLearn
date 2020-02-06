package com.max.learn.thread.lesson01.demo01;

/**
 * @ClassName TestDemo01
 * @Descripition 多线程卖票
 * @Auther huangX
 * @Date 2019/9/24 21:21
 * @Version 1.0
 **/
public class TestDemo01 {

    public static void main(String[] args) {
        // 实例化站台对象,并为每一个站台取名字
        Station s1 = new Station("窗口1");
        Station s2 = new Station("窗口2");
        Station s3 = new Station("窗口3");

        // 让每一个站台开始工作
        s1.start();
        s2.start();
        s3.start();
    }
}
