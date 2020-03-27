package com.max.learn.thread.lesson03;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName VolatileDemo04
 * @Descripition 目标:使用原子类来实现变量修改的原子性操作.
 * @Auther huangX
 * @Date 2020/3/27 11:48
 * @Version 1.0
 **/
public class VolatileDemo06 {

    public static void main(String[] args) {
        // 创建一个线程任务对象
        Runnable target = new ThreadTarget02();
        // 开始100个线程对象执行这个任务
        for(int i=1; i<=100; i++){
            new Thread(target,"线程"+i+" ").start();
        }

    }

}

// 线程任务类
class ThreadTarget02 implements Runnable{
    // 提供一个原子类
    private AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    public void run() {
            for (int i=1; i<=10000; i++){
                System.out.println(Thread.currentThread().getName()+"count ===>>"+atomicInteger.incrementAndGet());
            }
    }
}
