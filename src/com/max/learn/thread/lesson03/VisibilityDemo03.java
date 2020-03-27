package com.max.learn.thread.lesson03;

/**
 * @ClassName VisibilityDemo01
 * @Descripition TODO
 * @Auther huangX
 * @Date 2020/3/26 14:48
 * @Version 1.0
 **/
public class VisibilityDemo03 {

    /**
     * 目标: 研究多线程下变量访问的不可见性现象
     * <p>
     * 解决思路
     * 对共享的变量使用volatile关键字修饰即可
     */

    // main方法, 作为一个主线程
    public static void main(String[] args) {

        // 开启一个子线程
        MyThread3 t = new MyThread3();
        t.start();

        // 主线程执行
        while (true) {
            if (t.isFlag()) {
                System.out.println("主线程进入循环执行>>>");
            }
        }
    }
}


class MyThread3 extends Thread {
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
