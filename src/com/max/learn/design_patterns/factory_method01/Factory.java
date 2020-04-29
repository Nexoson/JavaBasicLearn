package com.max.learn.design_patterns.factory_method01;

/**
 * @ClassName Factory
 * @Auther huangX
 * @Date 2020/4/29 21:09
 * @Version 1.0
 * @Descripition 工厂类
 **/
public class Factory {

    public static Animal getInstance(String className){
        // 定义接口对象
        Animal animal =null;
        // 判断是哪个子类的标记
        if("Cat".equals(className)){
            // 通过Cat子类实例化接口
            animal = new Cat();
        }

        if("Dog".equals(className)){
            // 通过Cat子类实例化接口
            animal = new Dog();
        }

        return animal;
    }

}
