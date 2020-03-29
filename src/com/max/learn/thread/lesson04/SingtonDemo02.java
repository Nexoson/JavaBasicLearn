package com.max.learn.thread.lesson04;

/**
 * @ClassName SingtonDemo02
 * @Descripition 饿汉式(静态代码块)
 * @Auther huangX
 * @Date 2020/3/29 13:52
 * @Version 1.0
 **/
public class SingtonDemo02 {

    private static final SingtonDemo02 INSTANCE;

    static{
       INSTANCE = new SingtonDemo02();
    }

    private SingtonDemo02() {
    }

    public static SingtonDemo02 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        SingtonDemo01 s1 = SingtonDemo01.getInstance();
        SingtonDemo01 s2 = SingtonDemo01.getInstance();
        System.out.println(s1 == s2);
    }
}
