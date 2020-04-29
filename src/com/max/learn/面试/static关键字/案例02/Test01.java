package com.max.learn.面试.static关键字.案例02;

/**
 * @ClassName Test01
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/17 9:57
 * @Version 1.0
 **/
public class Test01 {
    private static int a;
    private int b;

    static {
        Test01.a = 3;
        System.out.println(a);
        Test01 t = new Test01();
        t.f();
        t.b = 1000;
        System.out.println(t.b);
    }

    static {
        Test01.a = 4;
        System.out.println(a);
    }

    public static void main(String[] args) {

    }

    static {
        Test01.a = 5;
        System.out.println(a);
    }

    private void f() {
        System.out.println("hahahahahahahaha...");
    }

}
