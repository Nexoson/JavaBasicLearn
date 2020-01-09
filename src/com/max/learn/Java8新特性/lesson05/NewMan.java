package com.max.learn.Java8新特性.lesson05;

import java.util.Optional;

/**
 * 新时代男性
 */
public class NewMan {

    private String name;
    private Optional<GodNess> godNess = Optional.empty();

    public NewMan() {
    }

    public NewMan(String name, Optional<GodNess> godNess) {
        this.name = name;
        this.godNess = godNess;
    }

    public NewMan(Optional<GodNess> godNess) {
        this.godNess = godNess;
    }

    @Override
    public String toString() {
        return "NewMan{" +
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

    public Optional<GodNess> getGodNess() {
        return godNess;
    }

    public void setGodNess(Optional<GodNess> godNess) {
        this.godNess = godNess;
    }
}
