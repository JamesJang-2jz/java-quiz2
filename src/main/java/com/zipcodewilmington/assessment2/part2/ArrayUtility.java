package com.zipcodewilmington.assessment2.part2;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        Integer[] totalArray = new Integer[array1.length + array2.length];
        System.arraycopy(array1,0,totalArray,0,array1.length);
        System.arraycopy(array2,0,totalArray,array1.length,array2.length);
        return totalArray;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        return null;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
