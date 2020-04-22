package com.max.learn.thread.lesson06;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 内部资源类
 */
class ShareData {

    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() {
        lock.lock();
        try {
            // 1.判断
            while (number != 0) {
                // 等待,不能生产
                condition.await();
            }
            // 2.干活
            number++;
            System.out.println(Thread.currentThread().getName() + "\t" + number);

            // 3. 通知唤醒
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void decrement() {
        lock.lock();

        try {
            // 1.判断
            while (number == 0) {
                // 等待,不能声场
                condition.await();
            }
            // 2.干活
            number--;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            // 3.通知唤醒
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }


}

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName ProdConsumerTraditionDemo.java
 * @Description
 * 题目: 一个初始值为零的变量,两个线程对其交替操作,一个加1,一个减1,来5轮
 * 1. 线程    操作(方法)   资源类
 * 2. 判断    干活         通知
 *
 * 虚假唤醒主要是因为if的使用
 * @createTime 2020年04月22日 15:47:00
 */
public class ProdConsumerTraditionDemo {

    public static void main(String[] args) {

        ShareData shareData = new ShareData();

        new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                try {
                    shareData.increment();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "A").start();


        new Thread(() -> {

            for (int i = 1; i <= 5; i++) {
                try {
                    shareData.decrement();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }, "B").start();

    }

}
