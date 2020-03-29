package com.max.learn.thread.lesson04;

/**
 * @ClassName SingtonDemo08
 * @Descripition 枚举实现单例
 * @Auther huangX
 * @Date 2020/3/29 15:33
 * @Version 1.0
 **/
public enum SingtonDemo08 {


    /**
     * 枚举实际上是一种多例的模式. 如果我们直接定义一个实例就相当于是单例了
     **/
    INSTANCE;

    public SingtonDemo08 getInstance(){
        return INSTANCE;
    }


    // 参考博客 https://www.cnblogs.com/chiclee/p/9097772.html
}
