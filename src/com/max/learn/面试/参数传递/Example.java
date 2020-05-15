package com.max.learn.面试.参数传递;

/**
 * @ClassName Example
 * @Auther huangX
 * @Date 2020/5/15 14:46
 * @Version 1.0
 * @Descripition TODO
 **/
public class Example {
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {
/*
        Example ex = new Example();
        ex.change(ex.str,ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);

        System.out.println();
        System.out.println(getValue(2));
*/

        int m[] = {0, 1, 2, 3, 4, 5, 6};
        System.out.println(m.length);
    }

    private void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'g';
    }

    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
}
