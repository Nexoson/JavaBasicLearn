package com.max.learn.thread.lesson06;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName CountDownLatchDemoPlus
 * @Auther huangX
 * @Date 2020/4/19 11:54
 * @Version 1.0
 * @Descripition 秦灭六国
 **/
public class CountDownLatchDemoPlus {

    public static Integer num = 6;

    public static void main(String[] args) {
        killAll();
    }

    private static void killAll() {
        CountDownLatch countDownLatch = new CountDownLatch(num);

        for (int i = 1; i <= ASEnum.values().length; i++) {
            final int num = i;
            new Thread(() -> {
                System.out.println(ASEnum.getASCountry(num).getCountry() + "\t 被灭");
                countDownLatch.countDown();
            }, ASEnum.getASCountry(num).getIndex()+"").start();
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "\t ************秦国 统一天下!");
    }
}
