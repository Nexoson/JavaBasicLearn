package com.max.learn.design_patterns.build_method.demo02;

/**
 * @ClassName Builder
 * @Auther huangX
 * @Date 2020/4/30 10:01
 * @Version 1.0
 * @Descripition 抽象的builder类
 **/
public abstract class Builder {
    abstract void buildFrame();
    abstract void buildSeat();
    abstract void buildTire();
    abstract Bike createBike();
}
