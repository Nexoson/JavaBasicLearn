package com.max.learn.design_patterns.build_method.demo01;

/**
 * @ClassName BuilderPattern
 * @Auther huangX
 * @Date 2020/4/29 23:24
 * @Version 1.0
 * @Descripition  建造者设计模式
 **/
public class BuilderPattern {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.Construct(builder);
        Computer computer = builder.getComputer();
        computer.print();
    }

}
