package com.max.learn.测试;

/**
 * @ClassName TestDemo01
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/10/13 21:38
 * @Version 1.0
 **/
public class TestDemo01 {

    public static void main(String[] args) {
        int [] A = {25,34,256,9,38,47,128,256,64};
        int num = f30(A, 5);
        System.out.println(num);
    }

    static int f30(int[] A, int n){
        int m;
        if (n <= 0) return -1;
        if (n == 1) return 0;
        m = f30(A, n-1);
        if(A[m] > A[n-1]) return m;
        else return n-1;
    }
}