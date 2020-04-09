package com.max.learn.其它.面试题.static执行顺序;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName Client.java
 * @Description TODO
 * @createTime 2020年03月15日 10:31:00
 */
public class Client {

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.running();
    }

}
