package com.max.learn.static关键字.案例01;

/**
 * @ClassName MyObject
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/28 22:07
 * @Version 1.0
 **/
public class MyObject {


    /**
     * 方便在没有创建对象的情况下来进行调用（方法/变量）。
     **/

    private static String str1 = "staticProperty";
    private String str2 = "property";

    public MyObject(){

    }

    public void print1(){
        System.out.println(str1);
        System.out.println(str2);
        print2();
    }

    private static void print2() {
        System.out.println(str1);
/*        System.out.println(str2);
        print1();*/
    }

}
