package com.max.learn.design_patterns.adapter_method;

/**
 * @ClassName AudioPlayer
 * @Auther huangX
 * @Date 2020/5/4 16:22
 * @Version 1.0
 * @Descripition 让音乐播放器增加视频播放功能
 **/
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // 播放mp3音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);

        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }

    }
}
