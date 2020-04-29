package com.max.learn.面试.volatile关键字;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName VolatileDemo
 * @Auther huangX
 * @Date 2020/4/13 15:07
 * @Version 1.0
 * @Descripition
 * 1.验证volatile的可见性 visibilityByVolatile
 * 2.验证volatile不保证原子性 atomicByVolatile
 * 3.验证volatile禁止指令重排
 **/
public class VolatileDemo {

    public static void main(String[] args) {

        // 验证volatile的可见性
//        visibilityByVolatile();

        // 验证volatile不保证原子性
        atomicByVolatile();

    }


    /**
     * volatile不保证原子性
     * 以及使用Atomic原子类保证原子性
     **/
    public static void atomicByVolatile(){

        MyData myData = new MyData();
        for(int i=1; i<=20; i++){
            new Thread( ()->{
                for(int j=1; j<=1000; j++){
                    myData.addSelf();
                    myData.atomicAddSelf();
                }
            },"Thread "+i).start();
        }

        // 等待上面的线程都计算完成后,再用main线程取得最终结果值
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while(Thread.activeCount() > 2){
            // 使当前线程从执行状态（运行状态）变为可执行态（就绪状态） <会放弃CPU资源,锁资源不会放弃的>
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"\t finally num value is "+myData.num);
        System.out.println(Thread.currentThread().getName()+"\t finally atomicnum value is "+myData.atomicInteger);

    }

    /**
     * volatile 可以保证可见性,及时通知其他线程,主物理内存的值已经被修改
     **/
    public static void visibilityByVolatile(){
        MyData myData = new MyData();

        // 第一个线程
        new Thread(()-> {
            System.out.println(Thread.currentThread().getName() + "\t come in");

            try {
                // 线程暂停3s
                TimeUnit.SECONDS.sleep(3);
                myData.addToSixty();
                System.out.println(Thread.currentThread().getName() + "\t update value:" + myData.num);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "thread1").start();

        // 第二个线程是main线程
        while(myData.num == 0){
            // 如果myData的num一直为0,main线程一直在这里循环
        }
        System.out.println(Thread.currentThread().getName() + "\t mission is over, num value is " + myData.num);

    }

    private static class MyData {
        // int num = 0;
        volatile int num = 0;

        public void addToSixty(){
            this.num = 60;
        }

        public void addSelf(){
            num++;
        }

        AtomicInteger atomicInteger = new AtomicInteger();
        public void atomicAddSelf(){
            atomicInteger.getAndIncrement();
        }


    }
}
