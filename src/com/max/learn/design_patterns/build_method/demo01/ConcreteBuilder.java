package com.max.learn.design_patterns.build_method.demo01;

/**
 * @ClassName ConcreteBuilder
 * @Auther huangX
 * @Date 2020/4/29 23:22
 * @Version 1.0
 * @Descripition 具体装机猿
 **/
public class ConcreteBuilder extends Builder {

    Computer com = new Computer();

    @Override
    void buildCpu() {
        com.add("CPU");
    }

    @Override
    void buildMainBoard() {
        com.add("主板");
    }

    @Override
    void buildHDD() {
        com.add("硬盘");
    }

    @Override
    public Computer getComputer() {
        return com;
    }

    @Override
    void buildGC() {
        System.out.println("我要 GTX2080Ti");
    }
}
