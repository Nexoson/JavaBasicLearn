package com.max.learn.thread.Lesson06;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName SemaphoreDemo
 * @Auther huangX
 * @Date 2020/4/20 11:29
 * @Version 1.0
 * @Descripition Semaphore 是一个计数信号量，必须由获取它的线程释放。
 * 常用于限制可以访问某些资源的线程数量，例如通过 Semaphore 限流。
 * Semaphore 只有3个操作：
 *
 * 1.初始化
 * 2.增加
 * 3.减少
 **/
public class SemaphoreDemo {

    public static void main(String[] args) {

        // 模拟3个停车位
        Semaphore semaphore = new Semaphore(3);

        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "\t 抢到车位");
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println(Thread.currentThread().getName() + "\t 停车3秒后离开车位");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            }, String.valueOf(i)).start();
        }
    }
}
