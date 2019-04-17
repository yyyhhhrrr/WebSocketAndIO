package com.yhr.IOdemo;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * @BelongsProject: IO_demo
 * @BelongsPackage: com.yhr.IOdemo
 * @Author: yang
 * @CreateTime: 2019-04-16 17:01
 * @Description: 存储整个工程的全局配置
 */
public class NettyConfig {

    /**
     * 存储每一个客户端进入时的channel对象
     */
    public static ChannelGroup group=new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
}
