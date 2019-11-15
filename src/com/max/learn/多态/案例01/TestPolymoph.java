package com.max.learn.多态.案例01;

/**
 * @ClassName TestPolymoph
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/19 0:13
 * @Version 1.0
 **/
public class TestPolymoph {

    public static void main(String[] args) {
        
        /**
         * 在堆内存里面new一只蓝猫对象出来,这个蓝猫对象里面含有一个父类对象animal.
         **/
        Cat c = new Cat("Catname", "blue");


        /**
         * 在堆内存里面new了一只黑狗对象出来，这个黑狗对象里面包含有一个父类对象Animal.
         */
        Dog d = new Dog("Dogname","black");


        /**
         * 在堆内存里面new了一只小鸟对象出来，这个小鸟对象里面包含有一个父类对象Animal.
         **/
        Bird b = new Bird();


        /**
         * 在堆内存里面new出来3个小姑娘，名字分别是l1，l2，l3。
         * l1养了一只宠物是c(Cat)，l2养了一只宠物是d(Dog)，l3养了一只宠物是b(Bird)。
         * 注意：调用Lady类的构造方法时，传递过来的c，d，b是当成Animal来传递的，
         * 因此使用c，d，b这三个引用对象只能访问父类Animal里面的enjoy()方法。
         **/
        Lady l1 = new Lady("11",c);
        Lady l2 = new Lady("12",d);
        Lady l3 = new Lady("13",b);


        /**
         * 这三个小姑娘都调用myPetEnjoy()方法
         **/
        l1.myPetEnjoy();
        l2.myPetEnjoy();
        l3.myPetEnjoy();






    }
}
