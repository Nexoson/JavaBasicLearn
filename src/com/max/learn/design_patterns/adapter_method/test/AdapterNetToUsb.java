package com.max.learn.design_patterns.adapter_method.test;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName AdapterNetToUsb.java
 * @Description USB转换器
 * @createTime 2020年05月05日 14:37:00
 */
public class AdapterNetToUsb implements AdapterNet{

    NetworkCable cable = new NetworkCable();


    @Override
    public void surfOnLine() {
           cable.clickNet();
    }
}
