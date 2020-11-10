package com.max.learn.面试.Synchronized关键字;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @ClassName T00_AtomicInteger
 * @Auther huangX
 * @Date 2020/11/10 10:50
 * @Version 1.0
 * @Descripition 多线程数据一致性问题
 **/
public class T00_AtomicInteger {


    /**
     * 初始化原子int类型
     **/
    private static AtomicInteger m = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {

        Thread[] threads = new Thread[100];
        CountDownLatch latch = new CountDownLatch(threads.length);
//        AtomicReference<Integer> num = new AtomicReference<>(0);
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 10000; j++) {
//                    num.getAndSet(num.get() + 1);
                    m.incrementAndGet();
                }
                latch.countDown();
            });
        }

        Arrays.stream(threads).forEach((t) -> t.start());
        latch.await();
        System.out.println(m);

    }
}
