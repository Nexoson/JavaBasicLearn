package com.max.learn.继承.面试题.题二;

/**
 * @ClassName Test
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/20 22:27
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {


        /**
         *
         **/

        // 多态
        Shape shape = new Circle();

        System.out.println(shape.name);
        shape.printType();
        shape.printName();

        /*
        * shape constructor
        * circle constructor
        * shape
        * this is circle
        * shape
        * */
    }

}

class Shape {
    public String name = "shape";

    public Shape(){
        System.out.println("shape constructor");
    }

    public void printType() {
        System.out.println("this is shape");
    }

    public static void printName() {
        System.out.println("shape final method");
    }

    static {
        System.out.println("load Shape");
    }
}

class Circle extends Shape {
    public String name = "circle";

    public Circle() {
        System.out.println("circle constructor");
    }

    public void printType() {
        System.out.println("this is circle");
    }

    public static void printName() {
        System.out.println("circle normal method");
    }
}

