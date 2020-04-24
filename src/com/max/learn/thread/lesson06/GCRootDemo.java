package com.max.learn.thread.lesson06;

/**
 * @author huangX
 * @version 1.0.0
 * @ClassName GCRootDemo.java
 * @Description 在Java中,可作为GC Roots的对象有
 * 1.虚拟机栈(栈帧中的本地变量表) 中引用的对象
 * 2.方法区中的类静态属性引用的对象
 * 3.方法区中常量引用的对象
 * 4.本地方法栈中JNI(即一般说的Native方法)中引用的对象
 * @createTime 2020年04月24日 17:00:00
 */
public class GCRootDemo {
    private byte[] bytesArray = new byte[100 * 1024 * 1024];

//    private static GCRootDemo02 t2; -> 2
//    private static final GCRootDemo03 t2 = new GCRootDemo03(8); -> 3

    public static void main(String[] args) {
        m1();
    }

    private static void m1() {
        GCRootDemo t1 = new GCRootDemo();
        System.gc();
        System.out.println("第一次GC完成");
    }

}
