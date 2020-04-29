package com.max.learn.面试.volatile关键字;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * @ClassName AtomicBooleanTest
 * @Auther huangX
 * @Date 2020/4/14 21:10
 * @Version 1.0
 * @Descripition 乐观锁demo
 **/
public class AtomicBooleanTest implements Runnable{
    private static AtomicBoolean flag = new AtomicBoolean(true);

    public static void main(String[] args) {
        AtomicBooleanTest ast = new AtomicBooleanTest();
        Thread thread1= new Thread(ast);
        Thread thread2= new Thread(ast);
        thread1.start();
        thread2.start();
    }

    @Override
    public void run() {
        System.out.println("thread: "+Thread.currentThread().getName()+"; flag:"+flag.get());
        if(flag.compareAndSet(true,false)){
            System.out.println(Thread.currentThread().getName()+" "+flag.get());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag.set(true);
        }else {
            System.out.println("重试机制 thread: "+Thread.currentThread().getName()+"; flag:"+flag.get());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            run();
        }
    }
}
