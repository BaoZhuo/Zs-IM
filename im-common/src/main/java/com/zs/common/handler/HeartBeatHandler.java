package com.zs.common.handler;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;

import java.nio.channels.Channel;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/7 12:55 下午
 */
public interface HeartBeatHandler {
    void process(ChannelHandlerContext context);
}
