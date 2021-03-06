package com.max.learn.面试.volatile关键字;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @ClassName AtomicReferenceDemo
 * @Auther huangX
 * @Date 2020/4/16 17:49
 * @Version 1.0
 * @Descripition TODO
 **/
class User{
    String userName;
    int age;

    public User(String userName, int age) {
        this.userName = userName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class AtomicReferenceDemo {

    public static void main(String[] args) {

        User z3 = new User("z3",22);
        User li4 = new User("li4", 25);

        AtomicReference<User> atomicReference = new AtomicReference<>();
        atomicReference.set(z3);

        System.out.println(atomicReference.compareAndSet(z3,li4)+ "\t"+atomicReference.get().toString());
        System.out.println(atomicReference.compareAndSet(z3,li4)+ "\t"+atomicReference.get().toString());



    }

}
