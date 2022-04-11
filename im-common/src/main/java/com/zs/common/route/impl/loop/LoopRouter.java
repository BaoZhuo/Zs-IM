package com.zs.common.route.impl.loop;

import com.zs.common.exceptions.IMException;
import com.zs.common.route.Router;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/10 9:41 下午
 */
public class LoopRouter implements Router {

    private AtomicLong index = new AtomicLong();

    @Override
    public String chooseServer(List<String> values, String key) {
        if (values.size() == 0) {
            throw new IMException("servers is not available");
        }
        Long pos = index.incrementAndGet() % values.size();
        if (pos < 0) {
            pos = 0L;
        }
        return values.get(pos.intValue());
    }
}
