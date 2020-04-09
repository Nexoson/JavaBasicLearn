package com.max.learn.集合相关.面试.题一;

import java.util.*;

/**
 * @ClassName Test01
 * @Auther huangX
 * @Date 2020/4/7 22:39
 * @Version 1.0
 * @Descripition TODO
 **/
public class Test01 {


    /**
     * 已知一个 HashMap<Integer，User>集合， User 有 name（String）和 age（int）属性。请写一个方法实现对
     * HashMap 的排序功能，该方法接收 HashMap<Integer，User>为形参，返回类型为 HashMap<Integer，User>，
     * 要求对 HashMap 中的 User 的 age 倒序进行排序。排序时 key=value 键值对不得拆散。
     **/
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(null);
        set.add(null);
        HashMap<Integer, User> map = new HashMap<>(20);
        map.put(1, new User("张三", 18));
        map.put(2, new User("李四", 17));
        map.put(3, new User("王五", 16));
        map.put(4, new User("赵六", 15));
        map.put(5, new User("田七", 22));
        map.put(6, new User("王八", 23));
        map.put(7, new User("黄九", 19));
        map.put(8, new User("周十", 20));


        HashMap<Integer, User> sortMap = sortHashMap(map);
        for (Integer key : sortMap.keySet()){
            System.out.println(key +"==>" + sortMap.get(key));
        }


    }

    public static HashMap<Integer, User> sortHashMap(HashMap<Integer, User> map) {
        // 首先拿到map的键值集合
        Set<Map.Entry<Integer, User>> entrySet = map.entrySet();

        // 将set集合转化为List集合,为什么,为了使用工具类的排序方法
        List<Map.Entry<Integer, User>> list = new ArrayList<>(entrySet);
        // 使用Collections集合工具类对list进行排序,排序规则
        Collections.sort(list, new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> o1, Map.Entry<Integer, User> o2) {
                // 按照要求根据User的age的倒序进行排序
                return -o1.getValue().compareTo(o2.getValue());
            }
        });
        // 创建一个新的有序的HashMap子类的集合
        LinkedHashMap<Integer, User> linkedHashMap = new LinkedHashMap<>(20);
        // 将List中的数据存储在linkedHashMap中
        for (Map.Entry<Integer,User> entry : list){
            linkedHashMap.put(entry.getKey(),entry.getValue());
        }

        return linkedHashMap;
    }

}
