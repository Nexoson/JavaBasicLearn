package com.max.learn.thread.lesson04;

/**
 * @ClassName SingtonDemo06
 * @Descripition 双重检查机制
 * @Auther huangX
 * @Date 2020/3/29 15:01
 * @Version 1.0
 **/
public class SingtonDemo06 {

    // 静态属性,volatile保证可见性和禁止重排序
    private  static SingtonDemo06 instance = null;
    private static int num = 0;

    // 私有化构造器
    private SingtonDemo06() {
        num = 1;
        System.out.println("初始化");
    }

    public static SingtonDemo06 getInstance() {
        // 第一重检查
        if(null == instance){
            // 同步锁定代码块
            synchronized (SingtonDemo06.class){
                //第二重检查锁定
                if(instance == null){
                    // 注意: 非原子操作()
                    instance = new SingtonDemo06();
                }
            }
        }
        if(num == 0){
            System.out.println("未初始化");
        }
        return instance;
    }

    public static void main(String[] args) {
        for(int i=0; i<1000000 ; i++){
            new Thread(()->{
                SingtonDemo06.getInstance();
            }).start();;
        }
    }
}
