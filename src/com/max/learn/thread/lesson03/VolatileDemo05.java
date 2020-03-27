package com.max.learn.thread.lesson03;

/**
 * @ClassName VolatileDemo04
 * @Descripition 目标:使用加锁机制保障volatile修饰变量的原子性操作
 * @Auther huangX
 * @Date 2020/3/27 11:48
 * @Version 1.0
 **/
public class VolatileDemo05 {

    public static void main(String[] args) {
        // 创建一个线程任务对象
        Runnable target = new ThreadTarget01();
        // 开始100个线程对象执行这个任务
        for(int i=1; i<=100; i++){
            new Thread(target,"线程"+i+" ").start();
        }

    }

}

// 线程任务类
class ThreadTarget01 implements Runnable{
    // 定义一个共享变量(volatile可省略)
    private volatile  int count = 0;

    @Override
    public void run() {
        synchronized (ThreadTarget01.class){
            for (int i=1; i<=10000; i++){
                count++;
                System.out.println(Thread.currentThread().getName()+"count ===>>"+count);
            }
        }
    }
}
