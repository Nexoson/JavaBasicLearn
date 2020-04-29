package com.max.learn.面试.三大特性.多态.案例03;

/**
 * @ClassName BYB
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/15 20:14
 * @Version 1.0
 **/
public class BYB extends Wine{

    public void drink(){
        System.out.println("我喝了... "+name);
    }

    public BYB() {
    }

    public BYB(String name) {
        super(name);
    }

}
