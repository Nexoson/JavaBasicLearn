package com.max.learn.面试.final关键字;

/**
 * @ClassName Man
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/27 21:46
 * @Version 1.0
 **/
public class Man {

    private final int i = 0;

    public Man() {

        // i = 1; 变量无法被重新赋值
        final Object obj = new Object();
        // obj = new Object(); 对象无法被重新赋值
    }
}
