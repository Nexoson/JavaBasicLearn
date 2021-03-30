package com.max.learn.面试.final关键字.lesson01;

import com.max.learn.Java8新特性.lesson06.MyClass;
import org.junit.Test;

/**
 * @ClassName Test
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/27 21:57
 * @Version 1.0
 **/
public class Demo01 {

    public static void main(String[] args) {




/*        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = c.intern();*/

    }


    @Test
    public void test01() {
        String a = "hello2";
        final String b = "hello";
        String d = "hello";
        String c = b + 2;
        String e = d + 2;

        System.out.println(a == c);
        System.out.println(a == e);

        /**
         * final变量是基本数据类型以及String类型时，如果在编译期间能知道它的确切值，
         * 则编译器会把它当做编译期常量使用。也就是说在用到该final变量的地方，相当
         * 于直接访问的这个常量，不需要在运行时确定。这种和C语言中的宏替换有点像。
         * 因此在上面的一段代码中，由于变量b被final修饰，因此会被当做编译器常量，
         * 所以在使用到b的地方会直接将变量b 替换为它的  值。而对于变量d的访问却需要
         * 在运行时通过链接来进行。想必其中的区别大家应该明白了，不过要注意，只有在
         * 编译期间能确切知道final变量值的情况下，编译器才会进行这样的优化,比如test02()的这段代码就不会进行优化
         **/
    }


    @Test
    public void test02() {
        String a = "hello2";
        final String b = getHello();
        String c = b + 2;
        System.out.println((a == c));
    }

    public static String getHello() {
        return "hello";
    }


    @Test
    public void test03() {
        final MyClass myClass = new MyClass();
        System.out.println(++myClass.i);
        /**
         * final 修饰class 只是说该类的引用不能指向新的对象,但是类的普通属性可以被修改, 如 public int i = 0;
         **/
    }

    class MyClass {
        public int i = 0;
    }

}
