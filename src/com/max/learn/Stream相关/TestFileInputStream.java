package com.max.learn.Stream相关;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName TestFileInputStream
 * @Descripition FileInputStream流来读取数据
 * @Auther huangX
 * @Date 2019/10/24 20:27
 * @Version 1.0
 **/
public class TestFileInputStream {

    public static void main(String[] args) {
        // 使用变量b来装调用read()方法时返回的整数
        int b = 0;
        FileInputStream in = null;
        // 使用FileInputStream流来读取有中文的内容时，读出来的是乱码，因为使用InputStream流里面的read()方法读取内容时是一个字节一个字节地读取的，而一个汉字是占用两个字节的，所以读取出来的汉字无法正确显示。
//         FileReader in = null;
        // 使用FileReader流来读取内容时，中英文都可以正确显示，因为Reader流里面的read()方法是一个字符一个字符地读取的，这样每次读取出来的都是一个完整的汉字，这样就可以正确显示了。

        try {
            in = new FileInputStream("D:\\idea_center1\\JavaBasicLearn\\src\\com\\max\\learn\\测试\\TestDemo02.java");
//            in = new FileReader("C:\\Users\\Administrator\\Desktop\\2020年4月备考课程.png");

        } catch (FileNotFoundException e) {
            System.out.println("系统找不到指定文件!");
            e.printStackTrace();
            // 系统非正常退出
            System.exit(-1);
        }
        // 使用变量num来记录读取到的字符数
        long num = 0;

        try {
            while( (b = in.read()) != -1){
                // 调用int read() throws Exception方法时，返回的是一个int类型的整数
                // 循环结束的条件就是返回一个值-1，表示此时已经读取到文件的末尾了。
                // System.out.print(b+"\t");//如果没有使用“(char)b”进行转换，那么直接打印出来的b就是数字，而不是英文和中文了
                System.out.println(b);
//                System.out.println((char)b);
                num++;
            }
            // 关闭输入流
            in.close();
            System.out.println();
            System.out.println("总共读取了" + num + "个字节的文件");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件读取错误！");
        }


    }
}
