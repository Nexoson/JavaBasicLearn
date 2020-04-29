package com.max.learn.design_patterns.factory_method.factory_method02;

/**
 * @ClassName Dog
 * @Auther huangX
 * @Date 2020/4/29 21:08
 * @Version 1.0
 * @Descripition 小狗
 **/
public class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("汪汪汪");
    }
}
