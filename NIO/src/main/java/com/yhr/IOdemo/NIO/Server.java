package com.yhr.IOdemo.NIO;

/**
 * @BelongsProject: IO_demo
 * @BelongsPackage: com.yhr.IOdemo.NIO
 * @Author: yang
 * @CreateTime: 2019-04-16 11:19
 * @Description: ${Description}
 */
public class Server {
    private static int DEFAULT_PORT = 9001;
    private static ServerHandler serverHandler;
    public static void start(){
        start(DEFAULT_PORT);
    }
    public static synchronized void start(int port){
        if(serverHandler!=null)
            serverHandler.stop();
        serverHandler = new ServerHandler(port);
        new Thread(serverHandler,"Server").start();
    }
    public static void main(String[] args){
        start();
    }
}