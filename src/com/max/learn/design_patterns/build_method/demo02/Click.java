package com.max.learn.design_patterns.build_method.demo02;

/**
 * @ClassName Click
 * @Auther huangX
 * @Date 2020/4/30 10:10
 * @Version 1.0
 * @Descripition 客户端使用
 **/
public class Click {
    public static void main(String[] args) {
        showBike(new OfoBuilder());
//        showBike(new MobikeBuilder());
    }
    private static void showBike(Builder builder) {
        Director director = new Director(builder);
        Bike bike = director.construct();
        bike.getFrame().frame();
        bike.getSeat().seat();
        bike.getTire().tire();
    }
}
