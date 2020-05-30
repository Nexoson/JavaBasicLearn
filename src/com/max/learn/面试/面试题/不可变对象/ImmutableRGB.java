package com.max.learn.面试.面试题.不可变对象;

/**
 * @ClassName ImmutableRGB
 * @Auther huangX
 * @Date 2020/5/20 14:02
 * @Version 1.0
 * @Descripition 不可变对象
 **/
public class ImmutableRGB {

    private int red;
    private int green;
    private int blue;
    private String name;

    private void check(int red, int green, int blue) {
        if (red < 0 || red > 255 || green < 0 || green > 255
                || blue < 0 || blue > 255) {
            throw new IllegalArgumentException();
        }
    }

    public ImmutableRGB(int red, int green, int blue, String name) {
        check(red, green, blue);
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.name = name;
    }

    public ImmutableRGB set(int red, int green, int blue, String name) {
        return new ImmutableRGB(red, green, blue, name);
    }

    public int getRGB() {
        return ((red << 16) | (green << 8) | blue);
    }

    public String getName() {
        return name;
    }

}
