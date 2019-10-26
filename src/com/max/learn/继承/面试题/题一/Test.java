package com.max.learn.继承.面试题.题一;

/**
 * @ClassName Test
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/20 21:57
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {
        new Circle();

/*        draw static method
          shape draw constructor
          shape constructor
          circle draw constructor
          circle constructor*/

/*        draw static method
        shape draw constructor
        shape constructor
        circle draw constructor
        circle constructor*/
    }

}

class Draw {
    static {
        System.out.println( "draw static method");
    }

    public Draw(String type) {
        System.out.println(type + " draw constructor");
    }
}

class Shape {

    private Draw draw = new Draw("shape");

    public Shape() {
        System.out.println("shape constructor");
    }
}

class Circle extends Shape {

    private Draw draw = new Draw("circle");

    public Circle() {
        System.out.println("circle constructor");
    }
}





