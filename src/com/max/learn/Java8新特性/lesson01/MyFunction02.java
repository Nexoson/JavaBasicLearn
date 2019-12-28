package com.max.learn.Java8新特性.lesson01;

/**
 *
 */
@FunctionalInterface
public interface MyFunction02<T, R> {
    public R getValue(T t1, T t2);
}
