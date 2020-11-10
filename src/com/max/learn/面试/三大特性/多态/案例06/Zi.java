package com.max.learn.面试.三大特性.多态.案例06;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName Zi.java
 * @Description 子类
 * @createTime 2020年11月04日 23:13:00
 */
public class Zi extends Fu{


    Zi(int age, String name) {
        super(age, name);
        System.out.println("子类构造");
    }

    @Override
    public void skill() {
        System.out.println(this.name + "会开坦克 this");
//        System.out.println(super.name + "会开坦克 super");
    }
}
