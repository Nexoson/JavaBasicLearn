package com.max.learn.design_patterns.factory_method.factory_method01;

/**
 * @ClassName FactoryDemo
 * @Auther huangX
 * @Date 2020/4/29 21:15
 * @Version 1.0
 * @Descripition 普通工厂方法模式
 **/
public class FactoryDemo {

    public static void main(String[] args) {
        Animal a;
        a = Factory.getInstance("Cat");
        if (null != a){
            a.say();
        }
    }
}
