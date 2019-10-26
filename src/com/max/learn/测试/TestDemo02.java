package com.max.learn.测试;

import java.util.HashSet;

/**
 * @ClassName TestDemo02
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/10/18 10:29
 * @Version 1.0
 **/
public class TestDemo02 {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>(100);
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        set.add("7");
        set.add("8");
        for(String str : set){
            System.out.println(str);
        }

    }
}
