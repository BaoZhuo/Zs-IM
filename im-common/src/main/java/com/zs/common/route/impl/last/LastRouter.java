package com.zs.common.route.impl.last;

import com.zs.common.route.Router;

import java.util.List;
import java.util.TreeMap;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/10 9:23 下午
 */
public class LastRouter implements Router {

    private TreeMap<Integer, String> map = new TreeMap();


    @Override
    public String chooseServer(List<String> values, String key) {
        values.stream().forEach(server -> {
            Integer weight = Integer.valueOf(server.split(":")[3]);

            map.put(weight,server);
        });

        return map.get(map.lastKey());
    }
}
