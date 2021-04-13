package com.max.learn.集合相关.List.chapter01;

import java.util.List;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className Person
 * @date 2021/4/1 14:03
 * @desc
 **/
public class Person {

    /**
     * 宠物
     **/
    List<Animal> pets;

    public Person(List<Animal> pets) {
        this.pets = pets;
    }

    public Person() {
    }


    public List<Animal> getPets() {
        return pets;
    }

    public void setPets(List<Animal> pets) {
        this.pets = pets;
    }
}
