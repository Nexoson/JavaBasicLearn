package com.max.learn.多态.案例01;

/**
 * @ClassName Lady
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/19 0:12
 * @Version 1.0
 **/
public class Lady {

    private String name;
    private Animal pet;

    public Lady(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    public void myPetEnjoy(){
        pet.enjoy();
    }
}
