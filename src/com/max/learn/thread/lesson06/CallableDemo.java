package com.max.learn.thread.lesson06;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName CallableDemo
 * @Auther huangX
 * @Date 2020/4/23 16:08
 * @Version 1.0
 * @Descripition FutureTask 实现了Runnable接口,同时有Callable作为入参的构造方法
 * 用其实现的线程可以有返回值并且可以抛出异常,用于实际多线程开发
 **/
public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /**
         * 多个线程中耗时最长的那个用FutureTask实现,
         * 在不影响主逻辑的情况下放在代码块后方(放在前方会进行阻塞),
         * 这样能提高多线程执行效率(43行代码放在33行执行时间差异较大)
         **/

        Instant start = Instant.now();
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
        Thread t1 = new Thread(futureTask, "AA");
        t1.start();


        int tempInt = 0;
        for (int i = 1; i <= 1000000; i++) {
            tempInt = i % 3;
            for (int j = 1; j <= 10000; j++) {
                tempInt += j * j;
            }
        }

        int num02 = futureTask.get();
        System.out.println("************ result: " + (tempInt + num02));
        Instant end = Instant.now();
        System.out.println("耗时: " + Duration.between(start, end).toMillis());
    }
}


class MyThread implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {

        System.out.println("*****************come in Callable");
        TimeUnit.SECONDS.sleep(5);
        return 1000;
    }
}