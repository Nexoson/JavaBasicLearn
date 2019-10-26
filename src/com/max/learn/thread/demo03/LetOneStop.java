package com.max.learn.thread.demo03;

/**
 * @ClassName LetOneStop
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/9/27 22:04
 * @Version 1.0
 **/
public class LetOneStop implements Animal.Calltoback {
    // 动物对象
    Animal an;

    // 获取动物对象,可以传入兔子或乌龟的实例
    public  LetOneStop(Animal an){
        this.an = an;
    }

    // 让动物的线程停止
    @Override
    public void win() {
        // 线程停止
        an.stop();
    }
}
