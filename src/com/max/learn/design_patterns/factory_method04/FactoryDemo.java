package com.max.learn.design_patterns.factory_method04;


/**
 * @ClassName FactoryDemo
 * @Auther huangX
 * @Date 2020/4/29 21:15
 * @Version 1.0
 * @Descripition 多个工厂方法模式
 **/
public class FactoryDemo {

    public static void main(String[] args) {

        CatFactory fc = new CatFactory();
        Animal a = fc.produce();
        if (null != a){
            a.say();
        }
    }
}
