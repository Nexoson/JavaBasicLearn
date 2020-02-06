package com.max.learn.thread.lesson01.demo02;

/**
 * @ClassName PersonB
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/9/27 21:14
 * @Version 1.0
 **/
public class PersonB extends Thread{
    Bank bank;

    String mode;

    public PersonB(Bank bank, String mode) {
        this.bank = bank;
        this.mode = mode;
    }

    public void run() {
        while (bank.money >= 200) {
            try {
                bank.outMoney(200, mode);
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
