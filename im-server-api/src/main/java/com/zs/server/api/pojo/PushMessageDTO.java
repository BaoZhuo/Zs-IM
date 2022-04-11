package com.zs.server.api.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/10 10:02 下午
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class PushMessageDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String message;

    private String userId;

    private String fromUserId;

}
