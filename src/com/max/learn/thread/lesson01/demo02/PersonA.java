package com.max.learn.thread.lesson01.demo02;

/**
 * @ClassName PersonA
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/9/27 21:10
 * @Version 1.0
 **/
public class PersonA extends Thread{
    Bank bank;
    String mode;

    public PersonA(Bank bank, String mode) {
        this.mode = mode;
        this.bank = bank;
    }

    @Override
    public void run() {
        while(bank.money >= 100){
            try {
                bank.outMoney(100,mode);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
