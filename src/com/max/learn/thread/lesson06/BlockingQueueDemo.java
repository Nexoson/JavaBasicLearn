package com.max.learn.thread.lesson06;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName BlockingQueueDemo
 * @Auther huangX
 * @Date 2020/4/21 10:03
 * @Version 1.0
 * @Descripition 阻塞队列案例
 **/
public class BlockingQueueDemo {

    public static void main(String[] args) {

        // List list = new ArrayList<Integer>();
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(3);

//        method01(blockingQueue);
//        method02(blockingQueue);
        method03(blockingQueue);
        /*method04()
          offer(e,time,unit)
          poll(time,unit)
          属于方法二的扩展
          当阻塞队列时,队列会阻塞生产者线程一定时间,超过限时
          后生产者线程会退出
         */


    }


    /**
     * @return
     * @Author huangX
     * @Date 11:42 2020/4/21
     * @Param
     * @Description 一直阻塞
     **/
    private static void method03(BlockingQueue<Integer> blockingQueue) {
        // 当阻塞队列满时,生产者线程继续往队列里put元素,队列会一直阻塞生产线程直到put数据or响应中断退出
        // 当阻塞队列空时,消费者线程试图从队列里take元素,队列会一直阻塞消费者线程直到队列可用

        // A B一组  C D一组
/*        new Thread(()->{
            try {
                blockingQueue.put(1);
                blockingQueue.put(2);
                blockingQueue.put(3);
                blockingQueue.put(4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(()->{
            try {
                System.out.println(blockingQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"B").start();

        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println("阻塞队列空");

        // blockingQueue.take() 作为方法入参时 无法起到阻塞作用
        new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
//                blockingQueue.take();
                System.out.println("取出元素:" + blockingQueue.take());
                System.out.println("取出元素:" + blockingQueue.take());
                System.out.println("取出元素:" + blockingQueue.take());
                // 只有3个元素,第四次取就会进行阻塞
                System.out.println("取出元素:" + blockingQueue.take());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "C").start();


        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
            try {
                System.out.println("添加元素");
                blockingQueue.put(1);
                blockingQueue.put(2);
                blockingQueue.put(3);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "D").start();
    }


    /**
     * @return
     * @Author huangX
     * @Date 10:48 2020/4/21
     * @Param
     * @Description 操作阻塞队列(特殊值)
     **/
    private static void method02(BlockingQueue<Integer> blockingQueue) {
        blockingQueue.offer(1);
        blockingQueue.offer(2);
        blockingQueue.offer(3);
//        System.out.println(blockingQueue.offer(4));   //false 不会抛出异常

        System.out.println(blockingQueue.poll());  // 取出尾元素
        blockingQueue.poll();
        try {
            // 从BlockingQueue取出一个队首的对象，如果在指定时间内，队列一旦有数据可取，
            // 则立即返回队列中的数据。否则直到时间超时还没有数据可取，返回失败。
            blockingQueue.poll(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(blockingQueue.peek());
        System.out.println(blockingQueue.contains(3));
    }


    /**
     * @return
     * @Author huangX
     * @Date 10:16 2020/4/21
     * @Param ArrayBlockingQueue blockingQueue
     * @Description 操作阻塞队列(抛出异常)
     **/
    private static void method01(BlockingQueue blockingQueue) {

        blockingQueue.add(1);
        blockingQueue.add(2);
        blockingQueue.add(3);
        // blockingQueue.add(4); Exception in thread "main" java.lang.IllegalStateException: Queue full

        // 抛出异常 add(e) remove() elemenet()
        // 默认移除尾元素,也就是先进去的元素
        System.out.println(blockingQueue.remove());
        // 移除指定元素
        System.out.println(blockingQueue.remove(3));
        // 检索但不删除, 这个队列的头,若为空,会报异常(java.util.NoSuchElementException)
        System.out.println(blockingQueue.element());
    }

}
