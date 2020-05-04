package com.max.learn.design_patterns.adapter_method;

/**
 * @ClassName AdvancedMediaPlayer
 * @Auther huangX
 * @Date 2020/5/4 16:14
 * @Version 1.0
 * @Descripition TODO
 **/
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);

    void playMp4(String fileName);
}