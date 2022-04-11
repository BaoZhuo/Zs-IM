package com.zs.route.api.pojo.com.zs.route.api.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.List;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/11 10:20 上午
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("用户下线请求体")
public class UserOfflineDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotBlank
    @ApiModelProperty(value = "userId", required = true)
    private List<String> userIds;
}
