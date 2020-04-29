package com.max.learn.面试.三大特性.多态.案例03;

/**
 * @ClassName JNC
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/15 20:06
 * @Version 1.0
 **/
public class JNC extends Wine{

    public void drink(){
        System.out.println("我喝了... "+name);
    }

    public JNC() {
    }

    public JNC(String name) {
        super(name);
    }
}
