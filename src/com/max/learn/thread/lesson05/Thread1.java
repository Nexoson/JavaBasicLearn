package com.max.learn.thread.lesson05;
/**
 * huangX
 * 继承父类创建线程类
 */
public class Thread1 extends Thread{

    private String name;

    public Thread1(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        super.run();

        for (int i =0; i < 10; i++){
            System.out.println(name + "运行 : " + i);
            try {
                sleep((int)Math.random() *10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    public static void main(String[] args) {
         Thread1 t1 = new Thread1("A");
         Thread1 t2 = new Thread1("B");
         t1.start();
         t2.start();
    }
}
