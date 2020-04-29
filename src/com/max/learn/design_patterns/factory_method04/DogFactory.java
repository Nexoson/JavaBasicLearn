package com.max.learn.design_patterns.factory_method04;

/**
 * @ClassName DogFactory
 * @Auther huangX
 * @Date 2020/4/29 22:46
 * @Version 1.0
 * @Descripition 狗的工厂类
 **/
public class DogFactory implements AnimalProduce{

    @Override
    public Animal produce() {
        return new Dog();
    }
}
