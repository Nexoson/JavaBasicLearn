package com.max.learn.design_patterns.build_method.demo01.sub;

public enum IFrame {
    // 钢制车架
    Steel("钢制车架"),
    // 铝合金车架
    Aluminum("铝合金车架"),
    // 钛合金车架
    Titanium("钛合金车架"),
    // 碳纤维车架
    Carbon("碳纤维车架");

    public String desc;

    IFrame(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
