package com.max.learn.design_patterns.build_method.demo01.sub;

public enum ITire {

    OffRoadTire("越野轮胎"),
    RoadTire("公路轮来");

    private String desc;

    ITire(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
