package com.zipcodewilmington.assessment2.part2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListUtility {
    List<Integer> list = new ArrayList<>();

    public void add(Integer i) {
      list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public String join() {
        String result = "";
        for (Integer i:list) {
            result += i;
            result += ", ";
        }
        return result.substring(0, result.length()-2);
    }

    public Integer mostCommon() {
        Map<Integer, Integer> countMap = new HashMap<>();
        Integer result = null;
        int maxCount = 0;
        for (Integer i :list) {
            int count = countMap.getOrDefault(i, 0) + 1;
            countMap.put(i, count);
            if (count > maxCount){
                maxCount = count;
                result  = i;
            }
        }
        return result;
    }

    public Boolean contains(Integer valueToAdd) {
        return list.contains(valueToAdd);
    }
}
