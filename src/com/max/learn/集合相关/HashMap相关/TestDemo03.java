package com.max.learn.集合相关.HashMap相关;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @ClassName TestDemo03
 * @Auther huangX
 * @Date 2021/1/19 10:46
 * @Version 1.0
 * @Descripition 复现多线程环境下, 产生的循环链表问题
 **/
public class TestDemo03 {

    public static void main(String[] args) {
        // 1.定义容器
        Map<String, Integer> map = new HashMap<String, Integer>(1024);

        // 2.创建多线程
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                String sub = null;
                for (int j = 0; j < 1000; j++) {
                    sub = UUID.randomUUID().toString().substring(0, 8);
                    map.put(sub, j);
                    System.out.println(Thread.currentThread().getName() + " add " + sub + ":" + j);
                }
            }, "t1").start();
        }


        System.out.println("遍历集合元素");

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }


}
