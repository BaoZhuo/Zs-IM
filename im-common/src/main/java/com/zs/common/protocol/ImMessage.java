package com.zs.common.protocol;

import lombok.*;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/10 9:08 下午
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ImMessage {

    private String ip;

    private Integer httpPort;

    private Integer socketPort;
}
