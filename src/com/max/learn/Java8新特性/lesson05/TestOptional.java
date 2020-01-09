package com.max.learn.Java8新特性.lesson05;

import com.max.learn.Java8新特性.lesson01.Employee;
import jdk.nashorn.internal.runtime.options.Option;
import org.junit.Test;

import java.util.Optional;

/**
 * Optional容器类
 * Optional.of(T t): 创造一个Optional实例
 * Optional.empty(): 创建一个空的Optional实例
 * Optional.ofNullable(T t): 若t不为null, 创建Optional实例,否则创建空实例
 * isPresent(): 判断是否包含值
 * orElse(T t): 如果调用对象包含值,返回该值,否则返回t
 * orElseGet(Supplier s): 如果调用对象包含值,返回该值,否则返回s获取的值
 * map(Function f): 如果有值对其处理,并返回处理后的Optional,否则返回Optional.empty()
 * flatMap(Function mapper): 与map类似, 要求返回值必须是Optional
 */
public class TestOptional {


    @Test
    public void test01() {
        Optional<Employee> op = Optional.of(null);
        Employee emp = op.get();
        System.out.println(emp);
    }

    @Test
    public void test02() {
        Optional<Employee> op = Optional.empty();
        System.out.println(op.get());
    }

    @Test
    public void test03() {
        Optional<Employee> op = Optional.ofNullable(null);
        System.out.println(op.get());

        System.out.println("---------------------------");
        Employee emp = op.orElse(new Employee("张三", 888.8f, 18, Employee.Status.FREE));
        System.out.println(emp);

        System.out.println("--------参数为函数式接口(可加逻辑)---------");
        Employee newEmp = op.orElseGet(() -> new Employee());
        System.out.println(newEmp);
    }

    @Test
    public void test04() {
        Optional<Employee> op = Optional.ofNullable(new Employee("张三", 888.8f, 19, Employee.Status.BUSY));

        Optional<String> str = op.map((e) -> e.getName());
        System.out.println(str.get());

        Optional<String> str2 = op.flatMap((e) -> Optional.of(e.getName()));
        System.out.println(str2.get());
    }

    @Test
    public void test05() {
        // 以前写法
        Man man = new Man();
//        System.out.println(man.getGodNess().getName());  //会报空指针异常
        String str1 = getGodnessName(man);
        System.out.println("女神1: "+str1);

        System.out.println("------------新写法1-------------");
        NewMan newMan = new NewMan();
//        System.out.println(newMan.getGodNess().get().getName());  // java.util.NoSuchElementException: No value present

        System.out.println("------------新写法2-------------");
        Optional<GodNess> gn = Optional.ofNullable(null);
        Optional<NewMan> op = Optional.ofNullable(new NewMan(gn));
        String str2 = getGodnessName2(op);
        System.out.println("女神2: "+str2);
    }

    /**
     * 传统写法
     * @param man
     * @return
     */
    private String getGodnessName(Man man) {
        if(null != man){
            GodNess gn = man.getGodNess();
            if(null != gn){
                return gn.getName();
            }
        }
        return "水卜樱";
    }

    /**
     * Jdk1.8 后用Optional容器类
     * @param man
     * @return
     */
    private String getGodnessName2(Optional<NewMan> man) {
        return man.orElse(new NewMan())
                .getGodNess()
                .orElse(new GodNess("樱空桃子"))
                .getName();
    }
}
