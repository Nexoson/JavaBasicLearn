package com.max.learn.Stream相关;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName TestBufferStream
 * @Descripition 缓冲流测试(處理流)
 * @Auther huangX
 * @Date 2019/10/24 22:02
 * @Version 1.0
 **/
public class TestBufferStream {

    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\writerTest.txt");
            // 在FileInputStram节点流的外面套接一层处理流BufferedInputStream
            BufferedInputStream bis = new BufferedInputStream(fis);
            int c = 0;
            System.out.println( (char)bis.read());
            // 在第100个字符处做一个标记
            bis.mark(100);
            for(int i=0; i<10 && (c = bis.read()) != -1; i++){
                System.out.println((char)c);
            }
            System.out.println();
            // 重新回到原来标记的地方
            bis.reset();
            for (int i = 0; i <= 10 && (c = bis.read()) != -1; i++) {
                System.out.print((char) c);
            }
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e1) {
           e1.printStackTrace();
        }
    }
}
