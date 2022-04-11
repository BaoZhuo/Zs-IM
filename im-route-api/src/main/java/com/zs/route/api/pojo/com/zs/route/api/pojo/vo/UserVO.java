package com.zs.route.api.pojo.com.zs.route.api.pojo.vo;

import lombok.*;

import java.io.Serializable;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/11 10:25 上午
 */
@Data
@Builder
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class UserVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userId;

    private String nickName;

    private String avatar;

}
