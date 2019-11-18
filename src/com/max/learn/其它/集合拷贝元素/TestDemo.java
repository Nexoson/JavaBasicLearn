package com.max.learn.其它.集合拷贝元素;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName TestDemo02
 * @Descripition 验证集合之间拷贝元素,对原集合数据有没有影响
 * @Auther huangX
 * @Date 2019/11/18 21:23
 * @Version 1.0
 **/
public class TestDemo {
    public static List<Car> list1;
    public static void main(String[] args) {
        List<Car> list2 = new ArrayList<>(10);
        for (Car c :list1) {
            System.out.print(c.getBrand()+" ");
            System.out.println(c.getModel());
            if ("铃木".equals(c.getBrand())){
                list2.add(c);
            }
        }
        System.out.println();
        list2.get(0).setModel("超级维特拉");
        for (Car c :list1) {
            System.out.print(c.getBrand()+" ");
            System.out.println(c.getModel());
        }

    }
    static {
        list1 = new ArrayList<>(10);
        list1.add(new Car("本田","紧凑型","思域",13.0f));
        list1.add(new Car("铃木","小型SUV","维特拉",12.0f));
        list1.add(new Car("标致","两厢车","308S",13.0f));
    }
}
