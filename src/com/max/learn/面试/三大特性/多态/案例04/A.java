package com.max.learn.面试.三大特性.多态.案例04;

/**
 * @ClassName A
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/15 20:24
 * @Version 1.0
 **/
public class A {

    public String show(D obj){
        return ("A and D");
    }

    public String show(A obj){
        return ("A and A");
    }

}
