package com.max.learn.design_patterns.factory_method02;

/**
 * @ClassName Factory
 * @Auther huangX
 * @Date 2020/4/29 21:09
 * @Version 1.0
 * @Descripition 工厂类
 **/
public class Factory {

    public  Animal catProduce(){
        return new Cat();
    }

    public  Animal dogProduce(){
        return new Dog();
    }
}
