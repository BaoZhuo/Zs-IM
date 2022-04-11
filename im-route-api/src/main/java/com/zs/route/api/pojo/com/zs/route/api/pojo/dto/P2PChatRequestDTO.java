package com.zs.route.api.pojo.com.zs.route.api.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/11 10:19 上午
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("点对点聊天请求体")
public class P2PChatRequestDTO {

    @NotBlank
    @ApiModelProperty(value = "token", required = true)
    private String token;

    @NotBlank
    @ApiModelProperty(value = "toUserId", required = true)
    private String toUserId;

    @NotBlank
    @ApiModelProperty(value = "msg", required = true)
    private String msg;
}
