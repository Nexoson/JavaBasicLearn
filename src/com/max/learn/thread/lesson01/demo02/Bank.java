package com.max.learn.thread.lesson01.demo02;


import java.util.Objects;

/**
 * @ClassName Bank
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/9/27 20:58
 * @Version 1.0
 **/
public class Bank {
    // 设置一个账户有1000元钱
    static double money = 1000;
    // 柜台Counter取钱的方法
    private void Counter(double money){
        Bank.money -= money;
        System.out.println("柜台取钱" + money + "元，还剩" + Bank.money + "元！");
    }
    private void ATM(double money){
        Bank.money -= money;
        System.out.println("ATM取钱" + money + "元，还剩" + Bank.money + "元！");
    }

    //提供一个对外取款途径，防止直接调取方法同时取款时，并发余额显示错误
    public synchronized void outMoney(double money, String mode) throws Exception {
            if(money > Bank.money){
                throw new Exception("取款金额"+money+",余额只剩"+Bank.money+"，取款失败");
            }
            if(Objects.equals(mode, "ATM")){
                ATM(money);
            } else {
                Counter(money);
            }
    }

}
