package com.max.learn.其它.面试题.static执行顺序;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName X.java
 * @Description TODO
 * @createTime 2020年03月15日 10:57:00
 */
public class X {
    Y y=new Y();
    static{
        System.out.println("X static");
    }
    {
        System.out.println("X normal");
    }
    X(){
        System.out.println("X construct");
    }

    public static void main(String[] args) {
        new Z();
      /*
      * X static
      * Z static
      * Y static
      * Y normal
      * Y construct
      * X normal
      * X construct
      * Y static  -- Y static 指挥执行一次
      * Y normal
      * Y construct
      * Z normal
      * Z construct
      * */

    }
}
