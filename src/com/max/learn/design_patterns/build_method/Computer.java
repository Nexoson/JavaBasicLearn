package com.max.learn.design_patterns.build_method;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Computer
 * @Auther huangX
 * @Date 2020/4/29 23:20
 * @Version 1.0
 * @Descripition 电脑实体
 **/
public class Computer {

    //  电脑组件集合
    private List<String> parts = new ArrayList<String>();

    public void add(String part) {
        parts.add(part);
    }

    public void print() {
        for (int i = 0; i < parts.size(); i++) {
            System.out.println("组件:" + parts.get(i) + "装好了...");
        }
        System.out.println("电脑组装完毕...");
    }
}
