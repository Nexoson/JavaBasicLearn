package com.max.learn.design_patterns.factory_method02;

/**
 * @ClassName Factory
 * @Auther huangX
 * @Date 2020/4/29 21:09
 * @Version 1.0
 * @Descripition 工厂类
 **/
public class Factory {

    public  Animal catSay(){
        return new Cat();
    }

    public  Animal dogSay(){
        return new Dog();
    }
}
