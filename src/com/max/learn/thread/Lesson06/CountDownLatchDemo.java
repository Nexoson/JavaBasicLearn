package com.max.learn.thread.Lesson06;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName CountDownLatchDemo
 * @Auther huangX
 * @Date 2020/4/19 11:10
 * @Version 1.0
 * @Descripition CountDownLatch 火箭倒计时
 **/
public class CountDownLatchDemo {

    public static Integer num = 6;

    public static void main(String[] args) {
        closeDoor();
    }



    /**
     * @Author huangX
     * @Date 11:19 2020/4/19
     * @Param
     * @return
     * @Description 班长锁门
     **/
    private static void closeDoor() {
        CountDownLatch countDownLatch = new CountDownLatch(num);

        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                System.out.println("同学" + Thread.currentThread().getName() + "\t 上完自习,离开教室");
                countDownLatch.countDown();
            }, String.valueOf(i)).start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "\t ************班长最后关门走人");
    }
}
