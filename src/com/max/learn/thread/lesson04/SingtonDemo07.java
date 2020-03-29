package com.max.learn.thread.lesson04;

/**
 * @ClassName SingtonDemo07
 * @Descripition 静态内部类方式,可用(代码更简洁)
 * @Auther huangX
 * @Date 2020/3/29 15:22
 * @Version 1.0
 **/
public class SingtonDemo07 {

    /**
     * JVM在类初始化阶段(即在Class被加载后,且线程使用之前),会执行类的初始化.
     * 在执行类的初始化期间,JVM会去获取一个锁.这个锁可以同步多个线程对同一个
     * 类的初始化.
     * 基于这个特性,可以实现另一种线程安全的延迟初始化方案
     **/

    private SingtonDemo07(){}

    private static class SingletonInstance{
        private static final  SingtonDemo07 instance = new SingtonDemo07();
    }

    public static SingtonDemo07 getInstance(){
        return SingletonInstance.instance;
    }



    /**
     * 小结
     * 1.静态内部类是在被调用的时候才会被加载,这种方案实现了懒汉式单例的一种思想,
     * 需要用到的时候才回去创建单例.加上JVM的特性,这种方式又实现线程安全的创建单例对象
     * 2.通过对比基于volatile的双重检查锁定方案和基于类初始化方案的对比,我们会发现
     * 基于类初始化的方案实现的代码更简洁.但是基于volatile的双重检查锁定方案有一个
     * 额外的有事:除了可以对静态字段实现延迟加载初始化外,还可以对实现字段实现延迟
     * 初始化
     **/
}
