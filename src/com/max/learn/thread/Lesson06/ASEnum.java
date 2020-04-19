package com.max.learn.thread.Lesson06;


/**
 * @Author huangX
 * @Date 11:41 2020/4/19
 * @Param
 * @return
 * @Description 春秋战国枚举类
 **/
public enum ASEnum {

    ONE(1, "齐"),
    TWO(2, "楚"),
    THREE(3, "燕"),
    FOUR(4, "韩"),
    FIVE(5, "赵"),
    SIX(6, "魏");


    private Integer index;
    private String country;

    ASEnum(Integer index, String country) {
        this.index = index;
        this.country = country;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static ASEnum getASCountry(int num) {
        ASEnum[] values = ASEnum.values();
        for (ASEnum country : values) {
              if (num == country.getIndex()){
                  return country;
              }
        }
        return null;
    }
}
