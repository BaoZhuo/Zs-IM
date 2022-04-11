package com.zs.common.route.impl.consistenthash;

import com.zs.common.route.Router;
import com.zs.common.route.algorithm.TreeMapConsistentHash;

import java.util.List;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/10 9:26 下午
 */
public class ConsistentHashRouter implements Router {


    private TreeMapConsistentHash hash = new TreeMapConsistentHash();

    @Override
    public String chooseServer(List<String> values, String key) {
        return null;
    }
}
