package com.max.learn.面试.String相关;

import org.junit.Test;

/**
 * @ClassName StringDemo03
 * @Descripition Java常量池
 * @Auther huangX
 * @Date 2020/4/1 23:19
 * @Version 1.0
 **/
public class StringDemo03 {


    /**
     * 在jdk8中，移除了方法区，转而用Metaspace区域替代，所以我们需要使用新的jvm参数：
     * -XX:MaxMetaspaceSize=2M，依然运行如上代码，抛出：java.lang.OutOfMemoryError:
     * Metaspace异常。同理说明运行时常量池是划分在Metaspace区域中
     **/

    public static void main(String[] args) {

    }

    @Test
    public void test01() {

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hel" + "lo";
        String s4 = "Hel" + new String("lo");
        String s5 = new String("Hello");
        String s6 = s5.intern();
        String s7 = "H";
        String s8 = "ello";
        String s9 = s7 + s8;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s9);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);
        System.out.println(s1 == s6);
    }


}
