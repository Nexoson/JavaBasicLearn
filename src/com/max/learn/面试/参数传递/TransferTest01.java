package com.max.learn.面试.参数传递;

public class TransferTest01 {

    public static void main(String[] args) {

        int num = 1;
        System.out.println("num= "+num);
        changeNum(num);
        System.out.println("num= "+num);

    }

    public static void changeNum(int x){
        x = 3;
    }

}
