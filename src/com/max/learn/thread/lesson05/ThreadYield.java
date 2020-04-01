package com.max.learn.thread.lesson05;

/**
 * @ClassName ThreadYield
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/5/22 23:08
 * @Version 1.0
 **/
public class ThreadYield extends Thread {


    /**
     * yield():暂停当前正在执行的线程对象，并执行其他线程。
     * Thread.yield()方法作用是：暂停当前正在执行的线程对象，并执行其他线程。
     * yield()应该做的是让当前运行线程回到可运行状态，以允许具有相同优先级的其他线程获得运行机会。
     * 因此，使用yield()的目的是让相同优先级的线程之间能适当的轮转执行。但是，实际中无法保证yield()
     * 达到让步目的，因为让步的线程还有可能被线程调度程序再次选中。
     *  
     * 结论：yield()从未导致线程转到等待/睡眠/阻塞状态。在大多数情况下，yield()将导致线程从运行状态转到可运行状态，但有可能没有效果。可看上面的图。
     **/


    /**
     * sleep()和yield()的区别
     * sleep()和yield()的区别):sleep()使当前线程进入停滞状态，所以执行sleep()的线程在指定的时间内肯定不会被执行；yield()只是使当前线程重新回到可执行状态，
     * 所以执行yield()的线程有可能在进入到可执行状态后马上又被执行。
     * sleep 方法使当前运行中的线程睡眼一段时间，进入不可运行状态，这段时间的长短是由程序设定的，yield 方法使当前线程让出 CPU 占有权，但让出的时间是不可设定的。
     * 实际上，yield()方法对应了如下操作：先检测当前是否有相同优先级的线程处于同可运行状态，如有，则把 CPU  的占有权交给此线程，否则，继续运行原来的线程。所以
     * yield()方法称为“退让”，它把运行机会让给了同等优先级的其他线程
     *
     * 另外，sleep 方法允许较低优先级的线程获得运行机会，但 yield()  方法执行时，当前线程仍处在可运行状态，所以，不可能让出较低优先级的线程些时获得 CPU 占有权。在一个运行系统中，如果较高优先级的线程没有调用 sleep 方法，又没有受到 I\O 阻塞，那么，较低优先级线程只能等待所有较高优先级的线程运行结束，才有机会运行。
     **/

    /**
     *interrupt():不要以为它是中断某个线程！它只是线线程发送一个中断信号，
     *让线程在无限等待时（如死锁时）能抛出抛出，从而结束线程，但是如果你吃掉了这个异常，
     *那么这个线程还是不会中断的！
     **/
    public ThreadYield(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("" + this.getName() + "-----" + i);
            // 当i为30时，该线程就会把CPU时间让掉，让其他或者自己的线程执行（也就是谁先抢到谁执行）
            if (i == 30) {
                this.yield();
            }
        }
    }

    public static void main(String[] args) {
        ThreadYield t1 = new ThreadYield("张三");
        ThreadYield t2 = new ThreadYield("李四");
//        t1.setPriority(Thread.MAX_PRIORITY);
//        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
