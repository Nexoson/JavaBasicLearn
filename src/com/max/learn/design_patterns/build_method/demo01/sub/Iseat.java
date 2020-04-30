package com.max.learn.design_patterns.build_method.demo01.sub;

public enum Iseat {

    ComfortableSeat("舒适坐垫"),
    HardSeat("硬坐垫");

    private String desc;

    Iseat(String str) {
        this.desc = str;
    }

    public String getDesc() {
        return desc;
    }
}
