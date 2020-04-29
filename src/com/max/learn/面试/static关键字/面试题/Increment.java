package com.max.learn.面试.static关键字.面试题;

import org.junit.Test;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName Increment.java
 * @Description i++ 与 ++i
 * @createTime 2020年03月15日 17:48:00
 */
public class Increment {


    @Test
    public void incrementTest1() {
        int i = 0;
        int j = i++;
        System.out.println(j);
    }

    @Test
    public void incrementTest2() {
        int i = 0;
        int j = ++i;
        System.out.println(j);
    }

    @Test
    public void incrementTest3() {
        int i = 0;
        int j = i++ + i++;
        System.out.println(j);
    }

}
