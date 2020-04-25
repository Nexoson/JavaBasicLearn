package com.max.learn.其它.面试题.static执行顺序;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName S.java
 * @Description TODO
 * @createTime 2020年03月15日 10:00:00
 */
public class S extends  P{
    static {
        System.out.println("S is init");
    }
}
