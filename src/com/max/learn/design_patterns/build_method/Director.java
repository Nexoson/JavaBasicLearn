package com.max.learn.design_patterns.build_method;

/**
 * @ClassName Director
 * @Auther huangX
 * @Date 2020/4/29 23:25
 * @Version 1.0
 * @Descripition 装机人员装机
 **/
public class Director {

    public void Construct(Builder builder) {
        builder.buildCpu();
        builder.buildMainBoard();
        builder.buildHDD();
        builder.buildGC();
    }
}
