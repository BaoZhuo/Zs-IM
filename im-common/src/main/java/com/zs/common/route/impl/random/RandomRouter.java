package com.zs.common.route.impl.random;

import com.zs.common.exceptions.IMException;
import com.zs.common.route.Router;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/10 9:42 下午
 */
public class RandomRouter implements Router {
    @Override
    public String chooseServer(List<String> values, String key) {
        int size = values.size();
        if (size == 0) {
            throw new IMException("servers is not available");
        }
        int offset = ThreadLocalRandom.current().nextInt(size);
        return values.get(offset);
    }
}
