package com.max.learn.面试.面试题.不可变对象;

/**
 * @ClassName SynchronizedRGB
 * @Auther huangX
 * @Date 2020/5/20 13:50
 * @Version 1.0
 * @Descripition 可变对象,多线程操作有可能造成数据不一致
 **/
public class SynchronizedRGB {
    // 颜色对应的红色值
    private int red;
    // 颜色对应的绿色值
    private int green;
    // 颜色对应的蓝色值
    private int blue;
    // 颜色名称
    private String name;

    private void check(int red, int green, int blue) {
        if (red < 0 || red > 255 || green < 0 || green > 255
                || blue < 0 || blue > 255) {
            throw new IllegalArgumentException();
        }
    }

    public SynchronizedRGB(int red, int green, int blue, String name) {
        check(red,green,blue);
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.name = name;
    }

    public void set(int red, int green, int blue, String name){
        check(red,green,blue);
        synchronized (this){
            this.red = red;
            this.green = green;
            this.blue = blue;
            this.name = name;
        }
    }

    public synchronized int getRGB() {
        return ((red << 16) | (green << 8) | blue);
    }

    public synchronized String getName() {
        return name;
    }

}
