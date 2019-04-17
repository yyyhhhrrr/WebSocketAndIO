package com.yjhr.IOdemo.Server;

/**
 * @BelongsProject: IO_demo
 * @BelongsPackage: com.yjhr.IOdemo
 * @Author: yang
 * @CreateTime: 2019-04-16 13:53
 * @Description: AIO 服务端
 */
public class Server {
    private static int DEFAULT_PORT = 9001;
    private static AsyncServerHandler serverHandle;
    public volatile static long clientCount = 0;
    public static void start(){
        start(DEFAULT_PORT);
    }
    public static synchronized void start(int port){
        if(serverHandle!=null)
            return;
        serverHandle = new AsyncServerHandler(port);
        new Thread(serverHandle,"Server").start();
    }
    public static void main(String[] args){
        Server.start();
    }
}
