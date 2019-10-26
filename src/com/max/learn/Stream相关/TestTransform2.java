package com.max.learn.Stream相关;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName TestTransform2
 * @Descripition 转换流测试2
 * @Auther huangX
 * @Date 2019/10/24 23:04
 * @Version 1.0
 **/
public class TestTransform2 {

    public static void main(String[] args) {

        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            //System.in这里的in是一个标准的输入流，用来接收从键盘输入的数据
            BufferedReader br = new BufferedReader(isr);
            String s = null;
            // 使用readLine()方法把读取到的一行字符串保存到字符串变量S中去
            s = br.readLine();
            while(s != null){
                // 把保存在内存s中的字符串打印出来
                System.out.println(s.toUpperCase());
                s = br.readLine();
                if(s.equalsIgnoreCase("exit")){
                    //只要输入exit循环就结束，就会退出
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
