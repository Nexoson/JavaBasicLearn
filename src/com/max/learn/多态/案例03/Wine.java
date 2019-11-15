package com.max.learn.多态.案例03;

/**
 * @ClassName Wine
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/15 20:03
 * @Version 1.0
 **/
public class Wine {

    public String name;

    public Wine() {
    }

    public Wine(String name) {
        this.name = name;
    }

    public void drink(){
        System.out.println("我喝了 "+getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
