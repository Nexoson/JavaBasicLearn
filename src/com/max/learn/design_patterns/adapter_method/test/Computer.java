package com.max.learn.design_patterns.adapter_method.test;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName Computer.java
 * @Description 轻薄电脑
 * @createTime 2020年05月05日 14:25:00
 */
public class Computer {

    /**
     * 电脑上网, 无网线接口
     */
    public void net(AdapterNetToUsb obj) {
        obj.surfOnLine();
    }
}
