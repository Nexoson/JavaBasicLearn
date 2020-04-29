package com.max.learn.面试.Stream相关;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName TestFileOutputStream
 * @Descripition 写数据
 * @Auther huangX
 * @Date 2019/10/24 20:46
 * @Version 1.0
 **/
public class TestFileOutputStream {

    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("C:\\Users\\Administrator\\Desktop\\Spring学习笔记\\springboot笔记（pdf版）.pdf");
            out = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\springboot.pdf");
            // 指明要写入数据的文件，如果指定的路径中不存在TestFileOutputStream1.java这样的文件，则系统会自动创建一个
            while( (b=in.read()) != -1){
               out.write(b);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件读取失败");
            // 非正常退出
            System.exit(-1);
        }catch (IOException e) {
            System.out.println("文件复制失败！");
            System.exit(-1);
        }
        System.out.println("复制成功");
    }

}
