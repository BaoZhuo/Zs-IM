package com.zs.common.route.algorithm;

import io.netty.handler.codec.redis.SimpleStringRedisMessage;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/10 9:28 下午
 */
public class TreeMapConsistentHash {
    /**
     * 虚拟节点个数
     */

    private static final int VIRTUAL_NODE_SIZE = 4;

    /**
     * 红黑树
     */

    private TreeMap<Long, String>  tree = new TreeMap<>();

    public String choose(List<String> values, String key) {
        for (String value: values) {
            add(hash(value), value);
        }

        return selectNode(key);
    }


    private void add(long key, String value) {
        tree.clear();
        //虚拟节点
        for (int i = 0; i < VIRTUAL_NODE_SIZE; i++) {
            Long hash = this.hash("vir" + key + i);
            tree.put(hash, value);
        }
        tree.put(key, value);
    }

    private String selectNode(String value){
        long hash = hash(value);
        SortedMap<Long, String> after = tree.tailMap(hash);
        if (after != null && !after.isEmpty()) {

            String server = after.get(after.firstKey());
            System.out.println("路由成功：value: " + value + ", route server: " + server );
            return server;
        }
        return tree.firstEntry().getValue();



    }

    private Long hash(String  value){
        byte[] digest = DigestUtils.md5(value);

        // hash code  Truncate to 32-bits
        // hash code, Truncate to 32-bits
        long hashCode = ((long) (digest[3] & 0xFF) << 24) | ((long) (digest[2] & 0xFF) << 16) | ((long) (digest[1] & 0xFF) << 8) | (digest[0] & 0xFF);

        long truncateHashCode = hashCode & 0xffffffffL;

        return truncateHashCode;
    }




}
