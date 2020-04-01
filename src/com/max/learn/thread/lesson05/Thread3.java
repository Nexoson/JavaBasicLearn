package com.max.learn.thread.lesson05;


/**
 * @Author huangX
 * @Description TODO
 * @Date 22:36 2019/5/22
 * @return
 **/
public class Thread3 extends Thread {
    /**
     * 在很多情况下，主线程生成并起动了子线程，如果子线程里要进行大量的耗时的运算，
     * 主线程往往将于子线程之前结束，但是如果主线程处理完其他的事务后，需要用到子
     * 线程的处理结果，也就是主线程需要等待子线程执行完成之后再结束，这个时候就要用到join()方法了。
     **/
    private String name;

    public Thread3(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println(name + "线程运行开始!");
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程" + name + "运行: " + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + "线程运行结束!");

    }

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() +"主线程运行开始!");
        Thread3 t1 = new Thread3("A");
        Thread3 t2 = new Thread3("B");
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "主线程运行结束!");
    }
}
