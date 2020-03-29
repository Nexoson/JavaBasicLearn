package com.max.learn.thread.lesson04;

/**
 * @ClassName SingtonDemo05
 * @Descripition 懒汉式单例,线程不安全,性能较sync加在方法上好一些(针对demo04优化)
 * @Auther huangX
 * @Date 2020/3/29 14:56
 * @Version 1.0
 **/
public class SingtonDemo05 {

    private  static SingtonDemo04 instance;

    private SingtonDemo05() {
    }

    public  static SingtonDemo04 getInstance(){
        // 性能得到优化,但是依然不能保证第一次获取对象的线程安全
        if (null == instance){
            synchronized (SingtonDemo05.class){
                instance = new SingtonDemo04();
            }
        }
        return instance;
    }
}
