package com.max.learn.其它.Idea_debug相关;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DebugApp
 * @Auther huangX
 * @Date 2020/4/28 14:43
 * @Version 1.0
 * @Descripition IDEA debug案例
 **/
public class DebugApp {

    public static void main(String[] args) {

        // 进入断点
        int a = 10;
        HashMap<String, Integer> b = new HashMap<>();
        // variables
        b.put("a", 1);
        b.put("b", 1);
        b.put("c", 1);
        b.put("d", 1);
        b.put("e", 1);

        if (a > 5) {
            Car c = new Car();
            // 进入项目源码
            c.drive();
            // 强制进入底层代码, jar 源码, 依赖源码
            System.out.println("yes");
        }

        // debug过程中修改变量值
        if (a < 5) {
            System.out.println("no");
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : b.entrySet()) {
            String key = stringIntegerEntry.getKey();
            if ("a".equals(key)) {
                System.out.println(key + "--" + stringIntegerEntry.getValue());
                break;
            }
        }

        // 异常 自动断点
        b = null;
        System.out.println(b.size());
        System.out.println("=================我就是底线===================");
    }
}

class Car {
    public void drive() {
        System.out.println("开车 滴滴滴滴...");
    }
}
