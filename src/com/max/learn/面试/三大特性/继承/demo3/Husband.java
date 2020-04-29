package com.max.learn.面试.三大特性.继承.demo3;

/**
 * @ClassName Husband
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/14 22:43
 * @Version 1.0
 **/
public class Husband extends Person{
    private Wife wife;

    public Husband() {
        super("meidoudou");
        System.out.println("Husband Constrctor...");
    }

    public static void main(String[] args) {
        Husband husband = new Husband();
        husband.age = 27;
        husband.name = "Max";
        husband.sex = "Male";
        Person.display(husband);
    }
}
