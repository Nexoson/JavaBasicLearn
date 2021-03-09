package com.max.learn.面试.深_浅拷贝;

/**
 * @author huangX huangxun@lidomtech.com
 * @version 1.0
 * @className ShallowCopyTest
 * @date 2021/3/9 15:35
 * @desc 参考: https://www.jianshu.com/p/94dbef2de298
 **/
public class ShallowCopyTest {

    public static void main(String[] args) {

        Subject subject = new Subject("math");
        Student studentA = new Student();
        studentA.setSubject(subject);
        studentA.setName("aaa");
        studentA.setAge(20);
        // 浅拷贝
        Student studentB = studentA;
        // 深拷贝
//        Student studentB = (Student) studentA.clone();
        studentB.setName("bbb");
        studentB.setAge(18);
        Subject subjectB = studentB.getSubject();
        subjectB.setName("Chinese");
        System.out.println("studentA:" +
                System.identityHashCode(studentA) + "-->" + studentA.toString());
        System.out.println("studentB:" +
                System.identityHashCode(studentB) + "-->" + studentB.toString());
    }

}
