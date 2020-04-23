package com.max.learn.thread.lesson06;

import java.time.LocalTime;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName ProdConsumerBlockQueneDemo
 * @Auther huangX
 * @Date 2020/4/23 13:44
 * @Version 1.0
 * @Descripition volatile/CAS/atomicInteger/BlockQueue/线程交互/原子引用
 **/
public class ProdConsumerBlockQueneDemo {

    public static void main(String[] args) {

        MyResource myResource = new MyResource(new ArrayBlockingQueue<>(10));

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t 生产线程启动");
            try {
                myResource.myProd();
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Prod").start();

        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t 消费线程启动");
            try {
                myResource.myConsumer();
                System.out.println();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Consumer").start();

        // 暂停一会儿线程
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println();

        System.out.println("5秒钟到,Boss叫停活动");
        myResource.stop();
    }

}


class MyResource {

    // 默认开启, 进行生产+消费
    private volatile boolean flag = true;
    private AtomicInteger atomicInteger = new AtomicInteger();
    BlockingQueue<String> blockingQueue = null;

    public MyResource(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
        System.out.println(blockingQueue.getClass().getName());
    }

    public void myProd() throws InterruptedException {
        String data = null;
        boolean retValue;
        while (flag) {
            data = atomicInteger.incrementAndGet() + "";
            retValue = blockingQueue.offer(data, 2L, TimeUnit.SECONDS);
            if (retValue) {
                System.out.println(LocalTime.now() + " " + Thread.currentThread().getName() + "\t 插入队列" + data + "成功");
            } else {
                System.out.println(LocalTime.now() + " " + Thread.currentThread().getName() + "\t 插入队列" + data + "失败");
            }
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println(LocalTime.now() + " " + Thread.currentThread().getName() + "\t 大老板叫停了, flag=false,生产动作结束");
    }


    public void myConsumer() throws InterruptedException {
        String result = null;
        while (flag) {
            result = blockingQueue.poll(2L, TimeUnit.SECONDS);

            if (null == result || result.equalsIgnoreCase("")) {
                flag = false;
                System.out.println(LocalTime.now() + " " + Thread.currentThread().getName() + "\t 超过2秒钟没有取到蛋糕,消费者退出");
                System.out.println();
                System.out.println();
                return;
            }
            System.out.println(LocalTime.now() + " " + Thread.currentThread().getName() + "\t 消费队列" + result + "成功");
        }

    }

    public void stop() {
        this.flag = false;
    }
}

