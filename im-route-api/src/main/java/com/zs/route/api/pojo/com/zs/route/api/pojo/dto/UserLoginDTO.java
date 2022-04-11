package com.zs.route.api.pojo.com.zs.route.api.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/11 10:19 上午
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户登录请求体")
public class UserLoginDTO {

    @NotBlank
    @ApiModelProperty(name = "account" ,required = true)
    private String account;

    @NotBlank
    @ApiModelProperty(name = "password", required = true)
    private String password;

}
