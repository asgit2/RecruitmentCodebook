package Nasdaq;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

//Group all the ASCII character in a string or array of caracter

public class Solution3 {

        public List<String> groupCharacters(String text) {

        Map<Character, Integer> map = new TreeMap<>();

        // Count occurrences
        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<String> result = new ArrayList<>();

        // Build grouped strings in ASCII order
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }

            result.add(sb.toString());
        }

        return result;
    }
    
}

//Input: "Banana"
//Output: ["B", "aaa", "nn"]
//'B' (ASCII 66)
//'a' (ASCII 97)
//'n' (ASCII 110)