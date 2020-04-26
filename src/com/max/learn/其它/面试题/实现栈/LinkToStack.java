package com.max.learn.其它.面试题.实现栈;

import java.io.Serializable;

/**
 * @ClassName LinkToStack
 * @Auther huangX
 * @Date 2020/4/26 11:05
 * @Version 1.0
 * @Descripition 用链表来实现栈
 **/
public class LinkToStack<E> implements Serializable, Cloneable {


    public static void main(String[] args) {
        LinkToStack<String> myStack = new LinkToStack<>();
        myStack.addFirst("中国");
        myStack.addFirst("威武");
        myStack.addFirst("盛世");

        myStack.remove("威武");
        myStack.removeFirst();
        System.out.println(myStack.peekFirst());
        System.out.println(myStack.size());
        System.out.println(myStack.isEmpty());

    }

    // 初始长度
    private transient int capacity = 0;
    // 首节点
    private transient MyNode<E> first;
    // 尾结点
    private transient MyNode<E> last;

    private LinkToStack() {
    }


    // 栈的长度
    private int size() {
        if (first == null) {
            return 0;
        }
        int num = 1;
        for (MyNode<E> x = first; x.next != null; x = x.next) {
            num++;
        }
        return num;
    }

    // 判断空
    private boolean isEmpty() {
        return first == null;
    }

    // 获取栈顶元素
    private E peekFirst() {
        if (null != first) {
            return first.item;
        }
        return null;
    }

    // 获得当前栈顶元素并删除(弹栈)
    private E removeFirst() {
        E obj;
        if (first != null) {
            obj = first.item;
            remove(first.item);
            return obj;
        }
        return null;
    }

    // 将元素添加到栈顶
    private boolean addFirst(Object obj) {
        try {
            if (null != first) {
                MyNode<E> node = new MyNode<E>((E) obj, null, first);
                first.prev = node;
                first = node;
                capacity++;
                return true;
            }
            first = new MyNode<>(null, null, null);
            first.item = (E) obj;
            capacity++;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // 删除任意节点数据
    private boolean remove(Object obj) {

        // 两种情况
        // obj为null
        if (null == obj) {
            for (MyNode<E> x = first; x.next != null; x = x.next) {
                if (null == x.item) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (MyNode<E> k = first; k.next != null; k = k.next) {
                if (obj.equals(k.item)) {
                    unlink(k);
                    return true;
                }
            }
        }


        return false;
    }

    // 删除链表中指定的元素
    private E unlink(MyNode<E> x) {

        E item = x.item;

        // x为链表首
        if (null == x.prev) {
            first = x.next;
            x.next.prev = null;
            // x为链表中
        } else if (null != x.next) {
            x.prev.next = x.next;
            // x为链表尾
        } else {
            last = x.prev;
            x.prev.next = null;
        }
        x.item = null;
        x.next = null;
        x.prev = null;
        capacity--;

        return item;
    }


    /**
     * 栈特点
     * 1.容量固定
     * 2.先进后出(有序)
     * 3.有压栈和弹栈两种方法
     * 4.有判断空方法
     * 5.有判断栈顶方法
     **/
}

class MyNode<E> {
    // Node存储元素
    E item;
    // Node 前节点
    MyNode<E> prev;
    // Node 下节点
    MyNode<E> next;

    public MyNode(E item, MyNode<E> prev, MyNode<E> next) {
        this.item = item;
        this.prev = prev;
        this.next = next;
    }
}
