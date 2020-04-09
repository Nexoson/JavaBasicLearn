package com.max.learn.其它.面试题.static执行顺序;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName Y.java
 * @Description TODO
 * @createTime 2020年03月15日 10:57:00
 */
public class Y {

    static {
        System.out.println("Y static");
    }
    {
        System.out.println("Y normal");
    }

    Y(){
        System.out.println("Y construct");
    }

}
