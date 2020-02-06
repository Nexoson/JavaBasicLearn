package com.max.learn.thread.lesson01.demo03;

/**
 * @ClassName Animal
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/9/27 21:48
 * @Version 1.0
 **/
public abstract class Animal extends Thread{
    // 比赛长度
    public int length = 2000;

    public abstract void running();

    @Override
    public void run() {
        super.run();
        while(length > 0){
            running();
        }
    }

    // 在需要回调数据的地方(两个子类需要),声明一个接口
    public static interface Calltoback{
        public void win();
    }

    // 创建接口对象
    public Calltoback calltoback;


}
