package com.max.learn.Java8新特性.lesson05;

/**
 * old man
 */
public class Man {

    private String name;

    private GodNess godNess;

    public Man() {
    }

    public Man(String name, GodNess godNess) {
        this.name = name;
        this.godNess = godNess;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", godNess=" + godNess +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GodNess getGodNess() {
        return godNess;
    }

    public void setGodNess(GodNess godNess) {
        this.godNess = godNess;
    }
}
