package com.max.learn.面试.面试题.不可变对象;

/**
 * @ClassName Person
 * @Auther huangX
 * @Date 2020/5/20 14:27
 * @Version 1.0
 * @Descripition 演示容器丢失元素
 **/
public class Person {
    // 年龄
    private int age;
    // 身份证号码
    private String identityCardID;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentityCardID() {
        return identityCardID;
    }

    public void setIdentityCardID(String identityCardID) {
        this.identityCardID = identityCardID;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Person)) {
            return false;
        }
        Person personObj = (Person) obj;
        return this.age == personObj.getAge() && this.identityCardID.equals(personObj.getIdentityCardID());
    }

    @Override
    public int hashCode() {
        return age * 37 + identityCardID.hashCode();
    }
}
