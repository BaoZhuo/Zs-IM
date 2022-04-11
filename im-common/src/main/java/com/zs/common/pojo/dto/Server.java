package com.zs.common.pojo.dto;

import lombok.*;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/7 12:50 下午
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Server {

    private String ip;

    private Integer httpPort;

    private Integer socketPort;

}
