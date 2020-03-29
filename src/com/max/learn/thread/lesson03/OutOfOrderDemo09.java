package com.max.learn.thread.lesson03;

/**
 * @ClassName OutOfOrderDemo09
 * @Descripition 验证volatile无法保证原子性问题
 * @Auther huangX
 * @Date 2020/3/29 11:05
 * @Version 1.0
 **/
public class OutOfOrderDemo09 {

    public volatile int inc = 0;

    public void increase(){
        inc++;
    }


    /**
     *     public synchronized void increase(){
     *         inc++;
     *     }
     **/

    public static void main(String[] args) {
        final  OutOfOrderDemo09 demo09 = new OutOfOrderDemo09();
        for(int i=0; i<10; i++){
            new Thread(){
                public void run(){

                    for (int j=0; j<1000; j++){
                        demo09.increase();
                    }
                    // System.out.println(Thread.currentThread().getName()+"(开始)inr ="+demo09.inc);

                }
            }.start();
        }
        // 保证前面的线程都执行完
        while (Thread.activeCount() > 1){
            Thread.yield();
        }
        System.out.println(demo09.inc);
    }

}
