package com.max.learn.thread.lesson05;

/**
 * @ClassName MyThreadLocal
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/5/25 14:48
 * @Version 1.0
 **/
public class MyThreadLocal {
    private static final ThreadLocal<Object> threadLocal = new ThreadLocal<Object>(){

        protected Object initialValue(){
            System.out.println("调用get方法时，当前线程共享变量没有设置，调用initialValue获取默认值！");
            return null;
        }
    };

    public static void main(String[] args) {
        new Thread(new MyIntegerTask("IntegerTask1")).start();
        new Thread(new MyStringTask("StringTask1")).start();
        new Thread(new MyIntegerTask("IntegerTask2")).start();
        new Thread(new MyStringTask("StringTask2")).start();
    }

    private static class MyIntegerTask implements Runnable {
        private String name;

        public MyIntegerTask(String name) {
            this.name = name;
        }
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                // ThreadLocal.get方法获取线程变量
                if(null == MyThreadLocal.threadLocal.get()){
                    // ThreadLocal.et方法设置线程变量
                    MyThreadLocal.threadLocal.set(0);
                    System.out.println("线程"+name +": 0");
                }else{
                    int num = (Integer) MyThreadLocal.threadLocal.get();
                    MyThreadLocal.threadLocal.set(num +1);
                    System.out.println("线程" + name +":" +MyThreadLocal.threadLocal.get());
                    if ( 3 == i){
                        MyThreadLocal.threadLocal.remove();
                    }
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class MyStringTask implements Runnable {
        private String name;

        public MyStringTask(String name) {
            this.name = name;
        }

        @Override
        public void run() {

            for (int i = 0; i < 5; i++) {
                if(null == MyThreadLocal.threadLocal.get()){
                    MyThreadLocal.threadLocal.set("a");
                    System.out.println("线程" + name +": a");
                }else{
                    String str = (String)MyThreadLocal.threadLocal.get();
                    MyThreadLocal.threadLocal.set(str +"a");
                    System.out.println("线程" + name +":" +MyThreadLocal.threadLocal.get());
                }

                try {
                    Thread.sleep(800);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
