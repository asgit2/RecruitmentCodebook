package Nasdaq;

import java.util.Collections;
import java.util.List;

public class Solution2 {

    //Given a list of digits (0–9), return the largest number that can be formed using all the digits.
    public int compute(List<Integer> digits) {

        // Sort in descending order
        digits.sort(Collections.reverseOrder());

        int result = 0;

        for (int digit : digits) {
            result = result * 10 + digit;
        }

        return result;
    }
    
}
