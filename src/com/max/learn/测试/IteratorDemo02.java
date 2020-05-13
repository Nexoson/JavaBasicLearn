package com.max.learn.测试;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName TestDemo05
 * @Auther huangX
 * @Date 2020/5/8 17:36
 * @Version 1.0
 * @Descripition iterator迭代器(多线程)
 **/
public class IteratorDemo02 {

    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ReentrantLock lock = new ReentrantLock();

        new Thread(() -> {
            lock.lock();
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                Integer integer = iterator.next();
                System.out.println(integer);
                try {
                    TimeUnit.MILLISECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.unlock();
        }, "T1").start();

        new Thread(() -> {
            lock.lock();
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                Integer integer = iterator.next();
                if (integer == 2) {
                    iterator.remove();
                }
            }
            lock.unlock();
        }, "T2").start();
    }


/*    　1.在使用iterator迭代的时候使用synchronized或者Lock进行同步
        2.使用并发容器CopyOnWriteArrayList代替ArrayList和Vector*/

}
