package com.max.learn.Java8新特性.lesson05;

/**
 * 女神
 */
public class GodNess {

    private String name;

    public GodNess() {
    }

    public GodNess(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "GodNess{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
