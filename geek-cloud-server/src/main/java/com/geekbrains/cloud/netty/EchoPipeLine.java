package com.geekbrains.cloud.netty;

import com.geekbrains.cloud.netty.handlers.EchoHandler;
import com.geekbrains.cloud.netty.handlers.FirstInHandler;
import com.geekbrains.cloud.netty.handlers.OutHandler;
import com.geekbrains.cloud.netty.handlers.SecondInHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

public class EchoPipeLine extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(
                new StringEncoder(),
                new StringDecoder(),
                new EchoHandler()
        );
    }
}
