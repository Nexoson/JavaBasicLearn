package com.max.learn.面试.三大特性.多态.案例04;

/**
 * @ClassName B
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/15 20:25
 * @Version 1.0
 **/
public class B extends A{

    public String show(B obj){
        return ("B and B");
    }

    public String show(A obj){
        return ("B and A");
    }

}
