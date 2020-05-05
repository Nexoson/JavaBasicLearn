package com.max.learn.design_patterns.adapter_method.test;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName demo.java
 * @Description 测试
 * @createTime 2020年05月05日 14:39:00
 */
public class Demo {

    public static void main(String[] args) {
        Computer com = new Computer();
        com.net(new AdapterNetToUsb());
    }
}
