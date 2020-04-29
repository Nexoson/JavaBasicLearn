package com.max.learn.design_patterns.factory_method02;


/**
 * @ClassName FactoryDemo
 * @Auther huangX
 * @Date 2020/4/29 21:15
 * @Version 1.0
 * @Descripition 多个工厂方法模式
 **/
public class FactoryDemo {

    public static void main(String[] args) {
        Factory fc = new Factory();
        Animal a = fc.catSay();
        if (null != a){
            a.say();
        }
    }
}
