package com.max.learn.面试.面试题.static执行顺序;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName Test.java
 * @Description TODO
 * @createTime 2020年03月15日 10:00:00
 */
public class Test {

    public static void main(String[] args) {
        int abc = S.abc;
        System.out.println(abc);
    }

}
