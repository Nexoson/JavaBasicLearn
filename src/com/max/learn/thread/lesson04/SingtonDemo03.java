package com.max.learn.thread.lesson04;

/**
 * @ClassName SingtonDemo03
 * @Descripition 懒汉式(线程不安全)
 * @Auther huangX
 * @Date 2020/3/29 13:59
 * @Version 1.0
 **/
public class SingtonDemo03 {

    private static SingtonDemo03 instance;

    private SingtonDemo03() {
    }

    public static SingtonDemo03 getInstance(){
        if(null == instance){
            instance = new SingtonDemo03();
        }
        return instance;
    }
}
