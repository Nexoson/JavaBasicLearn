package com.max.learn.thread.lesson03;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName OutOfOrderDemo11
 * @Descripition 使用原子类来保证原子性问题
 * @Auther huangX
 * @Date 2020/3/29 12:23
 * @Version 1.0
 **/
public class OutOfOrderDemo11 {

    public AtomicInteger inc = new AtomicInteger();

    public void increase(){
        inc.getAndIncrement();

    }

    public static void main(String[] args) {
        final  OutOfOrderDemo11 demo11 = new OutOfOrderDemo11();
        for(int i=0; i<10; i++){
            new Thread(){
                public void run(){
                    for (int j=0; j<1000; j++){
                        demo11.increase();
                    }
                }
            }.start();
        }
        // 保证前面的线程都执行完
        while (Thread.activeCount() > 1){
            Thread.yield();
        }
        System.out.println(demo11.inc);
    }

}
