package com.zs.server.api;

import com.zs.common.pojo.Response;
import com.zs.server.api.pojo.PushMessageDTO;

import java.net.URI;

import feign.Headers;
import feign.RequestLine;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/10 10:02 下午
 */
public interface ServerAPI {
    /**
     * 发送消息
     * @param message
     * @return
     */
    @RequestLine("POST /pushMsg")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Response pushMessage(URI uri, PushMessageDTO message);
}
