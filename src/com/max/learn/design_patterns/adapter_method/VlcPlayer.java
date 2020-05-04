package com.max.learn.design_patterns.adapter_method;

/**
 * @ClassName VlcPlayer
 * @Auther huangX
 * @Date 2020/5/4 16:15
 * @Version 1.0
 * @Descripition TODO
 **/
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
