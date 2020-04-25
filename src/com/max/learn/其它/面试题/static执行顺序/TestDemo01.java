package com.max.learn.其它.面试题.static执行顺序;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName TestDemo01.java
 * @Description TODO
 * @createTime 2020年03月14日 19:58:00
 */
public class TestDemo01 {

    public static void main(String[] args) {
        int j = 10;
        System.out.println(++j);

        int k = j %= 4;
        System.out.println(k);
    }

}
