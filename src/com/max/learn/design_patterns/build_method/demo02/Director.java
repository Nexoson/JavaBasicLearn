package com.max.learn.design_patterns.build_method.demo02;

/**
 * @ClassName Director
 * @Auther huangX
 * @Date 2020/4/30 10:08
 * @Version 1.0
 * @Descripition 指挥者类
 **/
public class Director {
    private Builder mBuilder = null;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    public Bike construct(){
        mBuilder.buildFrame();
        mBuilder.buildSeat();
        mBuilder.buildTire();
        return mBuilder.createBike();
    }
}
