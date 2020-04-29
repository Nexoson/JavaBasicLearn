package com.max.learn.design_patterns.factory_method03;

/**
 * @ClassName Factory
 * @Auther huangX
 * @Date 2020/4/29 21:09
 * @Version 1.0
 * @Descripition 工厂类
 **/
public class Factory {

    public static Animal catSay(){
        return new Cat();
    }

    public static Animal dogSay(){
        return new Dog();
    }
}
