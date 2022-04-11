package com.zs.common.utils;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/10 9:45 下午
 */
public class Constants {

    /**
     * 消息类型
     */
    public interface CommandType {

        Integer LOGIN  = 1;

        Integer MSG = 2;

        Integer HEARTBEAT = 3;
    }

}
