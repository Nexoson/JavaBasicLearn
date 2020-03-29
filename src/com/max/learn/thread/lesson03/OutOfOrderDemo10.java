package com.max.learn.thread.lesson03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName OutOfOrderDemo10
 * @Descripition 配合lock使用 保证原子性
 * @Auther huangX
 * @Date 2020/3/29 12:20
 * @Version 1.0
 **/
public class OutOfOrderDemo10 {

    public volatile int inc = 0;
    Lock lock = new ReentrantLock();

    public void increase(){
        lock.lock();
        try {
            inc++;
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final  OutOfOrderDemo10 demo10 = new OutOfOrderDemo10();
        for(int i=0; i<10; i++){
            new Thread(){
                public void run(){

                    for (int j=0; j<1000; j++){
                        demo10.increase();
                    }
                    // System.out.println(Thread.currentThread().getName()+"(开始)inr ="+demo09.inc);

                }
            }.start();
        }
        // 保证前面的线程都执行完
        while (Thread.activeCount() > 1){
            Thread.yield();
        }
        System.out.println(demo10.inc);
    }

}
