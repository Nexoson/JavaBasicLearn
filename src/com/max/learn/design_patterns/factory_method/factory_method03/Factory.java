package com.max.learn.design_patterns.factory_method.factory_method03;

/**
 * @ClassName Factory
 * @Auther huangX
 * @Date 2020/4/29 21:09
 * @Version 1.0
 * @Descripition 工厂类
 **/
public class Factory {

    public static Animal catProduce(){
        return new Cat();
    }

    public static Animal dogProduce(){
        return new Dog();
    }
}
