package com.max.learn.集合相关.BlockQueue;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName TestDemo04
 * @Auther huangX
 * @Date 2021/1/19 14:05
 * @Version 1.0
 * @Descripition 阻塞队列
 **/
public class TestDemo01 {
    public static void main(String[] args) {


        /**
         * 1.corePoolSize: 线程池中的常驻核心线程数
         * 2.maximumPoolSize: 线程池能够容纳同时执行的最大线程数,此值必须大于等于1
         * 3.keepAliveTime: 多余的空闲线程的存活时间(当前线程池数量超过corePoolSize时,当空闲时间达到keepALiveTime的值时,多余空闲线程会被销毁直到只剩下corePoolSize个线程为止)
         * 4.unit: keepAliveTime的单位
         * 5.workQueue: 任务队列,被提交但是为尚未被执行的任务
         * 6.threadFactory: 表示生成线程池中工作线程的线程工厂,用于创建线程一般用默认的即可
         * 7.handler: 拒绝策略,表示当队列满了并且工作线程大约等于线程池的最大线程数(maximumPoolSize)时如何来拒绝
         **/


//        ThreadPoolExecutor Executor = new ThreadPoolExecutor();
        // 固定线程数,执行长期的任务,性能好很多
        ExecutorService executorService1 = Executors.newFixedThreadPool(5);
        // 一个任务接一个任务执行的场景
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        // 执行很多短期异步的小程序或负载较轻的服务
        ExecutorService executorService3 = Executors.newCachedThreadPool();


    }
}
