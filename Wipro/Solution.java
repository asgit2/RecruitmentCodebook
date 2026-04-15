import java.util.*;

public class Solution {

    public static void main(String[] args) {

        int k = 3;
        int n = 7;
        List<List<Integer>> result = combinationSum3(k, n);
        System.out.println(result);
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int start, int k, int target,
                                  List<Integer> current,
                                  List<List<Integer>> result) {

        if (k == 0 && target == 0) {
            result.add(new ArrayList<>(current));
            return;s
        }

        if (k < 0 || target < 0) return;

        for (int i = start; i <= 9; i++) {
            // Optimization (important)
            if (i > target) break;
            current.add(i);
            backtrack(i + 1, k - 1, target - i, current, result);
            current.remove(current.size() - 1); // backtrack
        }
    }
}