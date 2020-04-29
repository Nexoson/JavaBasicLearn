package com.max.learn.面试.static关键字.面试题;

/**
 * @ClassName Test
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/28 22:39
 * @Version 1.0
 **/
public class Test extends Base {

    static{
        System.out.println("test static");
    }

    public Test(){
        System.out.println("test constructor");
    }



    /**
     * 在执行main方法之前，必须先加载Test类，而在加载Test类的时候发现Test类继承自Base类，
     * 因此会转去先加载Base类，在加载Base类的时候，发现有static块，便执行了static块。
     * 在Base类加载完成之后，便继续加载Test类，然后发现Test类中也有static块，便执行static块。
     * 在加载完所需的类之后，便开始执行main方法。
     * 在main方法中执行new Test()的时候会先调用父类的构造器，然后再调用自身的构造器
     **/
    public static void main(String[] args) {
        new Test();

        // base static
        // test static
        // base constructor
        // test constructor
    }

}


class Base{
    static{
        System.out.println("base static");
    }

    public Base() {
        System.out.println("base constructor");
    }
}