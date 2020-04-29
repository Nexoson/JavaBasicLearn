package com.max.learn.面试.Stream相关;

import java.io.*;

/**
 * @ClassName TestBufferStream1
 * @Descripition 缓冲流测试(處理流)
 * @Auther huangX
 * @Date 2019/10/24 22:24
 * @Version 1.0
 **/
public class TestBufferStream1 {


    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Administrator\\Desktop\\writerTest.txt"));
            //在节点流FileWriter的外面再套一层处理流BufferedWriter
            String s = null;
            for(int i=0;i<100;i++){
                //“Math.random()”将会生成一系列介于0～1之间的随机数。
                s = String.valueOf(Math.random());
                // static String valueOf(double d)这个valueOf()方法的作用就是把一个double类型的数转换成字符串
                //valueOf()是一个静态方法，所以可以使用“类型.静态方法名”的形式来调用
                //把随机数字符串写入到指定文件中
                bw.write(s);
                //调用newLine()方法使得每写入一个随机数就换行显示
                bw.newLine();
            }
            //调用flush()方法清空缓冲区
            bw.flush();

            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Administrator\\Desktop\\writerTest.txt"));
            //在节点流FileReader的外面再套一层处理流BufferedReader
            while((s = br.readLine())!=null){
                //使用BufferedReader处理流里面提供String readLine()方法读取文件中的数据时是一行一行读取的
                //循环结束的条件就是使用readLine()方法读取数据返回的字符串为空值后则表示已经读取到文件的末尾了。
                System.out.println(s);

            }
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
