package Entegris;

import java.util.*;

public class MergeIntervals {

    public static List<int[]> merge(int[][] intervals) {

        // Sort based on start value
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {

            // If result is empty OR current interval does not overlap
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } 
            // Merge overlapping intervals
            else {
                result.get(result.size() - 1)[1] =
                        Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] input = {
                {1, 3},
                {2, 6},
                {8, 10},
                {9, 18}
        };

        List<int[]> output = merge(input);

        output.forEach(i ->System.out.println(Arrays.toString(i)));
    }
}