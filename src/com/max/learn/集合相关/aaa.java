package com.max.learn.集合相关;

/**
 * @ClassName aaa
 * @Descripition 获取当前运行环境cpu的核心数
 * @Auther huangX
 * @Date 2019/8/18 20:53
 * @Version 1.0
 **/
public class aaa {
    public static void main(String[] args) {
        System.out.printf("当前主机核心数: "+Runtime.getRuntime().availableProcessors());
    }

}
