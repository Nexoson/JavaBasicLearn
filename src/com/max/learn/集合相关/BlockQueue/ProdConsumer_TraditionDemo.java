package com.max.learn.集合相关.BlockQueue;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ProdConsumer_TraditionDemo
 * @Auther huangX
 * @Date 2021/1/19 15:40
 * @Version 1.0
 * @Descripition 传统消费者 生产者模型
 * 题目: 一个初始值为0的变量,两个线程对其交替操作,一个加1一个减1, 5轮
 * 1. 线程   操作(方法)  资源类
 * 2. 判断   干活  通知
 * 3. 防止虚假唤醒
 **/
public class ProdConsumer_TraditionDemo {


    public static void main(String[] args) {

        ShareData shareData = new ShareData();

        new Thread(() -> {

        }, "t1").start();

        new Thread(() -> {

        }, "t2").start();
    }
}

/**
 * 资源类
 **/
class ShareData {
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() throws Exception {
        lock.lock();
        try {
            // 1. 判断
            while (number != 0) {
                // 等待, 不能生产
                condition.await();
            }
            // 2.干活
            number++;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            // 3.唤醒通知
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void decrement() throws Exception {
        lock.lock();
        try {
            // 1. 判断
            while (number == 0) {
                // 等待, 不能消费
                condition.await();
            }
            // 2.干活
            number--;
            System.out.println(Thread.currentThread().getName() + "\t" + number);
            // 3.唤醒通知
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

}
