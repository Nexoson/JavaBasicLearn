package com.max.learn.thread.Lesson06;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @ClassName ReadWriteLockDemo
 * @Auther huangX
 * @Date 2020/4/19 8:51
 * @Version 1.0
 * @Descripition 手写缓存工具类(读写锁 ReentrantReadWriteLock)
 **/
public class ReadWriteLockDemo {
    /* 多个线程同时读取一个资源类没有任何问题,所以为了满足并发量,
    读取共享资源应该可以同时进行.但是如果有一个线程想去写共享资源,
    就不应该再有其它线程可以对该资源进行读或写
    总结:
    读-读  能共存
    读-写  不能共存
    写-写  不能共存
     */

    public static void main(String[] args) {

        MyCache myCache = new MyCache();

        // 多线程写
        for (int i = 1; i <= 5; i++) {
            final int num = i;
            new Thread(() -> {
                myCache.put(num + "", num + "");
            }, i + "").start();
        }

        // 多线程读
        for (int j = 1; j <= 5; j++) {
            final int num = j;
            new Thread(() -> {
                myCache.get(num + "");
            }, j + "").start();
        }

    }


    /**
     * @Author huangX
     * @Date 8:55 2020/4/19
     * @Param
     * @return
     * @Description 共享缓存
     **/
    static class MyCache {
        // 缓存必须要有 put,get,clear方法

        private volatile Map<String, Object> cache = new HashMap<>();

//        private Lock lock = new ReentrantLock(); // ReentrantLock 可以解决问题,但是读写效率都极低

        private ReadWriteLock rwLock = new ReentrantReadWriteLock();

        /**
         * 设置缓存
         **/
        public void put(String key, Object value) {
            rwLock.writeLock().lock();
            try {
                System.out.println(Thread.currentThread().getName() + "\t 正在写入:" + key);
                cache.put(key, value);
                System.out.println(Thread.currentThread().getName() + "\t 写入完成");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                rwLock.writeLock().unlock();
            }
        }


        /**
         * 读取缓存
         **/
        public void get(String key) {
            rwLock.readLock().lock();
            try {
                System.out.println(Thread.currentThread().getName() + "\t z正在读取:" + key);
                Object obj = cache.get(key);
                System.out.println(Thread.currentThread().getName() + "\t 读取完成:" + (String) obj);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                rwLock.readLock().unlock();
            }
        }


        /**
         * 缓存清空
         **/
        public void clear() {
            cache.clear();
        }

    }
}
