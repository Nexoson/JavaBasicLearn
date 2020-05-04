package com.max.learn.design_patterns.adapter_method;

/**
 * @ClassName AdapterPatternDemo
 * @Auther huangX
 * @Date 2020/5/4 16:26
 * @Version 1.0
 * @Descripition TODO
 **/
public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
