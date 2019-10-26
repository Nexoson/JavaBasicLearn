package com.max.learn.static关键字;


import java.sql.Date;

/**
 * @ClassName Person
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/28 22:17
 * @Version 1.0
 **/
public class Person {

    private Date birthDate;

    public Person(Date birthday) {
        this.birthDate = birthday;
    }

    boolean isBornBoomer(){
        Date startDate = Date.valueOf("1946");
        Date endDate = Date.valueOf("1964");
        return birthDate.compareTo(startDate)>=0 && birthDate.compareTo(endDate) < 0;
    }
}
