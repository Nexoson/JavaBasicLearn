package com.max.learn.design_patterns.factory_method.factory_method04;

/**
 * @ClassName Factory
 * @Auther huangX
 * @Date 2020/4/29 21:09
 * @Version 1.0
 * @Descripition 猫的工厂类
 **/
public class CatFactory implements AnimalProduce{


    @Override
    public Animal produce() {
        return new Cat();
    }
}
