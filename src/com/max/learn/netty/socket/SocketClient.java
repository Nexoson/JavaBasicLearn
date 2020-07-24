package com.max.learn.netty.socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * @ClassName SocketClient
 * @Author huangX
 * @Date 2020/7/24
 * @Description Socket客户端
 */
public class SocketClient {

    public static void main(String[] args) throws IOException {
        // 连接指定ip地址的服务
        Socket socket = new Socket("192.168.0.106",8899);

        // 获取socket管道输入流
        InputStream input = socket.getInputStream();

        // 指定文件存放地址
        FileOutputStream fileOut = new FileOutputStream("E:\\temp\\aaa.pdf");

        byte[] fileBytes = new byte[128];
        while( input.read(fileBytes) != -1){
            fileOut.write(fileBytes);
        }

        fileOut.close();
        input.close();
        socket.close();
    }

}
