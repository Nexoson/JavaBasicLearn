package com.max.learn.面试.三大特性.多态.案例06;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName Test.java
 * @Description 测试类
 * @createTime 2020年11月04日 23:19:00
 */
public class Test {

    public static void main(String[] args) {

    }

    @org.junit.Test
    public void test01(){
        Fu fu = new Fu(45,"张三");
        fu.skill();
        Zi zi = new Zi(25,"张果");
        zi.skill();
    }

    @org.junit.Test
    public void test02(){
        Fu fu = new Zi(25,"张果");
        if( fu instanceof Fu){
            System.out.println("父类实例");
        }else{
            System.out.println("子类实例");
        }
/*        System.out.println(fu.name);
        System.out.println(fu.age);*/
        fu.skill();
    }
}
