package com.max.learn.volatile关键字;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName CasDemo01
 * @Auther huangX
 * @Date 2020/4/14 20:36
 * @Version 1.0
 * @Descripition 乐观锁demo01
 * CAS(Compare And Swap) 比较并替换
 **/
public class CasDemo01 {

    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                System.out.println("创建线程->" + Thread.currentThread().getName());
                // 每个线程count自增100次
                for (int j = 0; j < 1000; j++) {
                        count.getAndIncrement();
                }
            }).start();
        }

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("结果为:" + count);
        LocalDateTime end = LocalDateTime.now();
        System.out.println("耗时: " + Duration.between(start, end).toMillis());

    }


}
