package com.zs.common.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/7 10:37 上午
 */

@Data
@NoArgsConstructor
@ToString
public class Response<T>  implements Serializable {
    private static final long serialVersionUID = 1L;


    private static final String OK = "ok";
    private static final String FAIL = "fail";

    private Integer success;
    private String message;

    private T data;


    public Response(Integer success, String message, T data){
        this.success = success;
        this.message = message;
        this.data = data;
    }

    public static Response sucess(){
        return new Response(1,OK,null);
    }

    public static Response success(Object data){
        return new Response(1,OK,data);
    }

    public static Response failure(){
        return new Response(0,FAIL,null);
    }

    public static Response failure(String message){
        return new Response(0,message,null);
    }
}
