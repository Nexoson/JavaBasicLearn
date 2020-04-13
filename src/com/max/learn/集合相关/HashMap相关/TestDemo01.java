package com.max.learn.集合相关.HashMap相关;


import java.util.HashMap;

/**
 * @ClassName TestDemo01
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/8/18 20:55
 * @Version 1.0
 **/
public class TestDemo01 {
    // HashMap的key存对象时,要注意什么?
    // 如果自定义对象作为 Map 的键，那么必须重写 hashCode 和 equals

    // HashMap 中的 hashcode https://jingyan.baidu.com/article/915fc414b9d0bf51384b204a.html

    static final int MAXIMUM_CAPACITY = 1 << 30;

    public static void main(String[] args) {

        HashMap<Person,String> hashMap = new HashMap<>(129);

        int maxValue = Integer.MAX_VALUE;
        System.out.println(MAXIMUM_CAPACITY);
        System.out.println(maxValue);

        int i = 16 >> 1;
//        System.out.println(i);
//        System.out.println(16 << 1);

        Person p1 = new Person("张三",18, "1");
        Person p2 = new Person("李四",18, "1");
        Person p3 = new Person("王五",18, "1");
        Person p4 = new Person("赵六",18, "1");
        Person p5 = new Person("田七",18, "1");

        hashMap.put(p1,"aaa");
        hashMap.put(p1,"bbb");
        hashMap.put(p2,"bbb");
        hashMap.put(p3,"ccc");
        hashMap.put(p4,"ddd");
        hashMap.put(p5,"eee");

        String s = hashMap.get(p1);
        System.out.println(s);
        for(Person key : hashMap.keySet()){
            System.out.println(key + "-->" + hashMap.get(key));
        }


        hashMap.keySet();
        String str1 = "abc";
        String str2 = "bbb";
        boolean flag = str1.equals(str2);


/*        int cap = 65;
        int n = cap - 1;
        n |= n >>> 1;
        System.out.println("n >>> 1 ="+ (n >>> 1) + " n ="+ n + " n |= n >>> 1="+(n |= n >>> 1));
        n |= n >>> 2;
        System.out.println("n >>> 1 ="+ (n >>> 1) + " n ="+ n + " n |= n >>> 1="+(n |= n >>> 1));
        n |= n >>> 4;
        System.out.println("n >>> 1 ="+ (n >>> 1) + " n ="+ n + " n |= n >>> 1="+(n |= n >>> 1));
        n |= n >>> 8;
        System.out.println("n >>> 1 ="+ (n >>> 1) + " n ="+ n + " n |= n >>> 1="+(n |= n >>> 1));
        n |= n >>> 16;
        System.out.println("n >>> 1 ="+ (n >>> 1) + " n ="+ n + " n |= n >>> 1="+(n |= n >>> 1));
        int num = (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
        System.out.println(num);*/

//        System.out.println(MAXIMUM_CAPACITY);
    }
}
