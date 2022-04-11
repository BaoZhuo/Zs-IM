package com.zs.common.pojo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/7 12:51 下午
 */

@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private String userID;

    private String userName;

    private String mobile;

}
