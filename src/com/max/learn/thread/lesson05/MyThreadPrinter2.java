package com.max.learn.thread.lesson05;

/**
 * @ClassName MyThreadPrinter2
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/5/22 23:44
 * @Version 1.0
 **/
public class MyThreadPrinter2 implements Runnable {

    private String name;
    private Object prev;
    private Object self;

    public MyThreadPrinter2(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {

        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    count--;
                    /** 首次唤醒线程 均为就绪状态, 但是c锁未释放, 只能pb线程获得两把必备锁 可执行
                     *  后每次线程执行都是当前锁最后释放,但是当前线程阻塞,等待唤醒
                     *  pa c a --> pa阻塞 释放c a 锁池中有了a b c, pb 先拿到锁先执行(pc前有sleep(100))
                     *  pb a b --> pb阻塞 释放 a b, 唤醒 pa, pc 拿到锁先执行(sleep())
                     *  pc b c --> pc阻塞 释放 b c, 唤醒 pb, pa 提前拿到a锁先执行
                     **/
                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();

        MyThreadPrinter2 pa = new MyThreadPrinter2("A", c, a);
        MyThreadPrinter2 pb = new MyThreadPrinter2("B", a, b);
        MyThreadPrinter2 pc = new MyThreadPrinter2("C", b, c);


        new Thread(pa).start();
        Thread.sleep(100);
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);



    }
}
