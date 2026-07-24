package Nasdaq;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] data = {7, 6, 4, 3, 3, 4, 9};
        int[] result = filterDuplicate(data);
        System.out.println(Arrays.toString(result));
    }

    public static int[] filterDuplicate(int[] data) {
    Set<Integer> set = new LinkedHashSet<>();

    for (int num : data) {
        set.add(num);
    }

    int[] result = new int[set.size()];
    int i = 0;
    for (int num : set) {
        result[i++] = num;
    }

    return result;
}
    
}
