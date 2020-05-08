package com.max.learn.测试;

import com.max.learn.面试.参数传递.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName TestDemo04
 * @Auther huangX
 * @Date 2020/5/8 12:17
 * @Version 1.0
 * @Descripition iterator迭代器
 **/
public class TestDemo04 {

    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>(16);
        list.add(new Person("张三", "男", 16));
        list.add(new Person("李四", "女", 13));
        list.add(new Person("王五", "男", 16));
        list.add(new Person("赵六", "男", 21));
        list.add(new Person("田七", "女", 16));
        list.add(new Person("田七", "男", 17));
        list.add(new Person("王八", "女", 19));


//        for (Person p : list){
//            if (p.getName().equalsIgnoreCase("田七")){
//                list.remove(p);
//            }
//        }

//        for(int i=0; i<list.size(); i++){
//            if (list.get(i).getName().equalsIgnoreCase("田七")){
//                System.out.println(list.size());
//                list.remove(i);
//                System.out.println(list.size());
//            }
//        }

        Iterator<Person> iterator = list.iterator();

        while (iterator.hasNext()) {
            Person per = iterator.next();
            if (per.getName().equalsIgnoreCase("田七")) {
//                list.remove(per);  关键点 调用list.remove()方法导致modCount和expectedModCount的值不一致。 注意，像使用for-each进行迭代实际上也会出现这种问题。
                iterator.remove();
            }
        }
        list.forEach(p ->
                System.out.println(p.getName() + " 性别: " + p.getSex() + " 年龄: " + p.getAge())
        );
    }

    @Test
    public void test01() {

    }

}
