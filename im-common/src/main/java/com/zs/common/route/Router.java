package com.zs.common.route;

import java.util.List;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/10 9:11 下午
 */
public interface Router {

    String chooseServer(List<String> values, String key);
}
