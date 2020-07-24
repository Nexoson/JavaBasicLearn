package com.max.learn.netty.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName SocketServer
 * @Author huangX
 * @Date 2020/7/24
 * @Description Socket服务端
 */
public class SocketServer {

    public static void main(String[] args) throws IOException {

        // 初始化SocketServer, 对外暴露一个服务, ip地址为本机IP地址
        ServerSocket server = new ServerSocket(8899);
        // 监听是否有链接
        Socket socket = server.accept();
        System.out.println("与客户端连接成功");

        // socket管道输出流
        OutputStream out = socket.getOutputStream();

        // 读取指定地址文件
        File file = new File("D:\\Backup\\桌面\\HEAD_FIRST设计模式（中文版）.pdf");
        // 将文件转为字节流用于 网络传输
        InputStream fileIn = new FileInputStream(file);
        byte[] fileBytes =  new byte[128];
        while(fileIn.read(fileBytes) != -1){
            out.write(fileBytes);
        }
        out.close();
        fileIn.close();
        socket.close();
        server.close();
    }

}
