package com.zs.common.route.impl.weight;

import com.zs.common.route.Router;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author zhishi
 * @version 1.0
 * @date 2022/4/10 9:43 下午
 */
public class RandomWeightRouter implements Router {

    private TreeMap<Double,String> weightMap = new TreeMap<>();

    @Override
    public String chooseServer(List<String> values, String key) {
        values.stream().forEach(serverStr -> {
            Double weight = Integer.valueOf(serverStr.split(":")[3]).doubleValue(); //weight
            Double lastWeight = weightMap.size() == 0 ? 0 : weightMap.lastKey().doubleValue();
            this.weightMap.put(weight + lastWeight, serverStr);
        });
        return select();
    }

    public String select() {
        //累加值 * 0~1 random number
        Double random = this.weightMap.lastKey() * Math.random();
        SortedMap<Double, String> tailMap = this.weightMap.tailMap(random, false);
        return this.weightMap.get(tailMap.firstKey());
    }


}
