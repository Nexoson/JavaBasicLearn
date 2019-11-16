package com.max.learn.参数传递;

public class TransferTest02 {

      public static void main(String[] args) {
                 Person person = new Person();
                 person.setAge(18);
                 System.out.println(person);
//                 System.out.println(person.getAge());
                 change(person);
//                 changeAge(person);
//                 System.out.println(person.getAge());
             }

              public static void change(Person p) {
                  System.out.println(p);
                  p = new Person();
                  System.out.println(p);
             }

             public static void changeAge(Person p){
                 System.out.println(p);
                 p.setAge(25);
             }

}
