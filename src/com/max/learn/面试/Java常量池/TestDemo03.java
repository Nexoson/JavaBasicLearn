package com.max.learn.面试.Java常量池;

/**
 * @ClassName TestDemo03
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/18 22:33
 * @Version 1.0
 **/
public class TestDemo03 {
    public static final String a;
    public static final String b;

    static {
        a = "123";
        b = "456";
    }

    {
        System.out.println("666");
    }


    public static void main(String[] args) {
        String c = "123456";
        String d = a + b;
        System.out.println(c == d);
    }


    /**
     * 在这段代码中，编译期static不执行的，a和b的值是未知的，
     * static代码块，在初始化的时候被执行，初始化属于类加载的一部分，
     * 属于运行期。看看反编译的结果,很明显使用的是indy指令，
     * 动态调用返回String类型对象。一个在堆中一个在方法区常量池中，自然是不一样的
     * 博客: https://blog.csdn.net/qq_41376740/article/details/80338158
     **/
}
