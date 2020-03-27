package com.max.learn.thread.lesson03;

/**
 * @ClassName VolatileDemo04
 * @Descripition 验证volatile关键字无法保证原子性
 * @Auther huangX
 * @Date 2020/3/27 11:48
 * @Version 1.0
 **/
public class VolatileDemo04 {

    public static void main(String[] args) {
        // 创建一个线程任务对象
        Runnable target = new ThreadTarget();
        // 开始100个线程对象执行这个任务
        for(int i=1; i<100; i++){
            new Thread(target,"线程"+i+" ").start();
        }

    }

}

// 线程任务类
class ThreadTarget implements Runnable{
    // 定义一个共享变量
    private volatile  int count = 0;

    @Override
    public void run() {
        for (int i=1; i<=10000; i++){
            count++;
            System.out.println(Thread.currentThread().getName()+"count ===>>"+count);
        }

    }
}
