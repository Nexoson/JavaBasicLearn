package com.max.learn.thread.lesson06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName MythreadPoolDemo
 * @Auther huangX
 * @Date 2020/4/23 20:28
 * @Version 1.0
 * @Descripition 第四种获得/使用Java多线程的方式,线程池
 **/
public class MythreadPoolDemo {

    public static void main(String[] args) {

        // 初始化5个固定线程的线程池
        // ExecutorService threadPool = Executors.newFixedThreadPool(5);
        // 只有一个线程的线程池
//         ExecutorService threadPool = Executors.newSingleThreadExecutor();
        // N个线程的线程池
        ExecutorService threadPool = Executors.newCachedThreadPool();

        // 模拟10个用户来办理业务,每个用户就是一个来自外部的请求线程
        try {
            for (int i = 1; i <= 1000; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t 办理业务");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }

}
