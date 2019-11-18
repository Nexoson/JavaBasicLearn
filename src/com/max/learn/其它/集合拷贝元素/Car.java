package com.max.learn.其它.集合拷贝元素;

/**
 * @ClassName Car
 * @Descripition TODO
 * @Auther huangX
 * @Date 2019/11/18 21:20
 * @Version 1.0
 **/
public class Car {
    // 品牌
    private String brand;
    // 车辆级别
    private String level;
    // 车辆型号
    private String model;
    // 价格
    private Float price;

    public Car(String brand, String level, String model, Float price) {
        this.brand = brand;
        this.level = level;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
