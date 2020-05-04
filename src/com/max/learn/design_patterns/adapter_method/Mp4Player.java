package com.max.learn.design_patterns.adapter_method;

/**
 * @ClassName Mp4Player
 * @Auther huangX
 * @Date 2020/5/4 16:17
 * @Version 1.0
 * @Descripition TODO
 **/
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
