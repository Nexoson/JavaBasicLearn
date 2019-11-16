package com.max.learn.多态.案例04;

/**
 * @ClassName Test
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/15 20:28
 * @Version 1.0
 **/
public class Test {

    public static void main(String[] args) {

        A a1 = new A(); // A 实例
        A a2 = new B(); // B 实例向上转型 实际上是A的实例对象 调A的非private属性的方法, 若A中方法被B重写,则调自己的方法
        B b = new B(); // B 的实例
        C c = new C(); // C 的实例
        D d = new D(); // D 的实例

        System.out.println("1--> " + a1.show(d));
        System.out.println("2--> " + a1.show(c));
        System.out.println("3--> " + a1.show(b));
        System.out.println();
        System.out.println("4--> " + a2.show(d));
        System.out.println("5--> " + a2.show(c));
        System.out.println("6--> " + a2.show(b));
        System.out.println();
        System.out.println("7--> " + b.show(d));
        System.out.println("8--> " + b.show(c));
        System.out.println("9--> " + b.show(b));

        // A and D
        // A and A
        // A and A

        // A and D
        // B and A
        // B and A

        // A and D
        // B and B
        // B and B


        // 解析
        // this.show(O)、 super.show(O)、 this.show((super)O)、 super.show((super)O)。
        // 多态的话，有子类实现的方法就必须用子类的方法
    }
}
