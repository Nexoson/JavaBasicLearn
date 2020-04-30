package com.max.learn.design_patterns.build_method.demo01;

/**
 * @ClassName Builder
 * @Auther huangX
 * @Date 2020/4/29 23:18
 * @Version 1.0
 * @Descripition 装机
 **/
abstract class Builder {

    // 装cpu
    abstract void buildCpu();

    // 装主板
    abstract void buildMainBoard();

    // 装硬盘
    abstract void buildHDD();

    // 获得组装好的电脑
    public abstract  Computer getComputer();

    // 装显卡
    void buildGC() {
        System.out.println("GTX750Ti");
    }

}
