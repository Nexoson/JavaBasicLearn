package com.max.learn.thread.Lesson06;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName ReenterLockDemo
 * @Auther huangX
 * @Date 2020/4/18 10:51
 * @Version 1.0
 * @Descripition TODO
 **/
public class ReenterLockDemo {

     /*
     可重入锁(递归锁)  指的同一线程外层函数获得锁之后,
     内层递归函数仍能获取该锁的代码,
     在同一个线程在外层方法获取锁的时候,
     在进入内层方法会自动获取锁.
     也就是锁线程可以进入任何一个它已经拥有的锁所同步着的代码块

     简单来说,多重同步方法或者代码块嵌套,最外层已经获取锁资源,
     则该锁资源可以重复使用.
     */

    public static void main(String[] args) {
        Phone phone = new Phone();
        new Thread(() -> {
            phone.sendMsg();
        }, "T1").start();

        new Thread(() -> {
            phone.sendMsg();
        }, "T2").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println();

        Thread t3 = new Thread(phone,"t3");
        Thread t4 = new Thread(phone,"t4");
        t3.start();
        t4.start();
    }

}


class Phone implements Runnable {

    public synchronized void sendMsg() {
        System.out.println(Thread.currentThread().getName() + "\t invoked sendMsg()");
        sendEmail();
    }

    public synchronized void sendEmail() {
        System.out.println(Thread.currentThread().getName() + "\t invoked sendEmail()");
    }

    @Override
    public void run() {
        sing();
    }

    public void sing() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.lock();

        try {
            System.out.println(Thread.currentThread().getName() + "\t invoked sing()");
            dance();
        } finally {
            lock.unlock();
        }
    }

    public void dance() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t invoked dance()");
            rap();
        } finally {
            lock.unlock();
        }
    }

    public void rap() {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t invoked rap()");
        } finally {
            lock.unlock();
        }
    }
}