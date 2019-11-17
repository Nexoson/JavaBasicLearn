package com.max.learn.static关键字.案例01;

import java.sql.Date;

/**
 * @ClassName PersonWithStatic
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/6/28 22:21
 * @Version 1.0
 **/
public class PersonWithStatic {

    private Date birthDate;
    private static Date startDate,endDate;
    static{
        startDate = Date.valueOf("1946");
        endDate = Date.valueOf("1964");
    }

    public PersonWithStatic(Date birthDate) {
        this.birthDate = birthDate;
    }

    boolean isBornBoomer() {
        return birthDate.compareTo(startDate)>=0 && birthDate.compareTo(endDate) < 0;
    }
}
