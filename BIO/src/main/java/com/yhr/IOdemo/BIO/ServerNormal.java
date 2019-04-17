package com.yhr.IOdemo.BIO;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @BelongsProject: IO_demo
 * @BelongsPackage: PACKAGE_NAME
 * @Author: yang
 * @CreateTime: 2019-04-15 17:43
 * @Description: BIO服务端源码
 */
public class ServerNormal {

    private static int DEFAULT_PORT = 9001;
    //单例模式的serverSocket
    private static ServerSocket serverSocket;

    public static void start() throws IOException{
        start(DEFAULT_PORT);
    }

    public synchronized static void start(int port) throws IOException {
        if (serverSocket != null) {
            return;
        }
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("服务器已启动，端口号:" + port);
            while (true) {
                Socket socket = serverSocket.accept();
                //当有新的客户端接入时，会执行下面的代码
                //然后创建一个新线程处理这条Socket链路
                new Thread(new ServerHandler(socket)).start();
            }
        }finally {
            if(serverSocket!=null){
                System.out.println("服务器已关闭");
                serverSocket.close();
                serverSocket=null;
            }
        }
    }



}
