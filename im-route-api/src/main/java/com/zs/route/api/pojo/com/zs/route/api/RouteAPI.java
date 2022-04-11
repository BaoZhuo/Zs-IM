package com.zs.route.api.pojo.com.zs.route.api;


import com.zs.common.pojo.Response;

import com.zs.route.api.pojo.com.zs.route.api.pojo.dto.UserLoginDTO;
import com.zs.route.api.pojo.com.zs.route.api.pojo.dto.UserOfflineDTO;
import com.zs.route.api.pojo.com.zs.route.api.pojo.vo.LoginVO;
import feign.Headers;
import feign.RequestLine;

import javax.validation.Valid;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/10 10:25 下午
 */
public interface RouteAPI {
    /**
     * 用户登录
     * @param message
     * @return
     */
    @RequestLine("POST /user/login")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Response<LoginVO> login(@Valid UserLoginDTO message);

    /**
     * 用户下线
     * @param param
     * @return
     */
    @RequestLine("POST /user/offline")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Response<Void> offline(@Valid UserOfflineDTO param);
}
