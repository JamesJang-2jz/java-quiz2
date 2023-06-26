package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] totalArray = new Integer[array1.length + array2.length];
        System.arraycopy(array1,0,totalArray,0,array1.length);
        System.arraycopy(array2,0,totalArray,array1.length,array2.length);
        return totalArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        index = index % array.length;
        if (index < 0){
            index = array.length + index;
        }
        Integer[] result = Arrays.copyOf(array, array.length);
        for (int i = 0; i < index; i++) {
            Integer first = result[0];
            System.arraycopy(result, 1, result, 0, result.length-1);
            result[result.length-1] = first;
        }
        return result;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        Integer result = 0;
        Integer[] combined = Stream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .toArray(size -> (Integer[]) Array.newInstance(array1.getClass().getComponentType(), size));
        for (Integer i : combined) {
            if (i == valueToEvaluate){
                result++;
            }
        }
        return result;
    }

    public Integer mostCommon(Integer[] array) {
        Arrays.sort(array);
        int maxCount = 1, res = array[0];
        int currentCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]){
                currentCount++;
            } else {
                currentCount = 1;
            }
            if (currentCount > maxCount){
                maxCount = currentCount;
                res = array[i - 1];
            }
        }
        return res;
    }
}
