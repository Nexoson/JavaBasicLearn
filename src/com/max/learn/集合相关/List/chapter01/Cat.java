package com.max.learn.集合相关.List.chapter01;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className Cat
 * @date 2021/4/1 13:58
 * @desc
 **/
public class Cat extends Animal{
    private String jumpSkill;

    public Cat(String name, String jumpSkill) {
        super(name);
        this.jumpSkill = jumpSkill;
    }

    public String getJumpSkill() {
        return jumpSkill;
    }

    public void setJumpSkill(String jumpSkill) {
        this.jumpSkill = jumpSkill;
    }
}
