package com.max.learn.Stream相关;

import java.io.Serializable;

/**
 * @ClassName T
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/10/24 23:27
 * @Version 1.0
 **/
public class T implements Serializable {
    // Serializable的意思是可以被序列化的
    int i = 10;
    int j = 9;
    double d = 2.3;
//    int k = 15;
    transient int k = 15;
    // 在声明变量时如果加上transient关键字，那么这个变量就会被当作是透明的，即不存在。
}
