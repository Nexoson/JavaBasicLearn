package com.max.learn.Stream相关;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @ClassName TestTransform1
 * @Descripition 转换流测试
 * @Auther huangX
 * @Date 2019/10/24 22:54
 * @Version 1.0
 **/
public class TestTransform1 {

    public static void main(String[] args) {

        /**
        * 转换流非常的有用，它可以把一个字节流转换成一个字符流，转换流有两种，
        * 一种叫InputStreamReader，另一种叫OutputStreamWriter。InputStream是字节流，
        * Reader是字符流，InputStreamReader就是把InputStream转换成Reader。
        * OutputStream是字节流，Writer是字符流，OutputStreamWriter就是把OutputStream转换成Writer。
        * 把OutputStream转换成Writer之后就可以一个字符一个字符地通过管道写入数据了，
        * 而且还可以写入字符串。我们如果用一个FileOutputStream流往文件里面写东西，
        * 得要一个字节一个字节地写进去，但是如果我们在FileOutputStream流上面套上
        * 一个字符转换流，那我们就可以一个字符串一个字符串地写进去。
        */
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\writerTest.txt"));
            // 把字符串写到指定的文件夹中去
            osw.write("MircosoftsunIBMOracleApplet");
            // 使用getEncoding()方法取得当前系统的默认字符编码
            System.out.println(osw.getEncoding());
            osw.close();
            osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\Desktop\\writerTest.txt",true),"ISO8859_1");
            // 如果在调用FileOutputStream的构造方法时没有加入true，那么新加入的字符串就会替换掉原来写入的字符串，在调用构造方法时指定了字符的编码
            // 再次向指定的文件写入字符串，新写入的字符串加入到原来字符串的后面
            osw.write("MircosoftsunIBMOracleApplet");
            System.out.println(osw.getEncoding());
            osw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
