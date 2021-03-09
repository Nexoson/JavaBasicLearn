package com.max.learn.面试.深_浅拷贝;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className Subject
 * @date 2021/3/9 15:26
 * @desc
 **/
public class Subject implements Cloneable{

    private String name;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Subject 如果也有引用类型的成员属性,也应该和Student类一样实现
        return super.clone();
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                '}';
    }
}
