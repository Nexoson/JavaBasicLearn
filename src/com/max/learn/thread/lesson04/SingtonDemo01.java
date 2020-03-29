package com.max.learn.thread.lesson04;

/**
 * @ClassName Sing
 * @Descripition 饿汉式(静态常量)
 * @Auther huangX
 * @Date 2020/3/29 13:00
 * @Version 1.0
 **/
public class SingtonDemo01 {

    /**
     *  1.私有构造方法
     *  2.定义静态常量
     *  3.对外暴露实例方法
     **/
    private SingtonDemo01() {
    }

    private static final SingtonDemo01 demo01 = new SingtonDemo01();

    public static SingtonDemo01 getInstance(){
        return demo01;
    }

    public static void main(String[] args) {

        SingtonDemo01 s1 = SingtonDemo01.getInstance();
        SingtonDemo01 s2 = SingtonDemo01.getInstance();
        System.out.println(s1 == s2);
    }
}
