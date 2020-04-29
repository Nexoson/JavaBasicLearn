package com.max.learn.design_patterns.factory_method03;

/**
 * @ClassName Animal
 * @Auther huangX
 * @Date 2020/4/29 20:59
 * @Version 1.0
 * @Descripition 猫
 **/
public class Cat implements Animal {
    @Override
    public void say() {
        System.out.println("喵喵喵");
    }
}
