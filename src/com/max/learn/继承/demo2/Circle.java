package com.max.learn.继承.demo2;

/**
 * @ClassName Circle
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/20 21:41
 * @Version 1.0
 **/
public class Circle extends Shape{

    private double radius;

    public Circle() {
        super("cicle");
    }

    public Circle(double radius) {
        super("cicle");
        this.radius = radius;
    }

    public Circle(String name, double radius) {
        super(name);
        this.name = name;
        this.radius = radius;
    }
}
