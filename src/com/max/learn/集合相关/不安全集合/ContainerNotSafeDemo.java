package com.max.learn.集合相关.不安全集合;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName Contain
 * @Auther huangX
 * @Date 2020/4/17 16:55
 * @Version 1.0
 * @Descripition 集合类不安全的问题
 * List, Set, Map解决方法大同小异, 只不过HashMap有一个并发集合ConcurrentHashMap
 **/
public class ContainerNotSafeDemo {

    public static void main(String[] args) {

//        List<String> list = Arrays.asList("a", "b", "c");
//        list.forEach(System.out::println);
        List<String> list = Collections.synchronizedList(new ArrayList<>());

        for (int i = 1; i <= 30; i++) {
            new Thread(() -> {
                list.add(UUID.randomUUID().toString().substring(0, 8));
                System.out.println(list);
            }, String.valueOf(i)).start();
        }




    /*
      1.故障现象
      java.util.ConcurrentModificationException 并发修改异常

      2.导致原因
        并发争抢修改导致,参考我们的花名册签名情况.
        一个人正在写入,另一个同学过来抢夺,导致数据不一致异常,并发修改异常
      3.解决方案
        3.1 可以用Vector,但是性能差
        3.2 用Collections.synchronizedList(new ArrayList<>());
      4.优化建议(同样的操作不犯2次)
     */

    }


    /**
     * @return List
     * @Author huangX
     * @Date 20:18 2020/4/17
     * @Param
     * @Description Vertor线程安全, 但是性能太差
     **/
    public List<String> getCurList1() {
        return new Vector<>();
    }


    /**
     * @return List
     * @Author huangX
     * @Date 20:18 2020/4/17
     * @Param
     * @Description 线程安全
     **/
    public List<String> getCurList2() {
        return Collections.synchronizedList(new ArrayList<>());
    }


    /**
     * @return List
     * @Author huangX
     * @Date 20:18 2020/4/17
     * @Param
     * @Description 线程安全
     **/
    public List<String> getCurList3() {
        return new CopyOnWriteArrayList<>();
    }

}
