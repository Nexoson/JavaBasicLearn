package com.max.learn.thread.demo03;

/**
 * @ClassName Tortoise
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/9/27 22:01
 * @Version 1.0
 **/
public class Tortoise extends Animal {


    public Tortoise() {
        setName("乌龟");
    }

    @Override
    public void running() {
        // 乌龟速度
        int dis = 2;
        length -= dis;
        System.out.println("乌龟跑了" + dis + "米，距离终点还有" + length + "米");
        if (length <= 0) {
            length = 0;
            System.out.println("乌龟获得了胜利");
            // 让兔子不要再跑了
            if (calltoback != null) {
                calltoback.win();
            }
        }
        try {
            sleep(10);                        //每0.1秒跑2米
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
