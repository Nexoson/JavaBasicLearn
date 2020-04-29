package com.max.learn.面试.面试题.实现栈;

import java.util.ArrayList;

/**
 * @ClassName ArrayToStack
 * @Auther huangX
 * @Date 2020/4/25 22:53
 * @Version 1.0
 * @Descripition 用数组来实现栈
 **/
public class ArrayToStack {

    public static void main(String[] args) {
        ArrayToStack myStack = new ArrayToStack(5);
        myStack.addFirst(1);
        myStack.addFirst(2);
        myStack.addFirst(3);
        myStack.addFirst(4);
        myStack.addFirst(5);

        System.out.println("栈是否为空: " + myStack.isEmpty());
        System.out.println("栈的长度: " + myStack.size());
        System.out.println("获取栈顶元素 " + myStack.peekFirst());
        System.out.println("删除栈顶元素: " + myStack.removeFirst());
        System.out.println("弹出栈顶元素: " + myStack.pollFirst());
        System.out.println("查询 " + 3 + "在栈中的位置为: " + myStack.search(3));


    }


    /**
     * 栈特点
     * 1.容量固定
     * 2.先进后出(有序)
     * 3.有压栈和弹栈两种方法
     * 4.有判断空方法
     * 5.有判断栈顶方法
     **/

    // 指定栈的初始容量
    private int capacity = 8;

    // 栈中元素数组
    private ArrayList<Object> myStack;

    // 初始化
    private ArrayToStack(int num) {
        this.capacity = num;
        this.myStack = new ArrayList<>(num);
    }

    private ArrayToStack() {
        this.myStack = new ArrayList<>(capacity);
    }

    /**
     * @return int
     * @Author huangX
     * @Date 23:40 2020/4/25
     * @Param
     * @Description 获取长度
     **/
    private int size() {
        return myStack.size();
    }

    /**
     * @return boolean
     * @Author huangX
     * @Date 23:09 2020/4/25
     * @Param
     * @Description 判断栈是否为空
     **/
    private boolean isEmpty() {
        return myStack.isEmpty();
    }


    /**
     * @return Object
     * @Author huangX
     * @Date 23:11 2020/4/25
     * @Param
     * @Description 获取栈顶元素
     **/
    private Object peekFirst() {
        if (!myStack.isEmpty()) {
            return myStack.get(0);
        }
        return null;
    }


    /**
     * @return Object
     * @Author huangX
     * @Date 23:13 2020/4/25
     * @Param
     * @Description 获得当前栈顶元素并删除
     **/
    private Object removeFirst() {
        Object obj;
        if (!myStack.isEmpty()) {
            obj = myStack.get(0);
            myStack.remove(obj);
            return obj;
        }
        return null;
    }


    /**
     * @return boolean
     * @Author huangX
     * @Date 23:24 2020/4/25
     * @Param obj
     * @Description 将元素添加到栈顶
     **/
    private boolean addFirst(Object obj) {

        if (myStack.size() < capacity) {
            myStack.add(obj);
            return true;
        }

        return false;
    }


    /**
     * @return Object
     * @Author huangX
     * @Date 23:33 2020/4/25
     * @Param
     * @Description 弹栈(删除栈中第一个元素)
     **/
    private Object pollFirst() {

        if (myStack.size() > 0) {
            return myStack.remove(0);
        }
        return null;
    }


    /**
     * @return Integer
     * @Author huangX
     * @Date 23:27 2020/4/25
     * @Param obj
     * @Description 查找元素在栈中的位置，由栈低向栈顶方向数
     **/
    private Integer search(Object obj) {

        if (myStack.contains(obj)) {
            return myStack.size() - 1 - myStack.indexOf(obj);
        }

        return null;
    }

}
