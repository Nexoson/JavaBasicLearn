package com.max.learn.thread.demo01;

/**
 * @ClassName Station
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/9/24 21:29
 * @Version 1.0
 **/
public class Station extends Thread {

    public Station(String name) {
        super(name);
    }

    static int tick = 20;
    // 创建一个静态钥匙
    static Object obj = "aa";
    // 重写run方法,实现买票操作

    @Override
    public void run() {

        while (tick > 0) {
            // 这里很重要,必须使用一个锁
            synchronized (obj) {
                // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
                if (tick > 0) {
                    System.out.println(getName() + "卖出了第"+tick+"张票");
                    tick--;
                }else{
                    System.out.println("票卖完了");
                }
            }
 /*           try {
                //休息一秒
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }


    }


}
