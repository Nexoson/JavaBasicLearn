package com.max.learn.面试.static关键字.面试题;

/**
 * @ClassName Test2
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/28 23:09
 * @Version 1.0
 **/
public class Test2 {


    /**
     * 只要进main方法 就会初始化类 就会走静态方法
     *
     * 虽然在main方法中没有任何语句，但是还是会输出，
     * 原因上面已经讲述过了。
     * 另外，static块可以出现类中的任何地方（只要不是方法内部，记住，任何方法内部都不行），
     * 并且执行是按照static块的顺序执行的
     **/

    static {
        System.out.println("test static 1");
    }

    public static void main(String[] args) {

    }

    static{
        System.out.println("test static 2");
    }

}
