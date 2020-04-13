package com.max.learn.thread.lesson04;

/**
 * @ClassName SingtonDemo04
 * @Descripition 懒汉式单例(线程安全,性能差)
 * @Auther huangX
 * @Date 2020/3/29 14:53
 * @Version 1.0
 **/
public class SingtonDemo04 {

    private static SingtonDemo04 instance;

    public SingtonDemo04() {
        System.out.println("初始化");
    }

    public synchronized static SingtonDemo04 getInstance(){
        if (null == instance){
            instance = new SingtonDemo04();
        }
        return instance;
    }

    public static void main(String[] args) {
        for(int i=0; i<200; i++){
            new Thread(()->{
                SingtonDemo04.getInstance();
            }).start();;
        }
    }
}
