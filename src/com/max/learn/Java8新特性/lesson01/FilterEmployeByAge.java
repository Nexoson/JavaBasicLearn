package com.max.learn.Java8新特性.lesson01;

/**
 * @ClassName FilterEmployeByAge
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/12/19 23:36
 * @Version 1.0
 **/
public class FilterEmployeByAge implements MyPredicate<Employee>{
    public int num;

    public FilterEmployeByAge(int num) {
        this.num = num;
    }

    @Override
    public boolean test(Employee employee) {
        return employee.getAge() >= this.num;
    }
}
