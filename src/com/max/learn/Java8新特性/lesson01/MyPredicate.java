package com.max.learn.Java8新特性.lesson01;

/**
 * @ClassName MyPredicate
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/12/19 23:35
 * @Version 1.0
 **/
public interface MyPredicate<T> {

    boolean test(T t);
}
