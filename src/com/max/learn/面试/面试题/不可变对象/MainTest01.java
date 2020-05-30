package com.max.learn.面试.面试题.不可变对象;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName MainTest01
 * @Auther huangX
 * @Date 2020/5/20 13:53
 * @Version 1.0
 * @Descripition TODO
 **/
public class MainTest01 {

    public static void main(String[] args) {
        ImmutableRGB color =  new ImmutableRGB(0, 0, 0, "Pitch Black");
//        SynchronizedRGB color =  new SynchronizedRGB(0, 0, 0, "Pitch Black");
        new Thread(()->{
            int myColorInt = color.getRGB();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(color.getName()+" "+color.getRGB());
        },"T1").start();


        new Thread(()->{
            ImmutableRGB green = color.set(0, 255, 0, "Green");
            System.out.println(Thread.currentThread().getName()+ " "+green.getName()+" "+green.getRGB());
        },"T2").start();
    }

}
