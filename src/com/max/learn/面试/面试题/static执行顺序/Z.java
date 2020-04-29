package com.max.learn.面试.面试题.static执行顺序;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName Z.java
 * @Description TODO
 * @createTime 2020年03月15日 10:58:00
 */
public class Z  extends X{

    Y y=new Y();
    static{
        System.out.println("Z static");
    }
    {
        System.out.println("Z normal");
    }
    Z(){
        System.out.println("Z construct");
    }

}
