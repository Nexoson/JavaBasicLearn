package com.max.learn.集合相关.List.chapter01;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className Dog
 * @date 2021/4/1 13:58
 * @desc
 **/
public class Dog extends Animal{
    private String barkSkill;

    public Dog(String name, String barkSkill) {
        super(name);
        this.barkSkill = barkSkill;
    }

    public String getBarkSkill() {
        return barkSkill;
    }

    public void setBarkSkill(String barkSkill) {
        this.barkSkill = barkSkill;
    }
}
