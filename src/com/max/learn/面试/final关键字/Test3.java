package com.max.learn.面试.final关键字;

/**
 * @ClassName Test3
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/27 23:51
 * @Version 1.0
 **/
public class Test3 {

    public static void main(String[] args) {
        MyClass1 myClass1 = new MyClass1();
        StringBuffer buffer = new StringBuffer("hello");
        myClass1.changeValue(buffer);
        System.out.println(buffer.toString());
    }


}


class MyClass1 {
    void changeValue(StringBuffer buffer){
        buffer.append(" world");
    }

}
