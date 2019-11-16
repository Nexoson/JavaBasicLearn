package com.max.learn.多态.案例05;

/**
 * @ClassName Test
 * @Descripition 招商笔试题
 * @Auther huangX
 * @Date 2019/11/15 21:43
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {

        Base obj = new Sub();
        System.out.println(obj.x);
        System.out.println(obj.getX());

        // Base.x= 1
        // Sub.x= 3
        // 2
        // 4


    }

    public static class Base {

        int x =1;
        public Base(){
            this.echo();
            this.x=2;
        }

        private void echo() {
            System.out.println("Base.x= " + this.x);
        }

        public int getX(){
            return  this.x;
        }
    }

    public static class Sub extends Base{

        int x = 3;

        public Sub(){
            this.echo();
            this.x = 4;
        }

        public void echo(){
            System.out.println("Sub.x=" + this.x);
        }

        public  int getX(){
            return  this.x;
        }
    }
}
