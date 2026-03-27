import java.io.*;
import java.util.*;

class featuredProduct {

    public static String featuredProduct(List<String> products) {
        
        // Count frequency
        Map<String, Integer> countMap = new HashMap<>();
        
        for (String p : products) {
            countMap.put(p, countMap.getOrDefault(p, 0) + 1);
        }

        // Find max frequency
        int max = Collections.max(countMap.values());

        // Collect products with max frequency
        List<String> candidates = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == max) {
                candidates.add(entry.getKey());
            }
        }

        // Sort alphabetically
        Collections.sort(candidates);

        // return last product
        return candidates.get(candidates.size() - 1);
    }
}