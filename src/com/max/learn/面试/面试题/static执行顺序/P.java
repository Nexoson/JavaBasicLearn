package com.max.learn.面试.面试题.static执行顺序;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName P.java
 * @Description TODO
 * @createTime 2020年03月15日 09:59:00
 */
public class P {
    public  static int abc = 123;
    static{
        System.out.println("P is init");
    }
}
