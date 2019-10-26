package com.max.learn.thread.demo02;

/**
 * @ClassName MainClass
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/9/27 21:16
 * @Version 1.0
 **/
public class MainClass {
    public static void main(String[] args) {
        Bank bank = new Bank();
        // 实例化两个人，传入同一个银行的对象
        PersonA a = new PersonA(bank, "Counter");
        PersonB b = new PersonB(bank, "ATM");
        a.start();
        b.start();
    }
}
