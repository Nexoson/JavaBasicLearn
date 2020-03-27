package com.max.learn.thread.lesson03;

/**
 * @ClassName VisibilityDemo01
 * @Descripition TODO
 * @Auther huangX
 * @Date 2020/3/26 14:48
 * @Version 1.0
 **/
public class VisibilityDemo02 {

    /**
     * 目标: 研究多线程下变量访问的不可见性现象
     * <p>
     * 解决思路
     * 加锁
     */

    /**
     * 某一个线程进入synchronized代码块前后,执行过程如下:
     * 线程获得锁
     * 清空工作内存
     * 从主内存拷贝共享内存变量最新的值到工作内存成为副本
     * 执行代码
     * 将修改后的副本的值刷新回主内存中
     * 线程释放锁
     **/

    // main方法, 作为一个主线程
    public static void main(String[] args) {

        // 开启一个子线程
        MyThread2 t = new MyThread2();
        t.start();

        // 主线程执行
        while (true) {
            synchronized (t) {
                if (t.isFlag()) {
                    System.out.println("主线程进入循环执行>>>");
                }
            }
        }
    }
}


class MyThread2 extends Thread {
    // 成员变量
    private volatile boolean flag = false;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 触发修改共享成员变量
        flag = true;
        System.out.println("flag=" + flag);

    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
