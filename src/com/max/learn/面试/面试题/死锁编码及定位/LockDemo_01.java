package com.max.learn.面试.面试题.死锁编码及定位;

/**
 * @ClassName LockDemo_01
 * @Auther huangX
 * @Date 2020/12/17 8:00
 * @Version 1.0
 * @Descripition 死锁代码演示
 **/
public class LockDemo_01 {

    public static void main(String[] args) {

        String lockA = "A";
        String lockB = "B";

        new Thread(new HoldLockThread(lockA,lockB),"线程A").start();
        new Thread(new HoldLockThread(lockB,lockA),"线程B").start();

    }

}

class HoldLockThread implements Runnable{

    public String lockA;
    public String lockB;

    public HoldLockThread(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {
        synchronized (lockA){
            System.out.println(Thread.currentThread().getName()+"尝试获取: "+lockA);
            synchronized (lockB){
                System.out.println(Thread.currentThread().getName()+"尝试获取: "+lockB);
            }
        }

    }
}